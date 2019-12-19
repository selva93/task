package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MOB_OPER_ISO",
        "MOB_OPER_CODE",
        "SMS_FORMATTED",
        "SMS_LIST_ITEM_V7"
})
public class SmsListDetailDTO {

    @JsonProperty("MOB_OPER_ISO")
    private String mobileOperISO;
    @JsonProperty("MOB_OPER_CODE")
    private String mobileOperCode;
    @JsonProperty("SMS_FORMATTED")
    private String smsFormatted;
    @JsonProperty("SMS_LIST_ITEM_V7")
    private SmsListItemDTO smsListDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MOB_OPER_ISO")
    public String getMobileOperISO() {
        return mobileOperISO;
    }

    @JsonProperty("MOB_OPER_ISO")
    public void setMobileOperISO(String mobileOperISO) {
        this.mobileOperISO = mobileOperISO;
    }

    @JsonProperty("MOB_OPER_CODE")
    public String getMobileOperCode() {
        return mobileOperCode;
    }

    @JsonProperty("MOB_OPER_CODE")
    public void setMobileOperCode(String mobileOperCode) {
        this.mobileOperCode = mobileOperCode;
    }

    @JsonProperty("SMS_FORMATTED")
    public String getSmsFormatted() {
        return smsFormatted;
    }

    @JsonProperty("SMS_FORMATTED")
    public void setSmsFormatted(String smsFormatted) {
        this.smsFormatted = smsFormatted;
    }
    @JsonProperty("SMS_LIST_ITEM_V7")
    public SmsListItemDTO getSmsListDetails() {
        return smsListDetails;
    }

    @JsonProperty("SMS_LIST_ITEM_V7")
    public void setSmsListDetails(SmsListItemDTO smsListDetails) {
        this.smsListDetails = smsListDetails;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
