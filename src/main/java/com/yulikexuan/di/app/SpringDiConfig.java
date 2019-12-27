//: com.yulikexuan.di.app.SpringDiConfig.java


package com.yulikexuan.di.app;


import com.yulikexuan.di.domain.model.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan("com.yulikexuan.di")
public class SpringDiConfig {

    @Bean("gas")
    @Primary
    public Engine generalEngine() {
        return Engine.builder().type("RAV4-2020-v8").volume(5).build();
    }

    @Bean("hybrid")
    public Engine hybridEngine() {
        return Engine.builder().type("Camry ECVT hybrid").volume(2).build();
    }

}///:~