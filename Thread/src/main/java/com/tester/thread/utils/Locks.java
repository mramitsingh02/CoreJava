package com.tester.thread.utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    public static Lock of() {
        return new ReentrantLock();
    }

    public static Lock of(boolean fair) {
        return new ReentrantLock(fair);
    }

    public static void off(Lock lock) {
        lock.unlock();
    }
}
