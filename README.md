# fhws22-booking

## Setup / Init


- https://rieckpil.de/bootstrap-a-jakarta-ee-8-maven-project-with-java-11-in-seconds/

	mvn archetype:generate -DarchetypeGroupId=de.rieckpil.archetypes -DarchetypeArtifactId=jakartaee8 -DarchetypeVersion=1.0.0  -DgroupId=de.fhws -DartifactId=booking -DinteractiveMode=false

Action to fix eclipse warning: add `maven-war-plugin`


## MP Config 

	buildAndRun.bat
	
Example: different message

	docker rm -f fhws22-booking && docker run -d -p 9080:9080 -p 9443:9443 -e message=hello --name fhws22-booking de.fhws/fhws22-booking
	
