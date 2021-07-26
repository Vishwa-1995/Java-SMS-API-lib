import com.fasterxml.jackson.databind.ObjectMapper;
import dto.*;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.message.BasicHeader;
import service.HttpService;
import java.io.IOException;

public class SendSMSImpl implements SendSMS{

    ObjectMapper objectMapper = new ObjectMapper();
    HttpService httpService = new HttpService();

    @Override
    public TokenResponse getToken(TokenBody tokenBody) throws IOException {

        String url = "https://esms.dialog.lk/api/v1/login";

        String requestBody = objectMapper
                .writeValueAsString(tokenBody);

        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");

        Header[] headers = new Header[]{contentType};

        return objectMapper.readValue(httpService.postRequest(url, requestBody, headers), TokenResponse.class);
    }

    @Override
    public SendTextResponse sendText(SendTextBody sendTextBody, String token) throws IOException {

        String url = "https://esms.dialog.lk/api/v1/sms";

        String requestBody = objectMapper
                .writeValueAsString(sendTextBody);

        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        Header authType = new BasicHeader(HttpHeaders.AUTHORIZATION, "Bearer "+token);

        Header[] headers = new Header[]{contentType, authType};

        return objectMapper.readValue(httpService.postRequest(url, requestBody, headers), SendTextResponse.class);

    }

    @Override
    public TransactionResponse getTransactionIDStatus(TransactionBody transactionBody, String token) throws IOException {

        String url = "https://esms.dialog.lk/api/v1/sms/check-transaction";

        String requestBody = objectMapper
                .writeValueAsString(transactionBody);

        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        Header authType = new BasicHeader(HttpHeaders.AUTHORIZATION, "Bearer "+token);

        Header[] headers = new Header[]{contentType, authType};

        return objectMapper.readValue(httpService.postRequest(url, requestBody, headers), TransactionResponse.class);
    }

}
