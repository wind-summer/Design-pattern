package com.pattern.builder.test;

import com.pattern.builder.impl.Meal;
import com.pattern.builder.impl.MealBuilder;

/**
 * @author wenlf
 * @since 2018/4/8
 */
public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜套餐");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n肉类套餐");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
