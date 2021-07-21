import dto.SendTextBody;
import dto.SendTextResponse;
import dto.TokenBody;
import dto.TokenResponse;

import java.io.IOException;

public interface SendSMS {
    TokenResponse getToken(TokenBody tokenBody) throws IOException;

    SendTextResponse sendText(SendTextBody sendTextBody, String token) throws IOException;
}
