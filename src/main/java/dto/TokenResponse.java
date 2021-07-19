package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponse {

    @JsonProperty("expiration")
    private int expiration;
    @JsonProperty("remainingCount")
    private int remainingCount;
    @JsonProperty("token")
    private String token;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("status")
    private String status;

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public int getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(int remainingCount) {
        this.remainingCount = remainingCount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
