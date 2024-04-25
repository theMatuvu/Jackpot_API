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
        if (customers.getJackpotamount()>=10 && customers.getNbcheckout()>=3){
            return true;
        }
        return false;
    }


}
