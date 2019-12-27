//: com.yulikexuan.di.app.SpringDiApp.java


package com.yulikexuan.di.app;


import com.yulikexuan.di.domain.model.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Slf4j
public class SpringDiApp {

    static ApplicationContext context = new AnnotationConfigApplicationContext(
            SpringDiConfig.class);

    public static void main(String... args) {
        Car car = context.getBean(Car.class);
        log.info(">>>>>>> The new toyota car is {}", car);
    }

}///:~