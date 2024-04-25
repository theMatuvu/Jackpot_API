package com.BforBank.Jackpot.service;

import com.BforBank.Jackpot.model.Customers;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class JackpotService {
    private CustomersService customersService;

    public boolean isJackpotAvailable(Customers customers){
        if (customers == null){
            return false;
        }
        if (customers.getJackpot_amount()>=10 && customers.getNb_checkout()>=3){
            return true;
        }
        return false;
    }


}
