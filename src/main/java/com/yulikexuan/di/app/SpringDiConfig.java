//: com.yulikexuan.di.app.SpringDiConfig.java


package com.yulikexuan.di.app;


import com.yulikexuan.di.domain.model.Engine;
import com.yulikexuan.di.domain.model.Transmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.yulikexuan.di")
public class SpringDiConfig {

    @Bean
    public Engine engine() {
        return Engine.builder().type("RAV4-2020-v8").volume(5).build();
    }

    @Bean
    public Transmission transmission() {
        return Transmission.create("Sliding");
    }

}///:~