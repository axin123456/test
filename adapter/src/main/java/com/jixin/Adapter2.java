package com.jixin;

public class Adapter2 {

    private Current current;

    public Adapter2(Current current) {
        this.current = current;
    }

    public void use18V() {
        System.out.println("使用18V电压");
        current.use220V();
    }
}
