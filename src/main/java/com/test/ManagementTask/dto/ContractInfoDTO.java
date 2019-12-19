package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CONTACT_INFO_V7"
})
public class ContractInfoDTO {

    @JsonProperty("CONTACT_INFO_V7")
    private ContractInfoDetailsDTO contractInformation;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CONTACT_INFO_V7")
    public ContractInfoDetailsDTO getContractInformation() {
        return contractInformation;
    }

    @JsonProperty("CONTACT_INFO_V7")
    public void setContractInformation(ContractInfoDetailsDTO contractInformation) {
        this.contractInformation = contractInformation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
