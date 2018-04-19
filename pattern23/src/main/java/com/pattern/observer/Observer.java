package com.pattern.observer;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
