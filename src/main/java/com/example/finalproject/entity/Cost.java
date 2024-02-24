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
@Table(name = "cost_table")
public class Cost {
    @SequenceGenerator(name="cost_seq",
            sequenceName = "cost_seq", allocationSize = 1
    )
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "cost_seq"
    )
    private Long id;
    private double cost_amount;
    private Date paid_date;
    private String paid_type;
}
