package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "COMM_CHANNEL",
        "PHONE_LIST_V7",
        "OFFICE_PHONE_LIST_V7",
        "FAX_LIST_V7",
        "SMS_LIST_V7",
        "EMAIL_LIST_V7"
})
public class ContractInfoDetailsDTO {

    @JsonProperty("COMM_CHANNEL")
    private String commChannel;
    @JsonProperty("PHONE_LIST_V7")
    private PhoneListDTO phoneList;
    @JsonProperty("OFFICE_PHONE_LIST_V7")
    private OfficePhoneListDTO officeList;
    @JsonProperty("FAX_LIST_V7")
    private FaxListDTO faxList;
    @JsonProperty("SMS_LIST_V7")
    private SmsListDTO smsList;
    @JsonProperty("EMAIL_LIST_V7")
    private EmailListDTO emailList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("COMM_CHANNEL")
    public String getCommChannel() {
        return commChannel;
    }
    @JsonProperty("COMM_CHANNEL")
    public void setCommChannel(String commChannel) {
        this.commChannel = commChannel;
    }
    @JsonProperty("PHONE_LIST_V7")
    public PhoneListDTO getPhoneList() {
        return phoneList;
    }
    @JsonProperty("PHONE_LIST_V7")
    public void setPhoneList(PhoneListDTO phoneList) {
        this.phoneList = phoneList;
    }
    @JsonProperty("OFFICE_PHONE_LIST_V7")
    public OfficePhoneListDTO getOfficeList() {
        return officeList;
    }
    @JsonProperty("OFFICE_PHONE_LIST_V7")
    public void setOfficeList(OfficePhoneListDTO officeList) {
        this.officeList = officeList;
    }
    @JsonProperty("FAX_LIST_V7")
    public FaxListDTO getFaxList() {
        return faxList;
    }
    @JsonProperty("FAX_LIST_V7")
    public void setFaxList(FaxListDTO faxList) {
        this.faxList = faxList;
    }
    @JsonProperty("SMS_LIST_V7")
    public SmsListDTO getSmsList() {
        return smsList;
    }
    @JsonProperty("SMS_LIST_V7")
    public void setSmsList(SmsListDTO smsList) {
        this.smsList = smsList;
    }
    @JsonProperty("EMAIL_LIST_V7")
    public EmailListDTO getEmailList() {
        return emailList;
    }
    @JsonProperty("EMAIL_LIST_V7")
    public void setEmailList(EmailListDTO emailList) {
        this.emailList = emailList;
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
