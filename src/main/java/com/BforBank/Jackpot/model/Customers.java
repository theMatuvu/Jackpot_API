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

    private String lastname;

    private String firstname;

    private double jackpotamount;

    private int nbcheckout;
}
