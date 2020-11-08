package com.nathandeamer.customerdetails;

import org.springframework.stereotype.Component;

@Component
public class CustomerDetailsRepository {

  public CustomerDetailsResponse get(String customerId) {
    return CustomerDetailsResponse.builder()
        .firstName("Harry")
        .lastName("Potter")
        .build();
  }
}
