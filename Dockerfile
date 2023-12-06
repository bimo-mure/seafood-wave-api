FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean install

FROM adoptopenjdk:17-jdk-hotspot
WORKDIR /app
COPY --from=builder /app/target/seafood-wave-api.jar .
CMD ["java", "-jar", "seafood-wave-api.jar"]