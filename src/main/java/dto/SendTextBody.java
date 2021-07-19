package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendTextBody {

    @JsonProperty("mask")
    private String mask;
    @JsonProperty("message")
    private String message;
    @JsonProperty("msisdn")
    private String msisdn;

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
