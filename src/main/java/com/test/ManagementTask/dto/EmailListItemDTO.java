package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "EMAIL"
})
public class EmailListItemDTO {

    @JsonProperty("EMAIL")
    private String emailId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("EMAIL")
    public String getEmailId() {
        return emailId;
    }
    @JsonProperty("EMAIL")
    public void setEmailId(String emailId) {
        this.emailId = emailId;
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
