package com.pattern.observer.impl;

import com.pattern.observer.Observer;
import com.pattern.observer.Subject;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState()));
    }
}
