package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List executeFilteringStrategy(FilteringStrategy filteringStrategy){
        List<Product> result = new ArrayList();
        for (Product a : productList) {
            if (filteringStrategy.filter(a)) {
                result.add(a);
            }
        }
        return result;
    }
}
