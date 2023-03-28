package com.surya.login.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private int address_id;
    private String door_no;
    private String street;
    private String city;
    private String state;
    private long pincode;
}
