package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "responseXML"
})
public class ResponseDTO {
    @JsonProperty("responseXML")
    private XMLResponseDTO xmlResponseDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("responseXML")
    public XMLResponseDTO getXmlResponseDetails() {
        return xmlResponseDetails;
    }

    @JsonProperty("responseXML")
    public void setXmlResponseDetails(XMLResponseDTO xmlResponseDetails) {
        this.xmlResponseDetails = xmlResponseDetails;
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
