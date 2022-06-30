package com.example.restaurant.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemoryDbEntity {
    protected Integer index; // int -> Integer ;int를 우클릭해 Refactor/Type Migration을 들어간 후에 바꿔주기
}
