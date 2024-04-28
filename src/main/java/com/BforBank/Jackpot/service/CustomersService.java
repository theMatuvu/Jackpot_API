package com.BforBank.Jackpot.service;

import com.BforBank.Jackpot.model.Customers;
import com.BforBank.Jackpot.repository.CustomersRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CustomersService {
    @Autowired
    private CustomersRepository customersRepository;

    public Customers getCustomer(final long id){
        Optional<Customers> customers = customersRepository.findById(id);
        if(customers.isPresent())
            return customers.get();
        else
            throw new EntityNotFoundException("Customers not found with id : "+ id);
    }

}
