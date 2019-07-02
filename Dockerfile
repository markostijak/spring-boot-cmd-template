FROM openjdk:11.0.3-jre-slim-stretch

ARG JAR

ADD target/${JAR} /app/application.jar

ENTRYPOINT ["java", "-jar", "/app/application.jar"]
