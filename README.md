# fhws22-booking

## Setup / Init


- https://rieckpil.de/bootstrap-a-jakarta-ee-8-maven-project-with-java-11-in-seconds/

	mvn archetype:generate -DarchetypeGroupId=de.rieckpil.archetypes -DarchetypeArtifactId=jakartaee8 -DarchetypeVersion=1.0.0  -DgroupId=de.fhws -DartifactId=booking -DinteractiveMode=false

Action to fix eclipse warning: add `maven-war-plugin`


## MP Config 

	buildAndRun.bat
	
Example: different message

	docker rm -f fhws22-booking && docker run -d -p 9080:9080 -p 9443:9443 -e message=hello --name fhws22-booking de.fhws/fhws22-booking
	
## MP OpenAPI

Documentation

## Metrics

see MetricController

OpenLiberty user/password see server.xml (duke/dukeduke)

- https://openliberty.io/guides/microprofile-metrics.html#adding-the-annotations

- https://localhost:9443/metrics/application

- Prometheus with Grafana -> https://www.bogotobogo.com/DevOps/Docker/Docker_Prometheus_Grafana.php


## HealthCheck


- https://javaeeblog.wordpress.com/2019/01/27/alles-gesund-health-checking-mit-microprofile-health/
- http://www.mastertheboss.com/soa-cloud/openshift/managing-microprofile-health-checks/

- https://openliberty.io/guides/microprofile-health.html

Result:

- http://localhost:9080/health
- http://localhost:9080/health/live
- http://localhost:9080/health/ready

OpenLiberty

- ./buildAndRun.bat
- open http://localhost:9080/resources/sample
- http://localhost:9080/openapi
- http://localhost:9080/openapi/ui/