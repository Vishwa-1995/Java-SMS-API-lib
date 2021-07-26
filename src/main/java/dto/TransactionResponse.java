package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionResponse {

    @JsonProperty("transaction_id")
    private String transaction_id;
    @JsonProperty("errCode")
    private String errCode;
    @JsonProperty("data")
    private DataTransaction dataTransaction;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("status")
    private String status;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public DataTransaction getDataTransaction() {
        return dataTransaction;
    }

    public void setDataTransaction(DataTransaction dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
