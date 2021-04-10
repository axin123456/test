package com.jixin.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        System.out.println("==============小米系列产品==============");
        IProductFactory xiaomiFactory = new xiaomiFactory();

        IphoneProduct iphoneProduct = xiaomiFactory.iphoenProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = xiaomiFactory.routerProduct();
        iRouterProduct.openWifi();
        iRouterProduct.seting();

        System.out.println("===============华为系列产品=============");
        IProductFactory huaweiFacotry = new HuaweiFactory();

        IphoneProduct huaweiProduct1 = huaweiFacotry.iphoenProduct();
        huaweiProduct1.sendSMS();
        huaweiProduct1.callup();

        IphoneProduct huaweiProduct2 = huaweiFacotry.iphoenProduct();
        huaweiProduct2.callup();
        huaweiProduct2.shutdown();
    }
}
