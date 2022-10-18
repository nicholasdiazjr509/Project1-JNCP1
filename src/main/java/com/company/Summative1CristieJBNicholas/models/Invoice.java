package com.company.Summative1CristieJBNicholas.models;

import javax.persistence.*;
import java.util.Objects;

public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")//PK
    private Integer id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    //    @JoinColumn(name = "address")
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private String zipcode;


    public Invoice(){}


}
// invoice_id int not null auto_increment primary key,
//    name varchar(80) not null,
//    street varchar(30) not null,
//    city varchar(30) not null,
//    state char(2) not null,
//    zipcode varchar(5) not null,
//    item_type varchar(20) not null,
//    item_id int not null,
//    unit_price decimal(5,2) not null,
//    quantity int not null,
//    subtotal decimal(5,2) not null,
//    tax decimal(5,2) not null,
//    processing_fee decimal (5,2) not null,
//    total decimal(5,2) not null