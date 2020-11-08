package com.nathandeamer.mobileapp.pact;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import com.nathandeamer.customerdetails.CustomerDetailsRepository;
import com.nathandeamer.customerdetails.CustomerDetailsResponse;
import org.springframework.boot.test.mock.mockito.MockBean;

@Provider("customerdetails")
public class CustomerDetailsProviderPactTest extends ProviderPactTest {

  @MockBean
  private CustomerDetailsRepository customerDetailsRepository;

  @State("A customer exists")
  public void givenACustomerExists() {
    when(customerDetailsRepository.get(any())).thenReturn(CustomerDetailsResponse.builder()
        .firstName("Nathan")
        .lastName("Deamer")
        .build());
  }

}
