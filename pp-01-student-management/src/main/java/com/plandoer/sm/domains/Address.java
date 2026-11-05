package com.plandoer.sm.domains;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private long id;
    private String city;
    private String state;
    private String country;
}