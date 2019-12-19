package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PHONE_LIST_ITEM_V7"
})
public class PhoneListDTO {
    @JsonProperty("PHONE_LIST_ITEM_V7")
    private PhoneListItemDTO phoneListItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("PHONE_LIST_ITEM_V7")
    public PhoneListItemDTO getPhoneListItem() {
        return phoneListItem;
    }
    @JsonProperty("PHONE_LIST_ITEM_V7")
    public void setPhoneListItem(PhoneListItemDTO phoneListItem) {
        this.phoneListItem = phoneListItem;
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
