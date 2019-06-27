package com.proxy.case2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
    private final Object target;
    private Map<String, Integer> calls;

    public LoggingHandler(Object target) {
        this.target = target;
        this.calls = new HashMap<>();
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();

        if(name.contains("toString"))
            return calls.toString();

        calls.merge(name, 1, Integer::sum);

        return method.invoke(target, args);
    }
}
