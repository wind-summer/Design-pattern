package com.pattern.builder.impl;

/**
 * 百事可乐
 * @author wenlf
 * @since 2018/4/8
 */
public class Pepsi extends ColdDrink {
    /**
     * 名字
     *
     * @return
     */
    @Override
    public String name() {
        return "百事可乐";
    }

    /**
     * 价格
     *
     * @return
     */
    @Override
    public float price() {
        return 2.0f;
    }
}
