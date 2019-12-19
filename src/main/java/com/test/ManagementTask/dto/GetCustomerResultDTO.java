package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "RETURN_CODE",
        "ERROR_MSG",
        "WARNING_MSG_LIST",
        "CUST_INFO"
})
public class GetCustomerResultDTO {

    @JsonProperty("RETURN_CODE")
    private String returnCode;
    @JsonProperty("ERROR_MSG")
    private List<Object> errorMsg = null;
    @JsonProperty("WARNING_MSG_LIST")
    private List<Object> warningMsgList = null;
    @JsonProperty("CUST_INFO")
    private CustomerInfoDTO customerInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RETURN_CODE")
    public String getReturnCode() {
        return returnCode;
    }

    @JsonProperty("ReturnCode")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @JsonProperty("ERROR_MSG")
    public List<Object> getErrorMsg() {
        return errorMsg;
    }

    @JsonProperty("ERROR_MSG")
    public void setErrorMsg(List<Object> errorMsg) {
        this.errorMsg = errorMsg;
    }

    @JsonProperty("WARNING_MSG_LIST")
    public List<Object> getWarningMsgList() {
        return warningMsgList;
    }

    @JsonProperty("WARNING_MSG_LIST")
    public void setWarningMsgList(List<Object> warningMsgList) {
        this.warningMsgList = warningMsgList;
    }


    public CustomerInfoDTO getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfoDTO customerInfo) {
        this.customerInfo = customerInfo;
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
