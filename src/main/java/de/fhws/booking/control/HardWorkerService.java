package de.fhws.booking.control;

import java.time.temporal.ChronoUnit;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;

public class HardWorkerService {
	static int counter = 0;

	@Retry(maxRetries = 3, delay = 100 )
	public String serviceAIsWorkingTimeByTime() {
		System.out.println("start Service A");
		if (++counter % 3 == 0) {
			// Simulate network failures
			System.out.println("Service A is NOT working");
			throw new RuntimeException("service A cannot complete its job");
		}

		String message = "job done in Service A!";
		System.out.println(message);
		return message;
	}


	@Fallback(fallbackMethod = "serviceCFallback")
	@Timeout(value = 1, unit = ChronoUnit.SECONDS)
	public String serviceC() {
		System.out.println("start Service C");
		if (counter++ % 3 == 0) {
			// simulate slow network traffic
			// slow network is not accepted
			try {
				System.out.println("slow network");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

		String message = "job done in Service C!";
		System.out.println(message);
		return message;
	}

	public String serviceCFallback() {
		System.out.println("execute fallback");
		return "serviceCFallback";
	}

}
