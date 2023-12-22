FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/seafood-wave-api.jar seafood-wave-api.jar
EXPOSE 8080
CMD ["java", "-jar", "seafood-wave-api.jar"]