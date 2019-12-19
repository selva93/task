package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OFFICE_PHONE_LIST_ITEM_V7"
})
public class OfficePhoneListDTO {

    @JsonProperty("OFFICE_PHONE_LIST_ITEM_V7")
    private OfficePhoneListItemDTO phoneListItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OFFICE_PHONE_LIST_ITEM_V7")
    public OfficePhoneListItemDTO getPhoneListItem() {
        return phoneListItem;
    }
    @JsonProperty("OFFICE_PHONE_LIST_ITEM_V7")
    public void setPhoneListItem(OfficePhoneListItemDTO phoneListItem) {
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
