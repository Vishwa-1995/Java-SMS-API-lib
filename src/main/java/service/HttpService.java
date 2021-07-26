package service;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpService {

    public String postRequest(String url, String body,  Header[] headers) throws IOException {

        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {

            HttpPost request = new HttpPost(url);
            request.setHeaders(headers);
            request.setEntity(new StringEntity(body));

            CloseableHttpResponse response = client.execute(request);

            BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));

            StringBuilder builder = new StringBuilder();

            String line;

            while ((line = bufReader.readLine()) != null) {

                builder.append(line);
                builder.append(System.lineSeparator());
            }

            return builder.toString();
        }
    }
}
