package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "SMS_LIST_V7"
})
public class SmsListDTO {

    @JsonProperty("SMS_LIST_V7")
    private SmsListDetailDTO smsListItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SMS_LIST_V7")
    public SmsListDetailDTO getSmsListItem() {
        return smsListItem;
    }

    @JsonProperty("SMS_LIST_V7")
    public void setSmsListItem(SmsListDetailDTO smsListItem) {
        this.smsListItem = smsListItem;
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
