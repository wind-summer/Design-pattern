package com.pattern.singleton;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class Test {
    public static void main(String[] args) {
        SingletonPattern o = SingletonPattern.getInstance();
        o.showMessage();
    }
}
