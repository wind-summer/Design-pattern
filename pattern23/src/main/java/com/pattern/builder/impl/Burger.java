package com.pattern.builder.impl;

import com.pattern.builder.Item;
import com.pattern.builder.Packing;

/**
 * 汉堡类
 *
 * @author wenlf
 * @since 2018/4/8
 */
public abstract class Burger implements Item {
    /**
     * 包装
     * @return
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 价格
     * @return
     */
    @Override
    public abstract float price();
}
