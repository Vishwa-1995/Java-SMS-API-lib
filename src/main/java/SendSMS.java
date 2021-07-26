import dto.*;

import java.io.IOException;

public interface SendSMS {
    TokenResponse getToken(TokenBody tokenBody) throws IOException;

    SendTextResponse sendText(SendTextBody sendTextBody, String token) throws IOException;

    TransactionResponse getTransactionIDStatus(TransactionBody transactionBody, String token) throws IOException;
}
