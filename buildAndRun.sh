#!/bin/sh
mvn clean package && docker build -t de.fhws/fhws22-booking .
docker rm -f fhws22-booking || true && docker run -d -p 9080:9080 -p 9443:9443 --name fhws22-booking de.fhws/fhws22-booking