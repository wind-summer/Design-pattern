package com.pattern.builder.impl;

import com.pattern.builder.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wenlf
 * @since 2018/4/8
 */
public class Meal {

    public List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items ){
            cost = cost + item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items ) {
            System.out.print("Item:"+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
