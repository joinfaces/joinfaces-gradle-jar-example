package org.joinfaces.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Lars Grefer
 */
@SpringBootTest(
        classes = JarExampleApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class JarExampleApplicationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHelloFromSpring() {
        ResponseEntity<String> entity = restTemplate.getForEntity("/index.xhtml", String.class);

        assertThat(entity.getStatusCode().is2xxSuccessful()).isTrue();

        assertThat(entity.getBody()).contains("Hello from Spring:");
    }
}