package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendTextResponse {

    @JsonProperty("userData")
    private String userData;
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

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

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
