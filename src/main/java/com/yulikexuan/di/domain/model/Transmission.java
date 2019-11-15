//: com.yulikexuan.di.domain.model.Transmission.java


package com.yulikexuan.di.domain.model;


import lombok.Data;


@Data
public class Transmission {

    private String type;

    public static Transmission create(String type) {
        return new Transmission(type);
    }

    private Transmission(String type) {
        this.type = type;
    }

}///:~