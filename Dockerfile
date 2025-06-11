# Stage 1: Build the application using Java 21
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

# Copy the Security module into the container
COPY . .

# Build the Spring Boot app
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

# Copy the built jar from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
