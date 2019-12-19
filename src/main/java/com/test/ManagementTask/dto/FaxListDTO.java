package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FAX_LIST_ITEM_V7"
})
public class FaxListDTO {

    @JsonProperty("FAX_LIST_ITEM_V7")
    private FaxListItemDTO faxListItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FAX_LIST_ITEM_V7")
    public FaxListItemDTO getFaxListItem() {
        return faxListItem;
    }

    @JsonProperty("FAX_LIST_ITEM_V7")
    public void setFaxListItem(FaxListItemDTO faxListItem) {
        this.faxListItem = faxListItem;
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
