#FROM maven:3.8.5-openjdk-17 AS build
#COPY . .
#RUN mvn clean package -DskipTests
#
#FROM openjdk:17.0.1-jdk-slim
#COPY --from=build /target/finalproject-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/finalproject-0.0.1-SNAPSHOT.jar app.jar



CMD ["java", "-jar", "app.jar"]