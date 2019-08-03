package com.tester.annotation.validation;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.util.List;
import java.util.Set;


@AutoService(value = Processor.class)
@SupportedSourceVersion(value = SourceVersion.RELEASE_11)
@SupportedAnnotationTypes(value = {"com.tester.annotation.validation.Immutable"})
public class ImmutableProcessor extends AbstractProcessor {

    private Messager messager;
    private Filer filer;
    private Types typeUtils;
    private Elements elementUtils;

    /*   public Set<String> getSupportedAnnotationTypes(){
           Set<String> annotations = new LinkedHashSet<>();
           annotations.add(Immutable.class.getCanonicalName());
           print(Immutable.class.getCanonicalName());
           return annotations;
       }
   */
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
        filer = processingEnv.getFiler();
        typeUtils = processingEnv.getTypeUtils();
        elementUtils = processingEnv.getElementUtils();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        Set<? extends Element> annotatedWith = roundEnv.getElementsAnnotatedWith(Immutable.class);
        for (Element element : annotatedWith) {
            if (element.getKind() != ElementKind.CLASS) {
                print(String.format("%s %s not allowed.", element.getKind().toString(), element));
                return true;
            }

            boolean classModifier = element.getModifiers().contains(Modifier.FINAL);

            if (!classModifier) {
                print(String.format("For Immutable Class %s Class modifier should be final.", element));
            } else if (classModifier) {
                TypeElement typeElement = (TypeElement) element;
                int i = 0;

                ClassName className = ClassName.get(typeElement);
                for (Element fieldElement : typeElement.getEnclosedElements()) {
                    if (fieldElement instanceof VariableElement) {
                        VariableElement variableElement = (VariableElement) fieldElement;
                        boolean variableModifier = variableElement.getModifiers().contains(Modifier.FINAL);
                        if (!variableModifier) {
                            print(String.format("For Immutable Class %s field modifier should be final.", fieldElement));
                        }
                    }
                    i++;
                }

                for (ExecutableElement constructor : ElementFilter.constructorsIn(typeElement.getEnclosedElements())) {
                    List<? extends VariableElement> parameters = constructor.getParameters();
                    if (constructor.getParameters().size() >= i) {
                        print(String.format("Immutable Class %s must have %d parameters constructor.", constructor, i));
                    }
                }

            } else {

            }
/*
            print(" Printing Class Name: " + typeElement.getQualifiedName().toString());
            if (className != null) {
                ClassName thisClass = getName(typeElement.asType());
//                print(" Printing Class Name: "+ typeElement.asType().toString());
                //               print(" Printing Class Name: "+ thisClass.simpleName());
                for (Element member : elementUtils.getAllMembers(typeElement)) {
                    //                 print("Printing Member: "+ member.getSimpleName(), member);
                }*//*

                return true;
            }

*/

        }


        return false;
    }

    private ClassName getName(TypeMirror typeMirror) {
        String rawString = typeMirror.toString();
        int dotPosition = rawString.lastIndexOf(".");
        String packageName = rawString.substring(0, dotPosition);
        String className = rawString.substring(dotPosition + 1);
        return ClassName.get(packageName, className);
    }

    private void print(String msg) {
        messager.printMessage(Diagnostic.Kind.ERROR, msg);
        messager.printMessage(Diagnostic.Kind.WARNING, msg);
        messager.printMessage(Diagnostic.Kind.NOTE, msg);
    }

    private void print(String msg, Element element) {
        messager.printMessage(Diagnostic.Kind.ERROR, msg, element);
        messager.printMessage(Diagnostic.Kind.WARNING, msg, element);
        messager.printMessage(Diagnostic.Kind.NOTE, msg, element);
    }

    //@Override
    public boolean process2(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {


        for (final Element element : roundEnv.getElementsAnnotatedWith(Immutable.class)) {
            if (element instanceof TypeElement) {
                final TypeElement typeElement = (TypeElement) element;

                for (final Element eclosedElement : typeElement.getEnclosedElements()) {
                    if (eclosedElement instanceof VariableElement) {
                        final VariableElement variableElement = (VariableElement) eclosedElement;

                        if (!variableElement.getModifiers().contains(Modifier.FINAL)) {
                            messager.printMessage(Diagnostic.Kind.ERROR,
                                    String.format("Class '%s' is annotated as @Immutable, but field '%s' is not declared as final",
                                            typeElement.getSimpleName(), variableElement.getSimpleName()
                                    )
                            );
                        }
                    }
                }
            }
        }
        return true;
    }
}
