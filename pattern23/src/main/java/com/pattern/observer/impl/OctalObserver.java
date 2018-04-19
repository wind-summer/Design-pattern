package com.pattern.observer.impl;

import com.pattern.observer.Observer;
import com.pattern.observer.Subject;

/**
 * @author wenlf
 * @since 2018/4/9
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState()));
    }
}
