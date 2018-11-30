# Project requirements:

1. Java 1.8
2. Spring 4.1.8.RELEASE
3. Spring Boot 1.2.7.REELEASE
4. Hibernate JPA 
5. MySQL connector 5.1.46
6. Tomcat 7.0.59
7. AngularJS v1.7.2 (https://angularjs.org/)
8. Bootstrap v4.1.3 (https://getbootstrap.com/)
9. (Not implemented) Spring AOP 4.1.8
10. (Not implemented) Spring Security

# Database schema

DROP DATABASE IF EXISTS sportRecord;
CREATE DATABASE sportRecord DEFAULT CHARACTER SET utf8;

USE sportRecord;

FLUSH PRIVILEGES;


# Next features
1. Write some JUnit test for few Repository class
2. Setup AOP to make AddEvent without problem
3. Setup Spring Security and implement inMemory Users
