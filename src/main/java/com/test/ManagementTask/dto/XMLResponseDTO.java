package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "getCustomerInfoResponse"
})
public class XMLResponseDTO {

    @JsonProperty("getCustomerInfoResponse")
    private GetCustomerInfoDTO getCustomerInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("getCustomerInfoResponse")
    public GetCustomerInfoDTO getGetCustomerInfo() {
        return getCustomerInfo;
    }

    @JsonProperty("getCustomerInfoResponse")
    public void setGetCustomerInfo(GetCustomerInfoDTO getCustomerInfo) {
        this.getCustomerInfo = getCustomerInfo;
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
