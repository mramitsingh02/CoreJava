package com.tester.annotation.setter;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;
import com.tester.annotation.setter.case1.Getter;
import com.tester.annotation.setter.case1.Setter;
import com.tester.annotation.setter.case1.SetterAndGetter;

import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@AutoService(Processor.class)
public class SetterAnnotationProcessors extends AnnotationProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        List<ClassName> result = new ArrayList<>();
        List<TypeElement> resultTypeElement = new ArrayList<>();
        List<GeneratorAnnotatedClass> resultGeneratorAnnotatedClass = new ArrayList<>();
        try {

            for (Element annotatedElement : roundEnvironment.getElementsAnnotatedWith(SetterAndGetter.class)) {

                // Check if a class has been annotated with @Factory
                if (annotatedElement.getKind() != ElementKind.CLASS) {
                    error("Only Classes : ", annotatedElement);
                    note("Only Classes: " + annotatedElement);
                    warn("Only Classes: " + annotatedElement);
                    throw new ProcessingException(annotatedElement, "Only classes can be annotated with @%s",
                            SetterAndGetter.class.getSimpleName());
                }
                TypeElement typeElement = (TypeElement) annotatedElement;
                GeneratorAnnotatedClass annotatedClass = new GeneratorAnnotatedClass(typeElement);
                //annotatedClass.setaClass(typeElement.getQualifiedName().getClass());
                annotatedClass.setAnnotatedElement(annotatedElement);
                resultGeneratorAnnotatedClass.add(annotatedClass);
            }

            try {
                new SetterAndGetterGeneratorBuilder(getFiler(), resultGeneratorAnnotatedClass).generate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception | ProcessingException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> annotations = new LinkedHashSet<>();
        annotations.add(SetterAndGetter.class.getCanonicalName());
        annotations.add(Setter.class.getCanonicalName());
        annotations.add(Getter.class.getCanonicalName());
        return annotations;
    }

}
