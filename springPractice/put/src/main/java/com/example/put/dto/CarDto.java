package com.example.put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDto {
    private String name;
    // 특정 변수만 snakecase로 바꿔주려면 이러한 방식을 사용하고
    // 전체를 다 바꿔주려면 @JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class) 활용
    @JsonProperty("car_number")
    private String carNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "name='" + name + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
