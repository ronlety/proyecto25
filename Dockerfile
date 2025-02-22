FROM docker.io/khipu/openjdk:17-alpine

LABEL maintainer="Lety Rojas <ronlety@gmail.com>"

EXPOSE 8089

ARG WAR_FILE=target/*.war

COPY target/*.war app.war

CMD ["java", "-jar", "/app.war"]
