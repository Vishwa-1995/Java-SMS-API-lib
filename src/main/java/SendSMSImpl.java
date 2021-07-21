import com.fasterxml.jackson.databind.ObjectMapper;
import dto.SendTextBody;
import dto.SendTextResponse;
import dto.TokenBody;
import dto.TokenResponse;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SendSMSImpl implements SendSMS{
    @Override
    public TokenResponse getToken(TokenBody tokenBody) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(tokenBody);

        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {

            HttpPost request = new HttpPost("https://smartmessenger.lk/api/login");
            request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            request.setEntity(new StringEntity(requestBody));

            CloseableHttpResponse response = client.execute(request);

            BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));

            StringBuilder builder = new StringBuilder();

            String line;

            while ((line = bufReader.readLine()) != null) {

                builder.append(line);
                builder.append(System.lineSeparator());
            }

            return objectMapper.readValue(builder.toString(), TokenResponse.class);
        }
    }

    @Override
    public SendTextResponse sendText(SendTextBody sendTextBody, String token) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(sendTextBody);

        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {

            Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            Header authType = new BasicHeader(HttpHeaders.AUTHORIZATION, "Bearer "+token);

            HttpPost request = new HttpPost("https://smartmessenger.lk/api/sms");
            request.setHeaders(new Header[]{contentType,authType});
            request.setEntity(new StringEntity(requestBody));

            CloseableHttpResponse response = client.execute(request);

            BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));

            StringBuilder builder = new StringBuilder();

            String line;

            while ((line = bufReader.readLine()) != null) {

                builder.append(line);
                builder.append(System.lineSeparator());
            }

            return objectMapper.readValue(builder.toString(), SendTextResponse.class);
        }

    }

    public SendTextResponse sendTextMessage(TokenBody tokenBody, SendTextBody sendTextBody){

        return  null;
    }
}
