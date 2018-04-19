package com.pattern.builder.impl;

import com.pattern.builder.Item;
import com.pattern.builder.Packing;

/**
 * 冷饮
 * @author wenlf
 * @since 2018/4/8
 */
public abstract class ColdDrink implements Item {

    /**
     * 包装
     * @return
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 价格
     * @return
     */
    @Override
    public abstract float price();
}
