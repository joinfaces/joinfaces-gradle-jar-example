package org.joinfaces.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lars Grefer
 */
@SpringBootApplication
public class JarExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JarExampleApplication.class, args);
        
        // Hint: with the default setup no welcome-page is configured,
        // so opening the root path "/" results in a 404 error
        // The URL has to include the page name as well, even for index.xhtml
        Logger.getLogger(TestPrimefacesApplication.class.toString()).
                info("Example page available at http://localhost:8080/index.xhtml");

    }
}
