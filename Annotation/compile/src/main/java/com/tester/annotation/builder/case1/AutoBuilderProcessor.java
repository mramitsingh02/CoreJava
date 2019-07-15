package com.tester.annotation.builder.case1;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@AutoService(Processor.class)
public class AutoBuilderProcessor extends AbstractProcessor {
    private Filer filer;
    private Messager messager;


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        filer = processingEnv.getFiler();
        messager = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        Set<ClassName> result = new HashSet<>();

        for (Element annotationElement : roundEnv.getElementsAnnotatedWith(AutoBuilder.class)) {
            if (annotationElement.getKind() != ElementKind.CLASS) {
                System.err.println("Only class Type allowed.");
                return true;
            }
            TypeElement typeElement = (TypeElement) annotationElement;
            ClassName className = ClassName.get(typeElement);
            result.add(className);
        }

        try {
            new BuilderFactory(filer, result).generate();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return false;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> annotations = new LinkedHashSet<>();
        annotations.add(AutoBuilder.class.getCanonicalName());
        return annotations;
    }

}
