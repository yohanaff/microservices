FROM openjdk:17

WORKDIR /app

COPY target/discovery-service.jar /app/discovery-service.jar

EXPOSE 8761

CMD ["java", "-jar", "discovery-service.jar"]
