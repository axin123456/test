package com.jixin.factory.abstract1;

public class HuaweiFactory implements IProductFactory {
    public IphoneProduct iphoenProduct() {
        return new HuaweiProdcut();
    }

    public IRouterProduct routerProduct() {
        return new HuaweiIrouter();
    }
}
