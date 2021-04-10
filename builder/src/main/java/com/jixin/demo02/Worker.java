package com.jixin.demo02;

public class Worker extends Builder {
    private Product product;

    public Worker() {
        product = new Product();
    }

    Builder buildA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    Builder buildB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    Builder buildC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    Builder buildD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    Product getProduct() {
        return product;
    }
}
