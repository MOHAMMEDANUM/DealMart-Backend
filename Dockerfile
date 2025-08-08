# Use Eclipse Temurin OpenJDK base image (Java 17 or change if needed)
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml files first to leverage caching
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy all source code
COPY . .

# Package the application
RUN ./mvnw clean package -DskipTests

# Run the jar file (replace with actual jar name if needed)
CMD ["java", "-jar", "target/ecommerce-0.0.1-SNAPSHOT.jar"]