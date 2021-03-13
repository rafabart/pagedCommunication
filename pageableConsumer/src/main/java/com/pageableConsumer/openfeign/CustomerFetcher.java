package com.pageableConsumer.openfeign;

import com.pageableConsumer.dto.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(url = "http://localhost:8081/", name = "customer")
public interface CustomerFetcher {


    @GetMapping("/customers")
    Page<CustomerDTO> fetcherCustomerPageable(Pageable pageable);
}
