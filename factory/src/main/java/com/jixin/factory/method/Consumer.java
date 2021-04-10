package com.jixin.factory.method;

public class Consumer {
    public static void main(String[] args) {
        Car WuLingCar = new WuLingCarFactory().getCar();
        Car TeslaCar = new TeslaCarFactory().getCar();
        Car moBaiCar = new MoBaiFactory().getCar();
        WuLingCar.name();
        TeslaCar.name();
        moBaiCar.name();
    }
}
