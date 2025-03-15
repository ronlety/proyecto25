FROM openjdk:17-oracle

LABEL maintainer="Lety Rojas <ronlety@gmail.com>"

EXPOSE 8089

ARG WAR_FILE=target/*.war

COPY target/*.war app.war

CMD ["java", "-jar", "/app.war"]
