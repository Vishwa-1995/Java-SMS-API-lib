import com.fasterxml.jackson.databind.ObjectMapper;
import dto.SendTextBody;
import dto.SendTextResponse;
import dto.TokenBody;
import dto.TokenResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SendSMSImpl implements SendSMS{
    @Override
    public TokenResponse getToken(TokenBody tokenBody) throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(tokenBody);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://smartmessenger.lk/api/login"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        return objectMapper.readValue(response.body(), TokenResponse.class);
    }

    @Override
    public SendTextResponse sendText(SendTextBody sendTextBody, String token) throws IOException, InterruptedException {

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(sendTextBody);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://smartmessenger.lk/api/sms"))
                .headers("Content-Type", "application/json", "Authorization", "Bearer "+token)
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), SendTextResponse.class);
    }

    public SendTextResponse sendTextMessage(TokenBody tokenBody, SendTextBody sendTextBody){


        return  null;
    }

}
