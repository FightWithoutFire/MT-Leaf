FROM adoptopenjdk/openjdk8-openj9:alpine-slim

WORKDIR /vulivuli/automation

EXPOSE 8080

ADD ./target/leaf.jar /app.jar

ADD ./deploy/boot.sh /boot.sh

RUN sh -c 'chmod +x /boot.sh'

RUN sh -c 'touch /app.jar'

ENV JAVA_OPTS=""

ENV SPRING_PROFILES_ACTIVE="test"

ENTRYPOINT [ "sh", "-c", "/boot.sh" ]