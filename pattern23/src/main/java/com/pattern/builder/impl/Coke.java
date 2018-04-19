package com.pattern.builder.impl;

/**
 * 可口可乐
 * @author wenlf
 * @since 2018/4/8
 */
public class Coke extends ColdDrink {
    /**
     * 名字
     *
     * @return
     */
    @Override
    public String name() {
        return "可口可乐";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public float price() {
        return 2.5f;
    }
}
