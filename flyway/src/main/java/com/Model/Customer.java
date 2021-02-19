package com.Model;
import javax.persistence.*;
@Entity
@Table(name = "test")

public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "customer")
    String customer;
}

