//: com.yulikexuan.di.domain.model.CarTest.java


package com.yulikexuan.di.domain.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


@DisplayName("Spring DI Tests - ")
@ExtendWith(MockitoExtension.class)
class CarTest {

    @Mock
    private Engine hondaEngine;

    @Mock
    private Transmission bmwTransmission;

    private Car itopiaCar;

    @BeforeEach
    void setUp() {
        this.itopiaCar = new Car(this.hondaEngine, this.bmwTransmission);
    }

    @Test
    @DisplayName("Cars know it's engine type - ")
    void test_Car_Knows_Its_Engine_Type() {

        // Given
        String engineType = "Ford Mustang GT";
        given(this.hondaEngine.getType()).willReturn(engineType);

        // When
        String actualEngineType = this.itopiaCar.getEntineType();

        // Then
        assertThat(actualEngineType)
                .as("The engine type should be %1$s", engineType)
                .isEqualTo(engineType);
    }

}///:~