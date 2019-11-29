//: com.yulikexuan.di.domain.model.HybridCar.java


package com.yulikexuan.di.domain.model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Data
@Component
public class HybridCar {

    private Engine engine;
    private Transmission transmission;

    @Autowired
    public HybridCar(@Qualifier("hybrid")Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getEntineType() {
        return this.engine.getType();
    }

    public String getTransmissionType() {
        return this.transmission.getType();
    }

}///:~