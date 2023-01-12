package de.fhws.health;

import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@Startup
@ApplicationScoped
public class ServiceStartupHealthCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {

        return HealthCheckResponse.named(ServiceStartupHealthCheck.class.getSimpleName()).withData("startup",true).up().build();

    }
}
