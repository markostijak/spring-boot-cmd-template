FROM openjdk:14.0.1

ARG JAR

ADD target/${JAR} /app/application.jar

ENTRYPOINT ["java", "-jar", "/app/application.jar"]
