# Step 1: Build the application
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Run the application
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/cloud-vendor-rest-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
