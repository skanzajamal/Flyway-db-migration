package com.Model;
import javax.persistence.*;
@Entity
@Table(name = "customer")

public class CustomerEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "customer")
    String customer;
}

