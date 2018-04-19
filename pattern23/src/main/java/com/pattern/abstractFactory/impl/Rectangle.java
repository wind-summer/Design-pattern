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
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside 三角形::draw() method.");
    }
}
