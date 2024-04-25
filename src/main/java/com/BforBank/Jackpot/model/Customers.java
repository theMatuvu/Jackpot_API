package com.BforBank.Jackpot.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String last_name;

    private String first_name;

    private double jackpot_amount;

    private int nb_checkout;
}
