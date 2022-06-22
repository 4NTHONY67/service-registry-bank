FROM openjdk:11
VOLUME /tmp
EXPOSE 8082
ADD ./target/service-registry-bank-0.0.1-SNAPSHOT.jar service-registry-bank.jar
ENTRYPOINT ["java","-jar","service-registry-bank.jar"]