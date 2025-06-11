# Step 1: Build the application
FROM maven:3.8.5-openjdk-17 AS builder

WORKDIR /app

# Copy only the Security module (where pom.xml is located)
COPY Security /app

RUN mvn clean package -DskipTests

# Step 2: Run the application
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built jar from the previous stage
COPY --from=builder /app/target/cloudvendor-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
