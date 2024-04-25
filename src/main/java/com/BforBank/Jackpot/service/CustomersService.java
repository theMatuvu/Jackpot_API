package com.BforBank.Jackpot.service;

import com.BforBank.Jackpot.model.Customers;
import com.BforBank.Jackpot.repository.CustomersRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CustomersService {
    @Autowired
    private CustomersRepository customersRepository;

    public Optional<Customers> getCustomer(final long id){
        return customersRepository.findById(id);
    }

}
