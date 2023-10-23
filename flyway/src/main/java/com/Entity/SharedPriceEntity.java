package com.Entity;
import javax.persistence.*;
@Entity
@Table(name = "stock")

public class SharedPriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "exchange")
    private String exchange;

    @Column(name = "time_stamp")
    private String time_stamp;

    @Column(name = "customer")
    private String customer;
   
}
