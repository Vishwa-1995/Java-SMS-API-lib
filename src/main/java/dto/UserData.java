package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserData {
    @JsonProperty("walletBalance")
    private double walletBalance;
    @JsonProperty("additional_mask")
    private List<Additional_mask> additional_mask;
    @JsonProperty("defaultMask")
    private String defaultMask;
    @JsonProperty("email")
    private String email;
    @JsonProperty("mobile")
    private int mobile;
    @JsonProperty("address")
    private String address;
    @JsonProperty("lname")
    private String lname;
    @JsonProperty("fname")
    private String fname;
    @JsonProperty("id")
    private int id;

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public List<Additional_mask> getAdditional_mask() {
        return additional_mask;
    }

    public void setAdditional_mask(List<Additional_mask> additional_mask) {
        this.additional_mask = additional_mask;
    }

    public String getDefaultMask() {
        return defaultMask;
    }

    public void setDefaultMask(String defaultMask) {
        this.defaultMask = defaultMask;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
