FROM openjdk:17
COPY target/event-notification-system.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
