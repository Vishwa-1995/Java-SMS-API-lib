package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Additional_mask {
    @JsonProperty("mask")
    private String mask;

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
