package com.jixin.factory.abstract1;

public class xiaomiPhoe implements IphoneProduct{
    public void strat() {
        System.out.println("小米手机开机");
    }

    public void shutdown() {
        System.out.println("小米手机关机");
    }

    public void callup() {
        System.out.println("小米手机打电话");
    }

    public void sendSMS() {
        System.out.println("小米手机发短信");
    }
}
