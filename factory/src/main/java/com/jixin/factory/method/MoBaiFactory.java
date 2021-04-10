package com.jixin.factory.method;

public class MoBaiFactory implements CarFactory {
    public Car getCar() {
        return new MoBai();
    }
}
