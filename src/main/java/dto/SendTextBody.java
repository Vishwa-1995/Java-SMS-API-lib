package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SendTextBody {

    @JsonProperty("transaction_id")
    private String transaction_id;
    @JsonProperty("message")
    private String message;
    @JsonProperty("sourceAddress")
    private String sourceAddress;
    @JsonProperty("msisdn")
    private List<Msisdn> msisdn;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public List<Msisdn> getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(List<Msisdn> msisdn) {
        this.msisdn = msisdn;
    }
}
