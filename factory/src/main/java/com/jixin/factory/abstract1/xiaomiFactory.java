package com.jixin.factory.abstract1;

public class xiaomiFactory implements IProductFactory {
    public IphoneProduct iphoenProduct() {
        return new xiaomiPhoe();
    }

    public IRouterProduct routerProduct() {
        return new xiaomiIrouter();
    }
}
