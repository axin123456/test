package com.jixin;

import lombok.Data;

public @Data abstract class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void installEngine();
}
