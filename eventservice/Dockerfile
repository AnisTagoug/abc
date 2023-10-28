FROM openjdk:8
ADD target/event-service.jar event-service.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "event-service.jar"]
