package com.pattern.abstractFactory.impl;

import com.pattern.abstractFactory.Shape;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside 圆形::draw() method.");
    }
}
