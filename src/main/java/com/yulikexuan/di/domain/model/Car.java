//: com.yulikexuan.di.domain.model.Car.java


package com.yulikexuan.di.domain.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;


@Getter
@ToString
@RequiredArgsConstructor
@Component
public class Car {

    private final Engine engine;
    private final Transmission transmission;

    public String getEntineType() {
        return this.engine.getType();
    }

    public String getTransmissionType() {
        return this.transmission.getType();
    }

}///:~