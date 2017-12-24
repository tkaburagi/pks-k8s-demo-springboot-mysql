FROM openjdk:jdk-alpine
VOLUME /tmp
RUN mkdir /app
WORKDIR /app
ENV JAVA_OPTS=""
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar demo.jar" ]