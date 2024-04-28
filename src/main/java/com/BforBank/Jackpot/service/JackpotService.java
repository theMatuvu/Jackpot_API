package com.BforBank.Jackpot.service;

import com.BforBank.Jackpot.model.Customers;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class JackpotService {
    private CustomersService customersService;
    private final double minAmount = 10.;
    private final int minCheckout = 3;

    public boolean isJackpotAvailable(Customers customers){
        if (customers == null){
            return false;
        }
        if (customers.getJackpotamount()>=minAmount && customers.getNbcheckout()>=minCheckout){
            return true;
        }
        return false;
    }


}
