# JoinFaces Gradle Jar Example

![Java CI with Gradle](https://github.com/joinfaces/joinfaces-gradle-jar-example/workflows/Java%20CI%20with%20Gradle/badge.svg?branch=master)

Usages:
  - Can be started via its `main`-method using an embedded Tomcat
    - Using `java -jar`
    - Using `./gradlew bootRun`
    - Using your IDE
  - Can be tested using `@SpringBootTest(webEnvironment = RANDOM_PORT)`
    - Using `./gradlew test`
    - Using your IDE

When using an embedded Tomcat, the application should be available at http://localhost:8080/index.xhtml
