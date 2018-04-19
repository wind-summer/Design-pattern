package com.pattern.builder.impl;

import com.pattern.builder.Packing;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶装";
    }
}
