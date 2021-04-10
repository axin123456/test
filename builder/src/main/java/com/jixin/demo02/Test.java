package com.jixin.demo02;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker
                .buildA("全家桶")
                .buildB("雪碧")
                .buildC("可乐")
                .buildD("薯条")
                .getProduct();
        System.out.println(product.toString());
    }
}
