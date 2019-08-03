package com.tester.annotation.validation;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.util.Set;

@AutoService(Processor.class)
@SupportedAnnotationTypes(value = "com.tester.annotation.validation.NotNull")
public class NotNullProcessor extends AbstractProcessor {
    private Messager messager;
    private Filer filer;
    private Types typeUtils;
    private Elements elementUtils;

    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
        filer = processingEnv.getFiler();
        typeUtils = processingEnv.getTypeUtils();
        elementUtils = processingEnv.getElementUtils();
    }


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Set<? extends Element> annotated = roundEnv.getElementsAnnotatedWith(NotNull.class);
        for (Element element : annotated) {
            if (!element.getKind().isField()) {
                messager.printMessage(Diagnostic.Kind.ERROR, "Only allowed for field.", element);
                return true;
            }

            VariableElement variableElement = (VariableElement) element;
            if (variableElement.getConstantValue() == null) {
                NotNull annotationsByType = variableElement.getAnnotation(NotNull.class);

                messager.printMessage(Diagnostic.Kind.ERROR, annotationsByType.message(), element);
                return true;
            }
        }
        return false;
    }

}
