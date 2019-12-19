package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OFFICE_PHONE"
})
public class OfficePhoneListItemDTO {

    @JsonProperty("OFFICE_PHONE")
    private List<Object> officePhone = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OFFICE_PHONE")
    public List<Object> getOfficePhone() {
        return officePhone;
    }

    @JsonProperty("OFFICE_PHONE")
    public void setOfficePhone(List<Object> officePhone) {
        this.officePhone = officePhone;
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
