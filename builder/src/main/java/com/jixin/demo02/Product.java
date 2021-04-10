package com.jixin.demo02;

import lombok.Data;
import lombok.ToString;

@ToString
public @Data class Product {
    private String BuildA = "汉堡";
    private String BuildB = "可乐";
    private String BuildC = "薯条";
    private String BuildD = "甜点";
}
