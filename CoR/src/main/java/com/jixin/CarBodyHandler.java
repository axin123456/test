package com.jixin;

public class CarBodyHandler extends CarHandler {
    public void handlerCar() {
        System.out.println("组装车身");
        if (this.carHandler != null) {
            this.carHandler.handlerCar();
        }
    }
}
