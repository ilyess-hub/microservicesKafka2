package com.microservices.springkafkaconsumer.bean;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "user1")
@Data
public class User implements Serializable {


    @Id
    private String id;
    private String name;
    private double balance;



}

