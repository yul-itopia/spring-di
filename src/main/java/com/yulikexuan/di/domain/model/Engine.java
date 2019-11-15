//: com.yulikexuan.di.domain.model.Engine.java


package com.yulikexuan.di.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder @AllArgsConstructor
public class Engine {

    private String type;
    private int volume;

}///:~