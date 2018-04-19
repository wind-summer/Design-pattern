package com.pattern.observer.test;

import com.pattern.observer.Subject;
import com.pattern.observer.impl.BinaryObserver;
import com.pattern.observer.impl.HexaObserver;
import com.pattern.observer.impl.OctalObserver;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
