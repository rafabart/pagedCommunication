package com.pageableConsumer.resources;

import com.pageableConsumer.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerResource {

    private final CustomerService customerService;


    @ResponseStatus(OK)
    @GetMapping("/{itemsPerPage}")
    public void listAllPageablePer(@PathVariable("itemsPerPage") final Integer itemsPerPage) {
        customerService.fetcherAllCustomerPageable(itemsPerPage);
    }


    @ResponseStatus(OK)
    @GetMapping
    public void listAllPageable() {
        customerService.fetcherAllCustomerPageable(10);
    }
}
