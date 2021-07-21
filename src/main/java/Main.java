import dto.SendTextBody;
import dto.TokenBody;
import dto.TokenResponse;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        TokenBody tokenBody = new TokenBody();

        tokenBody.setUsername("sadisha");
        tokenBody.setPassword("Admin123!");

        SendSMSImpl sendSMS = new SendSMSImpl();

        SendTextBody sendTextBody = new SendTextBody();

        sendTextBody.setMask("Adeona");
        sendTextBody.setMsisdn("94719012099");
        sendTextBody.setMessage("Hi this is test from lib");

        System.out.println(sendSMS.sendText(sendTextBody, sendSMS.getToken(tokenBody).getToken()).getStatus());
    }
}
