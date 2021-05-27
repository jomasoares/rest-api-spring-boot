# Spring Boot Rest API

Template project in Java 11 for learning purposes. This project uses the following dependencies:
* [**Spring Boot Dev tools**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [**Spring Boot Web**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [**Lombok**](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [**JPA**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
* [**PostgreSQL JDBC Driver**](https://mvnrepository.com/artifact/org.postgresql/postgresql)

I also intend to use in upcoming versions:

* [**Spring Security**](https://mvnrepository.com/artifact/org.springframework.security/spring-security-core) 

## Getting Started

1. Configure the database url, password and username in /src/main/resources/application.properties
1. Run the project:
    * If you have Maven installed, run ***mvn spring-boot:run*** in the command line
    * If you don't, you can use the **mvnw** file for Linux or **mvnw.cmd** for Windows and the same argument: *spring-boot:run*. Both files are in the root directory.
