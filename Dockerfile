FROM eclipse-temurin:17-alpine
LABEL authors="vassilb"
WORKDIR /app
COPY target/myapp-devops-final-project-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]