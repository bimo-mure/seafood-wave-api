FROM maven:3.8.4-openjdk-17-slim
WORKDIR /app
COPY target/seafood-wave-api.jar /app/seafood-wave-api.jar
EXPOSE 8080
CMD ["java", "-jar", "seafood-wave-api.jar"]