package com.BforBank.Jackpot.model.Response;

import com.BforBank.Jackpot.service.JackpotService;
import lombok.Data;

@Data
public class JackpotResponse {
    private Long idCustomer;
    private boolean unlocked;
    private double amount;
    private int checkout;
    private String message;

    public JackpotResponse(Long idCustomer, boolean unlocked, double amount, int checkout, String message) {
        this.idCustomer = idCustomer;
        this.unlocked = unlocked;
        this.amount = amount;
        this.checkout = checkout;
        this.message = message;
    }
}
