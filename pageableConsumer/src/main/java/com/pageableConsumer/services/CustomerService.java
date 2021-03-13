package com.pageableConsumer.services;

import com.pageableConsumer.dto.CustomerDTO;
import com.pageableConsumer.openfeign.CustomerFetcher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerFetcher customerFetcher;


    public void fetcherAllCustomerPageable(final int itemsPerPage) {

        Pageable pageable = PageRequest.of(0, itemsPerPage, Sort.by("id").ascending());
        Boolean hasNext = true;

        while (hasNext) {

            Page<CustomerDTO> customerDTOPage = customerFetcher.fetcherCustomerPageable(pageable);

            log.warn("New requisition...");
            log.warn("Page number: " + pageable.getPageNumber());
            customerDTOPage.get().forEach(customerDTO -> log.info(customerDTO.toString()));
            log.warn("End page ----------------------------------------------------------");

            pageable = pageable.next();
            hasNext = customerDTOPage.hasNext();
        }
    }
}
