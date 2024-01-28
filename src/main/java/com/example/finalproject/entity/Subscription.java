package com.example.finalproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="subscription")
@Data
public class Subscription {
    @SequenceGenerator( name="subscription_seq",
                        sequenceName = "subscription_seq",
                        allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "subscription_seq"
    )
    private Long id;
//    private String name;
//    private String subs_type;
//    private String payment_type;
//    private double  amount;
//    private Date date;
//    @OneToMany()
//    @JsonIgnore
//    private List<BalanceTransaction> transactionList;



}
