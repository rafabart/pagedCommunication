package com.pageableProducer;

import com.pageableProducer.entities.Customer;
import com.pageableProducer.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.utility.RandomString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 50; i++) {
            customerRepository.save(new Customer(null, RandomString.make(), RandomString.make()));
        }
    }
}