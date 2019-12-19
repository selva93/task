package com.test.ManagementTask.service;


import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.test.ManagementTask.dto.CustDetailDTO;
import com.test.ManagementTask.dto.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    Cache<String, CustDetailDTO> customerDetailsCache = CacheBuilder.newBuilder().build();
    public CustDetailDTO insertCustomerDetails(ResponseDTO customerInfo) {
        CustDetailDTO customerDetails = new CustDetailDTO();
        customerDetails.setCustNumber(customerInfo.getXmlResponseDetails().getGetCustomerInfo().getGetCustResult().getCustomerInfo().getCustomerNumber());
        customerDetails.setShortName(customerInfo.getXmlResponseDetails().getGetCustomerInfo().getGetCustResult().getCustomerInfo().getShortName());
        customerDetails.setContractInfo(customerInfo.getXmlResponseDetails().getGetCustomerInfo().getGetCustResult().getCustomerInfo().getContactInfov7().getContractInformation());
        customerDetailsCache.put(customerDetails.getCustNumber(), customerDetails);
        return customerDetails;
    }

    public Optional<CustDetailDTO> getCustomerDetails(String customerNumber) {
        CustDetailDTO customerDetails = customerDetailsCache.getIfPresent(customerNumber);
        if (customerDetails != null) {
            return Optional.ofNullable(customerDetails);
        }
        return Optional.empty();
    }
    }

