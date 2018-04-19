package com.pattern.abstractFactory.factory;

import com.pattern.abstractFactory.Color;
import com.pattern.abstractFactory.Shape;
import com.pattern.abstractFactory.impl.Blue;
import com.pattern.abstractFactory.impl.Circle;
import com.pattern.abstractFactory.impl.Rectangle;
import com.pattern.abstractFactory.impl.Square;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class ShapeFactory extends AbstractFactory{
    /**
     * 获取颜色
     *
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 获取图形
     *
     * @param shapeType
     * @return
     */
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
