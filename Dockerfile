FROM maven:3.8.3-openjdk-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean install

FROM adoptopenjdk:17-jre
WORKDIR /app
COPY --from=builder /app/target/seafood-wave-api.jar .
CMD ["java", "-jar", "seafood-wave-api.jar"]