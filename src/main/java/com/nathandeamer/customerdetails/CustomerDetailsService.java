package com.nathandeamer.customerdetails;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerDetailsService {

  private final CustomerDetailsRepository customerDetailsRepository;

  public CustomerDetailsResponse getCustomer(String customerId) {
    return customerDetailsRepository.get(customerId);
  }
}
