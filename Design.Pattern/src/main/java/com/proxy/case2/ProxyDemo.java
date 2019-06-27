package com.proxy.case2;

import java.lang.reflect.Proxy;

public class ProxyDemo {
    @SuppressWarnings("uncheck")
    private static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]
                        {itf},
                new LoggingHandler(target));
    }

    public static void main(String[] args) {
        Person person = new Person();

        Human human = withLogging(person, Human.class);

        human.walk();
        human.talk();
        human.talk();
        System.out.println(human.toString());


    }
}
