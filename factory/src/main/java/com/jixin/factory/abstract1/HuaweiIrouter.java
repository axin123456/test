package com.jixin.factory.abstract1;

public class HuaweiIrouter implements IRouterProduct {
    public void strat() {
        System.out.println("开启华为路由器");
    }

    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    public void openWifi() {
        System.out.println("华为路由器开启wifi");
    }

    public void seting() {
        System.out.println("设置华为路由器");
    }
}
