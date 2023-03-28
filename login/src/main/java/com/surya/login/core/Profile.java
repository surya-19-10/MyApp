package com.surya.login.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profile {

    private int id;
    private String name;
    private long mobile;
    private String gender;
    private Address address;
}
