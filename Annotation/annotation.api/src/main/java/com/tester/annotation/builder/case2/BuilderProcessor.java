package com.tester.annotation.builder.case2;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;
import com.tester.annotation.builder.case1.AutoBuilder;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@AutoService(Processor.class)
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class BuilderProcessor extends AbstractProcessor {
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

        for (Element annotationElement : roundEnv.getElementsAnnotatedWith(Builder.class)) {
            if (annotationElement.getKind() != ElementKind.CLASS) {
                System.err.println("Only class Type allowed.");
                return true;
            }
            TypeElement typeElement = (TypeElement) annotationElement;
            ClassName className = ClassName.get(typeElement);
            result.add(className);
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
        annotations.add(Builder.class.getCanonicalName());
        return annotations;
    }

}
