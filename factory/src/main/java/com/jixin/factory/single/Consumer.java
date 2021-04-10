package com.jixin.factory.single;

public class Consumer {
    public static void main(String[] args) {
        Car WuLingCar = CarFactory.getCar("五菱");
        Car TeslaCar = CarFactory.getCar("特斯拉");
        WuLingCar.name();
        TeslaCar.name();
    }
}
