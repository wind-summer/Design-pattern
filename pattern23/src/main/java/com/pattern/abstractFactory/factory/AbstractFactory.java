package com.pattern.abstractFactory.factory;

import com.pattern.abstractFactory.Color;
import com.pattern.abstractFactory.Shape;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 获取图形
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape);
}
