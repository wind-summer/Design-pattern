package com.pattern.builder;

/**
 * <p>
 * 类目
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public interface Item {

    /**
     * 名字
     * @return
     */
    public String name();
    /**
     * 包装
     * @return
     */
    public Packing packing();
    /**
     * 价格
     * @return
     */
    public float price();
}
