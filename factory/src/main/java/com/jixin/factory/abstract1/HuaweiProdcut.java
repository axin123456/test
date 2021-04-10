package com.jixin.factory.abstract1;

public class HuaweiProdcut implements IphoneProduct {
    public void strat() {
        System.out.println("华为手机开机");
    }

    public void shutdown() {
        System.out.println("华为手机关机");
    }

    public void callup() {
        System.out.println("华为手机打电话");
    }

    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}
