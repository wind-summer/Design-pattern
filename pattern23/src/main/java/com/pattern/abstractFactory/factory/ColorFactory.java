package com.pattern.abstractFactory.factory;

import com.pattern.abstractFactory.Color;
import com.pattern.abstractFactory.Shape;
import com.pattern.abstractFactory.impl.Blue;
import com.pattern.abstractFactory.impl.Green;
import com.pattern.abstractFactory.impl.Red;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class ColorFactory extends AbstractFactory {
    /**
     * 获取颜色
     *
     * @return
     */
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    /**
     * 获取图形
     *
     * @return
     */
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
