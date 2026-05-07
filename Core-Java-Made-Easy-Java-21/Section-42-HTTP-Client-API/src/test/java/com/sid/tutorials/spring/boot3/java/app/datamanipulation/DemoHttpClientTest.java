package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 08-05-2026
 */
@DisplayName("DemoHttpClient Test")
class DemoHttpClientTest {
    DemoHttpClient demoHttpClient;

    @BeforeEach
    void setUp() {
        demoHttpClient = new DemoHttpClient();
    }

    @Test
    void http2ClientRequest() {
        try {
            demoHttpClient.http2ClientRequest();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void http2POSTClientRequest() {
        try {
            demoHttpClient.http2POSTClientRequest();
        } catch (IOException | InterruptedException e) {}
    }
}