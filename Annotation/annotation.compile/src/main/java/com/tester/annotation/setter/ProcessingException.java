package com.tester.annotation.setter;

import javax.lang.model.element.Element;

public class ProcessingException extends Throwable {

    Element element;

    public ProcessingException(Element element, String msg, Object... args) {
        super(String.format(msg, args));
        this.element = element;
    }

    public Element getElement() {
        return element;
    }
}
