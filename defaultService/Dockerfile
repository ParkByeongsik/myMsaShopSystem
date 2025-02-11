FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} default.jar
ENTRYPOINT ["java","-jar","/default.jar"]