//: com.yulikexuan.di.domain.model.CarIT.java


package com.yulikexuan.di.domain.model;


import com.yulikexuan.di.app.SpringDiConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


@DisplayName("Spring DI General Usage Test - ")
class CarIT {

    private static ApplicationContext context;

    private Car iTopia;
    private HybridCar iTopia2020;

    @BeforeAll
    static void initializeDiContainer() {
        context = new AnnotationConfigApplicationContext(
                SpringDiConfig.class);
    }

    @BeforeEach
    void setUp() {
        this.iTopia = context.getBean(Car.class);
        this.iTopia2020 = context.getBean(HybridCar.class);
    }

    @Test
    @DisplayName("A car must know it's powerplant - ")
    void test_Car_Knows_Its_Powerplant() {

        // When
        String generalPowerplant = this.iTopia.toString();
        String hybridPowerplant = this.iTopia2020.toString();

        // Then
        assertAll(() -> assertThat(generalPowerplant).contains("RAV4-2020-v8"),
                () -> assertThat(generalPowerplant).contains("Sliding"),
                () -> assertThat(hybridPowerplant).contains("Camry ECVT hybrid"));
    }

}///:~