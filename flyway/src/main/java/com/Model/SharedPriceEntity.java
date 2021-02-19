package com.Model;
import javax.persistence.*;
@Entity
@Table(name = "stock")

public class SharedPriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "symbol")
    String symbol;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    Double price;

    @Column(name = "exchange")
    String exchange;

    @Column(name = "time_stamp")
    String time_stamp;

    @Column(name = "customer")
    String customer;
   
}
