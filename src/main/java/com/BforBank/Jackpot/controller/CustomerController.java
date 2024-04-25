package com.BforBank.Jackpot.controller;

import com.BforBank.Jackpot.model.Customers;
import com.BforBank.Jackpot.service.CustomersService;
import com.BforBank.Jackpot.service.JackpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomersService customersService;
    @Autowired
    private JackpotService jackpotService;

    @GetMapping("/customer/{id}")
    public Customers getCustomer(@PathVariable final long id){
        Optional<Customers> customer = customersService.getCustomer(id);
        if(customer.isPresent())
            return customer.get();
        else
            return null;
    }

    @GetMapping("/customer/{id}/isUnlocked")
    public boolean isJackpotUnlocked(@PathVariable final long id){
        Customers customer = getCustomer(id);
        return jackpotService.isJackpotAvailable(customer);

    }
}
