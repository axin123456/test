package com.jixin.factory.single;

public class CarFactory {

    public static Car getCar(String car){
        if ("五菱".equals(car)){
            return new WuLingCar();
        } else if ("特斯拉".equals(car)) {
            return new TeslaCar();
        }else {
            return null;
        }
    }
}
