package com.pattern.abstractFactory.impl;

import com.pattern.abstractFactory.Color;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class Red implements Color {
    /**
     * 填充颜色
     */
    @Override
    public void fill() {
        System.out.println("Inside 红色::fill() method.");
    }
}
