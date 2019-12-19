package com.test.ManagementTask.dto;

public class CustDetailDTO {
    private String custNumber;
    private String shortName;
    private ContractInfoDetailsDTO contractInfo;

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public ContractInfoDetailsDTO getContractInfo() {
        return contractInfo;
    }

    public void setContractInfo(ContractInfoDetailsDTO contractInfo) {
        this.contractInfo = contractInfo;
    }
}
