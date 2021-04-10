package com.jixin;

public class MainClass {
    public static void main(String[] args) {
        CarHeadHandler carHeadHandler = new CarHeadHandler();
        CarBodyHandler carBodyHandler = new CarBodyHandler();
        CarTailHandler carTailHandler = new CarTailHandler();
        carHeadHandler.setNextHandler(carBodyHandler);
        carBodyHandler.setNextHandler(carTailHandler);
        carHeadHandler.handlerCar();
    }
}
