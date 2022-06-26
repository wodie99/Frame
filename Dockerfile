FROM openjdk:17

ENV ENVIRONMENT=prod

LABEL maintainer="wodie99@wodie.net"

ADD backend/target/app.jar app.jar

CMD [ "sh", "-c", "java -Dserver.port=$PORT -jar /app.jar" ]