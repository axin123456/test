package com.jixin;

public class CarHeadHandler extends CarHandler {
    public void handlerCar() {
        System.out.println("组装车头");
        if (this.carHandler != null) {
            this.carHandler.handlerCar();
        }
    }
}
