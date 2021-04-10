package com.jixin;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String ISBN;
    private String name;
    private double price;
}
