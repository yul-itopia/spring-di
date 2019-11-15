//: com.yulikexuan.di.app.SpringDiApp.java


package com.yulikexuan.di.app;


import com.yulikexuan.di.domain.model.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Slf4j
public class SpringDiApp {

    public static void main(String... args) {
        Car car = getCarFromJavaConfig();
        log.info(">>>>>>> The new toyota car is {}", car);
    }

    private static Car getCarFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                SpringDiConfig.class);
        return context.getBean(Car.class);
    }

}///:~