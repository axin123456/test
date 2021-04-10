package com.jixin.factory.method;

public class WuLingCarFactory implements CarFactory {

    public Car getCar() {
        return new WuLingCar();
    }
}
