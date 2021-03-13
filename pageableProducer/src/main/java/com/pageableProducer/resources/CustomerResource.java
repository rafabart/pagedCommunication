package com.pageableProducer.resources;

import com.pageableProducer.entities.Customer;
import com.pageableProducer.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerResource {

    private final CustomerRepository customerRepository;

//    Ex:
//    http://localhost:8081/customers/?page=0&size=5&sort=id,asc

    @GetMapping
    @ResponseStatus(OK)
    public Page<Customer> listAll(final Pageable pageable) {
        return customerRepository.findAll(pageable);
    }


    @GetMapping("/test")
    @ResponseStatus(OK)
    public String testUp() {
        return "Api is running";
    }
}
