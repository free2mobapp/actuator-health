# Overview

## Configutation
. . . by default, only the health status is exposed over an unauthenticated HTTP connection. If you are happy for complete health information to always be exposed you can set endpoints.health.sensitive to false.

Solution is to set endpoints.health.sensitive to false in application.properties.

application.properties

endpoints.health.sensitive=false
For >1.5.1 application.properties

management.security.enabled=false
At Spring Boot 2.0.0.RELEASE (thx @rvit34 and @nisarg-panchal):

management:
endpoint:
health:
show-details: "ALWAYS"
endpoints:
web:
exposure:
include: "*"
management.endpoints.web.exposure.include=* exposes all endpoints, if that is what you want.

Current documentation can be found here: https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html
# Reference

https://stackoverflow.com/questions/32971182/spring-boot-health-not-showing-details-withdetail-info
https://fabianlee.org/2022/06/29/java-adding-custom-health-indicator-to-spring-boot-actuator/

Kafka HealthCheck - https://medium.com/dna-technology/kafka-consumers-health-check-in-spring-boot-actuator-d00f9017e89d
another health Indicator - https://www.baeldung.com/spring-boot-health-indicators

actuator doc: https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints.kubernetes-probes

Composite Health check - https://reflectoring.io/spring-boot-health-check/