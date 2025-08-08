# # Use Eclipse Temurin OpenJDK base image (Java 17 or change if needed)
# FROM eclipse-temurin:17-jdk-alpine

# # Set working directory
# WORKDIR /app

# # Copy Maven wrapper and pom.xml files first to leverage caching
# COPY mvnw .
# COPY .mvn .mvn
# COPY pom.xml .

# # Download dependencies
# RUN ./mvnw dependency:go-offline

# # Copy all source code
# COPY . .

# # Package the application
# RUN ./mvnw clean package -DskipTests

# # Run the jar file (replace with actual jar name if needed)
# CMD ["java", "-jar", "target/ecommerce-0.0.1-SNAPSHOT.jar"]

# Use JDK 21 as base image
FROM eclipse-temurin:21-jdk AS build

# Set working directory
WORKDIR /app

# Copy all project files
COPY . .

# Make mvnw executable
RUN chmod +x mvnw

# Build the app (skip tests to speed up)
RUN ./mvnw clean package -DskipTests

# Use a smaller base image to run the app
FROM eclipse-temurin:21-jre

# Set working directory
WORKDIR /app

# Copy jar from build stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]