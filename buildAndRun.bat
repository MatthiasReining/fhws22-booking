@echo off
call mvn clean package
call docker build -t de.fhws/fhws22-booking .
call docker rm -f fhws22-booking
call docker run -d -p 9080:9080 -p 9443:9443 --name fhws22-booking de.fhws/fhws22-booking