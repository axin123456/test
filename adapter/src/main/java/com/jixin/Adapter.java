package com.jixin;

public class Adapter extends Current {
    public void use18V() {
        System.out.println("使用18V电压");
        this.use220V();
    }
}
