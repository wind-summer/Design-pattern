package com.pattern.builder.impl;

/**
 * @author wenlf
 * @since 2018/4/8
 */
public class ChickenBurger extends Burger {
    /**
     * 名字
     * @return
     */
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    /**
     * 价格
     * @return
     */
    @Override
    public float price() {
        return 9.9f;
    }
}
