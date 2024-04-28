package com.BforBank.Jackpot.controller;

import com.BforBank.Jackpot.model.Customers;
import com.BforBank.Jackpot.model.Response.JackpotResponse;
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
        return customersService.getCustomer(id);
    }

    @GetMapping("/customer/{id}/isUnlocked")
    public JackpotResponse isJackpotUnlocked(@PathVariable final long id){
        Customers customer = getCustomer(id);
        StringBuilder message = new StringBuilder();
        if(!jackpotService.isJackpotAvailable(customer)) {
            if(customer.getJackpotamount() < jackpotService.getMinAmount())
                message.append("The amount of your jackpot is too low. ");
            if(customer.getNbcheckout() < jackpotService.getMinCheckout())
                message.append("Your number of checkouts is insufficient.");
        }
        else
            message.append("Jackpot unlocked");
        return new JackpotResponse(id,jackpotService.isJackpotAvailable(customer), customer.getJackpotamount(), customer.getNbcheckout(), message.toString());
    }
}
