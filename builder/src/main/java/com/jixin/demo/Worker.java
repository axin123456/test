package com.jixin.demo;

public class Worker extends Builder {
    private Product product;

    public Worker() {
        product = new Product();
    }
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    void buildD() {
        product.setBuildD("检测");
        System.out.println("检测");
    }

    Product getProduct() {
        return product;
    }
}
