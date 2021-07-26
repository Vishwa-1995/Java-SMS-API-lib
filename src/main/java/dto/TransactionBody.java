package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionBody {

    @JsonProperty("transaction_id")
    private String transaction_id;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }
}
