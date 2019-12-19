package com.test.ManagementTask.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CUST_NO",
        "SHORT_NAME",
        "IS_INDIVIDUAL",
        "NATIONALITY",
        "NATIONALITY_NUM",
        "NATIONALITY_DESC",
        "STREET_ADDR",
        "ADDRESS_LINE2",
        "ADDRESS_LINE3",
        "TOWN_COUNTRY",
        "POST_CODE",
        "COUNTRY",
        "COUNTRY_CODE",
        "COUNTRY_CODE_NUM",
        "DESPATCH_CODE",
        "CONTACT_INFO_V7"
})
public class CustomerInfoDTO {

    @JsonProperty("CUST_NO")
    private String customerNumber;
    @JsonProperty("SHORT_NAME")
    private String shortName;
    @JsonProperty("IS_INDIVIDUAL")
    private String isINDIVIDUAL;
    @JsonProperty("NATIONALITY")
    private String nationality;
    @JsonProperty("NATIONALITY_NUM")
    private String nationalityNum;
    @JsonProperty("NATIONALITY_DESC")
    private String nationalityDesc;
    @JsonProperty("STREET_ADDR")
    private String streetAddress;
    @JsonProperty("ADDRESS_LINE2")
    private List<Object> addressLine2 = null;
    @JsonProperty("ADDRESS_LINE3")
    private List<Object> addressLine3 = null;
    @JsonProperty("TOWN_COUNTRY")
    private String townCountry;
    @JsonProperty("POST_CODE")
    private List<Object> postCode = null;
    @JsonProperty("COUNTRY")
    private String country;
    @JsonProperty("COUNTRY_CODE")
    private String countryCode;
    @JsonProperty("COUNTRY_CODE_NUM")
    private String countryCodeNum;
    @JsonProperty("DESPATCH_CODE")
    private String despatchCode;
    @JsonProperty("CONTACT_INFO_V7")
    private ContractInfoDTO contactInfov7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CUST_NO")
    public String getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("CUST_NO")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("SHORT_NAME")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("SHORT_NAME")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("IS_INDIVIDUAL")
    public String getIsINDIVIDUAL() {
        return isINDIVIDUAL;
    }

    @JsonProperty("IS_INDIVIDUAL")
    public void setIsINDIVIDUAL(String isINDIVIDUAL) {
        this.isINDIVIDUAL = isINDIVIDUAL;
    }

    @JsonProperty("NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("NATIONALITY")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    @JsonProperty("NATIONALITY_NUM")
    public String getNationalityNum() {
        return nationalityNum;
    }
    @JsonProperty("NATIONALITY_NUM")
    public void setNationalityNum(String nationalityNum) {
        this.nationalityNum = nationalityNum;
    }
    @JsonProperty("NATIONALITY_DESC")
    public String getNationalityDesc() {
        return nationalityDesc;
    }
    @JsonProperty("NATIONALITY_DESC")
    public void setNationalityDesc(String nationalityDesc) {
        this.nationalityDesc = nationalityDesc;
    }
    @JsonProperty("STREET_ADDR")
    public String getStreetAddress() {
        return streetAddress;
    }
    @JsonProperty("STREET_ADDR")
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    @JsonProperty("ADDRESS_LINE2")
    public List<Object> getAddressLine2() {
        return addressLine2;
    }
    @JsonProperty("ADDRESS_LINE2")
    public void setAddressLine2(List<Object> addressLine2) {
        this.addressLine2 = addressLine2;
    }
    @JsonProperty("ADDRESS_LINE3")
    public List<Object> getAddressLine3() {
        return addressLine3;
    }
    @JsonProperty("ADDRESS_LINE3")
    public void setAddressLine3(List<Object> addressLine3) {
        this.addressLine3 = addressLine3;
    }
    @JsonProperty("TOWN_COUNTRY")
    public String getTownCountry() {
        return townCountry;
    }
    @JsonProperty("TOWN_COUNTRY")
    public void setTownCountry(String townCountry) {
        this.townCountry = townCountry;
    }
    @JsonProperty("POST_CODE")
    public List<Object> getPostCode() {
        return postCode;
    }
    @JsonProperty("POST_CODE")
    public void setPostCode(List<Object> postCode) {
        this.postCode = postCode;
    }
    @JsonProperty("COUNTRY")
    public String getCountry() {
        return country;
    }
    @JsonProperty("COUNTRY")
    public void setCountry(String country) {
        this.country = country;
    }
    @JsonProperty("COUNTRY_CODE")
    public String getCountryCode() {
        return countryCode;
    }
    @JsonProperty("COUNTRY_CODE")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    @JsonProperty("COUNTRY_CODE_NUM")
    public String getCountryCodeNum() {
        return countryCodeNum;
    }
    @JsonProperty("COUNTRY_CODE_NUM")
    public void setCountryCodeNum(String countryCodeNum) {
        this.countryCodeNum = countryCodeNum;
    }
    @JsonProperty("DESPATCH_CODE")
    public String getDespatchCode() {
        return despatchCode;
    }
    @JsonProperty("DESPATCH_CODE")
    public void setDespatchCode(String despatchCode) {
        this.despatchCode = despatchCode;
    }
    @JsonProperty("CONTACT_INFO_V7")
    public ContractInfoDTO getContactInfov7() {
        return contactInfov7;
    }
    @JsonProperty("CONTACT_INFO_V7")
    public void setContactInfov7(ContractInfoDTO contactInfov7) {
        this.contactInfov7 = contactInfov7;
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
