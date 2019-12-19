package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "SMS_LIST_ITEM_V7"
})
public class SmsListItemDTO {

    @JsonProperty("SMS_LIST_ITEM_V7")
    private SmsListItemDetailsDTO smsListItemDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SMS_LIST_ITEM_V7")
    public SmsListItemDetailsDTO getSmsListItemDetails() {
        return smsListItemDetails;
    }

    @JsonProperty("SMS_LIST_ITEM_V7")
    public void setSmsListItemDetails(SmsListItemDetailsDTO smsListItemDetails) {
        this.smsListItemDetails = smsListItemDetails;
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
