package com.Entity;
import javax.persistence.*;
@Entity
@Table(name = "customer")

public class CustomerEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "customer")
    private String customer;
}

