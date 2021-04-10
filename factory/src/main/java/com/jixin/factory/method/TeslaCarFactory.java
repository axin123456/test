package com.jixin.factory.method;

public class TeslaCarFactory implements CarFactory {

    public Car getCar() {
        return new TeslaCar();
    }
}
