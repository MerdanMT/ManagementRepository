package com.management.ManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User extends Person {

    @Column(name = "company")
    private String company;

    @Column(name = "monthly_income")
    private double monthlyIncome;

}
