package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponse {

    @JsonProperty("errCode")
    private String errCode;
    @JsonProperty("userData")
    private UserData userData;
    @JsonProperty("refreshExpiration")
    private int refreshExpiration;
    @JsonProperty("refreshToken")
    private String refreshToken;
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

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public int getRefreshExpiration() {
        return refreshExpiration;
    }

    public void setRefreshExpiration(int refreshExpiration) {
        this.refreshExpiration = refreshExpiration;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
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
