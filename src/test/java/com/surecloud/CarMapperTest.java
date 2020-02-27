package com.surecloud;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarMapperTest {

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car("Morris", 5);

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        //then
        assertThat(carDto).isNotNull();
        assertThat(carDto.getMake()).isEqualTo("Morris");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
    }
}
