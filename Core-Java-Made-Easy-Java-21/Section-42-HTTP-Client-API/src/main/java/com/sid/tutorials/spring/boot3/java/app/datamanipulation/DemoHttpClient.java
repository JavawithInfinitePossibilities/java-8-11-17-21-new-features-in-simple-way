package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author kunmu On 08-05-2026
 * For open rest API test use the below site and get the url
 * https://restful-api.dev/
 */
public class DemoHttpClient {

    public void http2ClientRequest() throws IOException, InterruptedException {
        System.out.println("Http2 Client Request");
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.restful-api.dev/objects"))
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Response Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }

    public void http2POSTClientRequest() throws IOException, InterruptedException {
        System.out.println("Http2 Client Request");
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.restful-api.dev/objects"))
                .POST(HttpRequest.BodyPublishers
                        .ofString("{ \"name\": \"Apple MacBook Pro 16\", \"data\": { \"year\": 2019, \"price\": 1849.99, \"CPU model\": \"Intel Core i9\", \"Hard disk size\": \"1 TB\" }}"))
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Response Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }
}
