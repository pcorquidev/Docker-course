# Stage 1: Build
FROM maven:3.8.3-jdk-8-slim AS builder
WORKDIR /app
COPY dockerapp/pom.xml .
RUN mvn dependency:go-offline
COPY dockerapp/src/ /app/src/
RUN mvn package

#Stage 2: Produccion
FROM openjdk:8-jre-slim AS production
WORKDIR /app
COPY --from=builder /app/target/dockerapp-0.0.1-SNAPSHOT.jar /app/dockerapp-0.0.1-SNAPSHOT.jar

EXPOSE 8090
CMD ["java", "-jar", "dockerapp-0.0.1-SNAPSHOT.jar", "--spring.datasource.url=jdbc:postgresql://192.168.1.81:5432/mydb", "--spring.datasource.username=user", "--spring.datasource.password=admin"]