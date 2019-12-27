//: com.yulikexuan.di.domain.model.Transmission.java


package com.yulikexuan.di.domain.model;


import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Transmission {

    static final String DEFAULT = "A7XX AWD";

    private String type;

    public Transmission() {
        this.type = DEFAULT;
    }

    public static Transmission create(String type) {
        return new Transmission(type);
    }

    private Transmission(String type) {
        this.type = type;
    }

}///:~