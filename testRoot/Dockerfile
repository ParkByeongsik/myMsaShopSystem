FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} root.jar
ENTRYPOINT ["java","-jar","/root.jar"]