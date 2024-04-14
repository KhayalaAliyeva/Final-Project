package com.example.finalproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="profit_table")
public class Profit {
    @SequenceGenerator(name="profit_seq",
            sequenceName = "profit_seq", allocationSize = 1
    )
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "profit_seq"
    )
    private Long id;
    private String income_from;
    private double amount;
    private Date paid_date;
    private Long card_number;
    private String description;
    private String category;
}
