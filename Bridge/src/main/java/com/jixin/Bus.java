package com.jixin;

public class Bus extends Car {

    public Bus(Engine engine) {
        super(engine);
    }

    public void installEngine() {
        System.out.print("Bus :");
        this.getEngine().initEngine();

    }
}
