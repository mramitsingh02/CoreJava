package com.singletone.case5;

import java.util.Objects;

public class SingleTone {
    private static volatile SingleTone ourInstance = null;
/**
 Despite this class being thread-safe, we can see that there’s a clear performance drawback: each time we want to get the instance of our singleton, we need to acquire a potentially unnecessary lock.

 To fix that, we could instead start by verifying if we need to create the object in the first place and only in that case we would acquire the lock.

 Going further, we want to perform the same check again as soon as we enter the synchronized block, in order to keep the operation atomic:

 One thing to keep in mind with this pattern is that the field needs to be volatile to prevent cache incoherence issues. In fact, the Java memory model allows the publication of partially initialized objects and this may lead in turn to subtle bugs.
 */
    /**
     * SingleTone instance create using lazy initialization with double check.
     * When getInstance method call then object will created
     *
     * @return SingleTone object instance.
     */
    public static SingleTone getInstance() {
        if (Objects.isNull(ourInstance)) {
            synchronized (SingleTone.class) {
                if (Objects.isNull(ourInstance)) {
                    ourInstance = new SingleTone();
                }
            }
        }
        return ourInstance;
    }


    public Object readResolve(){
        return getInstance();
    }


    public Object clone(){
        throw new UnsupportedOperationException("Not Allowed to create the instance");
    }

    private SingleTone() {

        throw new UnsupportedOperationException("Not Allowed to create the instance");
    }
}
