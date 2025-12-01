package org.joinfaces.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;

/**
 * @author Lars Grefer
 */
@SpringBootApplication
@ServletComponentScan
public class JarExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JarExampleApplication.class, args);
    }
}
