package com.pattern.factory;

import com.pattern.factory.i.Shape;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equals("CIRCLE")){
            return new Circle();
        }else if(shapeType.equals("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equals("SQUARE")){
            return new Square();
        }
        return null;
    }
}
