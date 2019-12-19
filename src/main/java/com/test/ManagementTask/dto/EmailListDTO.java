package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonPropertyOrder({
        "EMAIL_LIST_ITEM_V7"
})
public class EmailListDTO {

    @JsonProperty("EMAIL_LIST_ITEM_V7")
    private EmailListItemDTO emailListItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EMAIL_LIST_ITEM_V7")
    public EmailListItemDTO getEmailListItem() {
        return emailListItem;
    }

    @JsonProperty("EMAIL_LIST_ITEM_V7")
    public void setEmailListItem(EmailListItemDTO emailListItem) {
        this.emailListItem = emailListItem;
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
