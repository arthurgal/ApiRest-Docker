FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/demo

COPY /target/demo*.jar demo.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 8080
EXPOSE 5005

CMD java ${ADDITIONAL_OPTS} -jar demo.jar --spring.profiles.actives=${PROFILE}