package com.nathandeamer.customerdetails;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerDetailsController {

  private final CustomerDetailsService customerDetailsService;

  @GetMapping(value = "/{customerId}")
  public CustomerDetailsResponse getCustomer(
      @PathVariable String customerId) {
    return customerDetailsService.getCustomer(customerId);
  }

}
