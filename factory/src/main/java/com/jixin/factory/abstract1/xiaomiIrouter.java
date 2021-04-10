package com.jixin.factory.abstract1;

public class xiaomiIrouter implements IRouterProduct {
    public void strat() {
        System.out.println("开启小米路由器");
    }

    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    public void openWifi() {
        System.out.println("小米路由器开启wifi");
    }

    public void seting() {
        System.out.println("设置小米路由器");
    }
}
