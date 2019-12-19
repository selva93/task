package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "getCustomerInfoResult"
})
public class GetCustomerInfoDTO {

    @JsonProperty("getCustomerInfoResult")
    private GetCustomerResultDTO getCustResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("getCustomerInfoResult")
    public GetCustomerResultDTO getGetCustResult() {
        return getCustResult;
    }

    @JsonProperty("getCustomerInfoResult")
    public void setGetCustResult(GetCustomerResultDTO getCustResult) {
        this.getCustResult = getCustResult;
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
