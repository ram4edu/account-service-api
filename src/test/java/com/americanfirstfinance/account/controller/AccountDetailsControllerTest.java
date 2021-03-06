package com.americanfirstfinance.account.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AccountDetailsControllerTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/poc/accounts/ILXX")
          .then()
             .statusCode(200);
    }

}