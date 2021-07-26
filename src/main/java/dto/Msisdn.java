package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Msisdn {
    @JsonProperty("mobile")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
