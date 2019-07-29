FROM openjdk

VOLUME /tmp
ADD maven/empservices-version1.0.jar empservices.jar
RUN sh -c 'touch /empservices.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/empservices.jar"]