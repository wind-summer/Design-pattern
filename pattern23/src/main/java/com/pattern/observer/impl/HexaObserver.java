package com.pattern.observer.impl;

import com.pattern.observer.Observer;
import com.pattern.observer.Subject;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hexa String: "
                + Integer.toHexString( subject.getState()));
    }
}
