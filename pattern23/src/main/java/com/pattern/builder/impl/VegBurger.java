package com.pattern.builder.impl;

/**
 * 蔬菜汉堡
 * @author wenlf
 * @since 2018/4/8
 */
public class VegBurger extends Burger {
    /**
     * 名字
     *
     * @return
     */
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public float price() {
        return 5.9f;
    }
}
