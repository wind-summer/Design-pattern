package com.pattern.singleton;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author wenlf
 * @since 2018/4/8
 */
public class SingletonPattern {

    //创建 SingleObject 的一个对象
    private static SingletonPattern instance = new SingletonPattern();

    //让构造函数为 private，这样该类就不会被实例化
    private SingletonPattern(){}

    //获取唯一可用的对象
    public static SingletonPattern getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
