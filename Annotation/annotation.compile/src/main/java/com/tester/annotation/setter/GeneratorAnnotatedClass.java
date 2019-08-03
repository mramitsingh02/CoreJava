package com.tester.annotation.setter;

import com.tester.annotation.setter.case1.SetterAndGetter;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.List;

public class GeneratorAnnotatedClass {
    private TypeElement annotatedClassElement;
    private List<VariableElement> variableElements = new ArrayList<>();
    private List<Element> elements = new ArrayList<>();
    private Element annotatedElement;
    private  Class<?> aClass;


    public GeneratorAnnotatedClass(TypeElement classElement) throws ProcessingException {
        this.annotatedClassElement = classElement;
        SetterAndGetter annotation = classElement.getAnnotation(SetterAndGetter.class);
        for (Element element : annotatedClassElement.getEnclosedElements()) {
            if (element instanceof VariableElement) {
                VariableElement variableElement = (VariableElement) element;
                variableElements.add(variableElement);
            } else {

                elements.add(element);
            }


        }




    }

    public List<VariableElement> getVariableElements() {
        return variableElements;
    }

    public List<Element> getElements() {
        return elements;
    }

    public TypeElement getAnnotatedClassElement() {
        return annotatedClassElement;
    }

    public Class<?> getaClass() {
        return aClass;
    }

    public void setaClass(Class<?> aClass) {
        this.aClass = aClass;
    }

    public void setAnnotatedClassElement(TypeElement annotatedClassElement) {
        this.annotatedClassElement = annotatedClassElement;
    }

    public Element getAnnotatedElement() {
        return annotatedElement;
    }

    public void setAnnotatedElement(Element annotatedElement) {
        this.annotatedElement = annotatedElement;
    }
}