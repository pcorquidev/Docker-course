# Stage 1: Build
FROM maven:3.8.3-jdk-11-slim AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src/ /app/src/
RUN mvn package

# Second stage: Run tests
FROM maven:3.8.3-jdk-11 as test
WORKDIR /app
COPY --from=builder /app/target/test-classes /app/test-classes
COPY --from=builder /app/target/classes /app/classes
CMD ["mvn", "test"]


# Stage 3: Production
FROM openjdk:11-jre-slim AS production
WORKDIR /app
COPY --from=builder /app/target/my-app-1.0-SNAPSHOT.jar /app/my-app-1.0-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/my-app-1.0-SNAPSHOT.jar"]