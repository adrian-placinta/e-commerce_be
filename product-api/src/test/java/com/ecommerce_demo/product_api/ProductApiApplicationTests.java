package com.ecommerce_demo.product_api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.testcontainers.containers.MySQLContainer;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductApiApplicationTests {

    @LocalServerPort
    private int port;

    private static final MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:latest");

    @BeforeAll
    static void beforeAll() {
        mySQLContainer.start();
    }

    @AfterAll
    static void afterAll() {
        mySQLContainer.stop();
    }

    @BeforeEach
    void beforeEach() {
        RestAssured.baseURI = "http://localhost:" + port;
    }

    @Test
    void shouldCreateProduct() {
        String saveProduct = """
                {
                    "name": "Wireless Mouse",
                    "description": "A smooth and responsive wireless mouse for everyday use.",
                    "price": 29.99
                }
                """;

        RestAssured
                .given()
                .body(saveProduct)
                .contentType(ContentType.JSON)
                .when()
                .post("/api/product/")
                .then()
                .statusCode(HttpStatus.SC_CREATED);
    }
}
