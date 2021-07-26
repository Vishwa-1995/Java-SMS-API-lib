package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    @JsonProperty("invalidNumbers")
    private int invalidNumbers;
    @JsonProperty("duplicatesRemoved")
    private int duplicatesRemoved;
    @JsonProperty("userId")
    private int userId;
    @JsonProperty("userMobile")
    private int userMobile;
    @JsonProperty("walletBalance")
    private double walletBalance;
    @JsonProperty("campaignCost")
    private double campaignCost;
    @JsonProperty("campaignId")
    private int campaignId;

    public int getInvalidNumbers() {
        return invalidNumbers;
    }

    public void setInvalidNumbers(int invalidNumbers) {
        this.invalidNumbers = invalidNumbers;
    }

    public int getDuplicatesRemoved() {
        return duplicatesRemoved;
    }

    public void setDuplicatesRemoved(int duplicatesRemoved) {
        this.duplicatesRemoved = duplicatesRemoved;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(int userMobile) {
        this.userMobile = userMobile;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public double getCampaignCost() {
        return campaignCost;
    }

    public void setCampaignCost(double campaignCost) {
        this.campaignCost = campaignCost;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }
}
