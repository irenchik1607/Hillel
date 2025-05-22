package Lesson_30;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClassPage {
    private final HttpClient client;
    private static final String DOMAIN = "https://qauto.forstudy.space/api";

    public ApiClassPage() {
        client = HttpClient.newHttpClient();
    }

    public String getBody() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(DOMAIN + "/auth/logout"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String actualBody = response.body();
        return actualBody;
    }

    public int getStatusCode() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(DOMAIN + "/auth/logout"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int actualStatusCode = response.statusCode();
        return actualStatusCode;
    }

    public String getBodyTask2() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(DOMAIN + "/cars/brands"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String actualBody = response.body();
        return actualBody;
    }

    public int getStatusCodeTask2() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(DOMAIN + "/cars/brands"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int actualStatusCode = response.statusCode();
        return actualStatusCode;
    }
}
