# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .

# Go into the correct module to build the jar
RUN mvn -f Security/pom.xml clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app

# Copy the built jar file to /app
COPY --from=builder /app/Security/target/cloud-vendor-rest-api-0.0.1-SNAPSHOT.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
