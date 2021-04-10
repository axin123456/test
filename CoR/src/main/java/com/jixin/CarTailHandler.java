package com.jixin;

public class CarTailHandler extends CarHandler {
    public void handlerCar() {
        System.out.println("组装车尾");
        if (this.carHandler != null) {
            this.carHandler.handlerCar();
        }
    }
}
