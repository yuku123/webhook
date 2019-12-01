FROM java:8
VOLUME /tmp
COPY target/webhook-0.0.1-SNAPSHOT.jar demo.jar
RUN bash -c "touch /demo.jar"
EXPOSE 7000
ENTRYPOINT ["java","-jar","demo.jar"]