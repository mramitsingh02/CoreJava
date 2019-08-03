package com.tester.annotation.setter;

import com.squareup.javapoet.ClassName;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class AnnotationProcessor extends AbstractProcessor {
    private Filer filer;
    private Messager messager;
    private Set<String> annotations = new LinkedHashSet<>();


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        filer = processingEnv.getFiler();
        messager = processingEnv.getMessager();
    }


    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }


    protected ClassName getName(TypeMirror typeMirror) {
        String rawString = typeMirror.toString();
        int dotPosition = rawString.lastIndexOf(".");
        String packageName = rawString.substring(0, dotPosition);
        String className = rawString.substring(dotPosition + 1);
        return ClassName.get(packageName, className);
    }


    protected void error(String message, Element element) {
        messager.printMessage(Diagnostic.Kind.ERROR, message, element);
    }

    protected void error(String message) {
        messager.printMessage(Diagnostic.Kind.ERROR, message);
    }

    protected void note(String message) {
        messager.printMessage(Diagnostic.Kind.NOTE, message);
    }
    protected void warn(String message) {
        messager.printMessage(Diagnostic.Kind.WARNING, message);
    }

    public Set<String> getAnnotations() {
        return annotations;
    }

    public Filer getFiler() {
        return filer;
    }

    public Messager getMessager() {
        return messager;
    }
}
