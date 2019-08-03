package com.tester.annotation.setter;

import com.squareup.javapoet.*;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class SetterAndGetterBuilderBack {
    private final Filer filer;
    private List<TypeElement> resultTypeElement;
    private final List<ClassName> result;


    public SetterAndGetterBuilderBack(Filer filer, List<TypeElement> resultTypeElement, List<ClassName> result) {
        this.filer = filer;
        this.resultTypeElement = resultTypeElement;
        this.result = result;
    }

    private ClassName getName(TypeMirror typeMirror) {
        String rawString = typeMirror.toString();
        int dotPosition = rawString.lastIndexOf(".");
        String packageName = rawString.substring(0, dotPosition);
        String className = rawString.substring(dotPosition + 1);
        return ClassName.get(packageName, className);
    }

    public void generate() throws IOException, ClassNotFoundException {
        for (TypeElement typeElement : resultTypeElement) {
            ClassName key = ClassName.get(typeElement);
            /*List<? extends TypeMirror> list =;
            for (TypeMirror typeMirror : list) {
                ClassName typeName = getName(typeMirror);
            }*/
            String packageName = key.packageName();
            String simpleName = key.simpleName();
            TypeSpec.Builder typeSpec = TypeSpec.classBuilder(simpleName + "SetterGetter")
                    .addModifiers(Modifier.PUBLIC);

            System.out.println(key.annotations.get(0).members.get(0));
            Class<?> processorClass = Class.forName(typeElement.getQualifiedName().toString());
            //Class<?> processorClass = key.annotated( typeElement.getA)


            for (Field declaredField : processorClass.getDeclaredFields()) {
                FieldSpec fieldSpec = FieldSpec.builder(declaredField.getType(), declaredField.getName())
                        .addModifiers(Modifier.PRIVATE)
                        .build();
                typeSpec.addField(fieldSpec);

                MethodSpec getMethod = MethodSpec.methodBuilder(generateName("get", declaredField))
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("return " + fieldSpec.name)
                        .returns(fieldSpec.type)
                        .build();
                MethodSpec setMethod = MethodSpec.methodBuilder(generateName("set", declaredField))
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(fieldSpec.type, fieldSpec.name)
                        .addStatement("this.$N = $N", fieldSpec.name, fieldSpec.name)
                        .build();
                typeSpec.addMethod(getMethod).addMethod(setMethod);
            }

            JavaFile javaFile = JavaFile.builder(key.packageName(), typeSpec.build()).build();
            javaFile.writeTo(filer);
        }
    }

    public void generate1() throws IOException, ClassNotFoundException {
        for (ClassName key : result) {
            String packageName = key.packageName();

            String simpleName = key.simpleName();
            TypeSpec.Builder typeSpec = TypeSpec.classBuilder(simpleName + "SetterGetter")
                    .addModifiers(Modifier.PUBLIC);

            //Class<?> processorClass = Class.forName(packageName + "." + simpleName+".class");
            Class<?> processorClass = key.getClass();

            for (Field declaredField : processorClass.getDeclaredFields()) {
                FieldSpec fieldSpec = FieldSpec.builder(declaredField.getType(), declaredField.getName())
                        .addModifiers(Modifier.PRIVATE)
                        .build();
                typeSpec.addField(fieldSpec);

                MethodSpec getMethod = MethodSpec.methodBuilder(generateName("get", declaredField))
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("return " + fieldSpec.name)
                        .returns(fieldSpec.type)
                        .build();
                MethodSpec setMethod = MethodSpec.methodBuilder(generateName("set", declaredField))
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(fieldSpec.type, fieldSpec.name)
                        .addStatement("this.$N = $N", fieldSpec.name, fieldSpec.name)
                        .build();
                typeSpec.addMethod(getMethod).addMethod(setMethod);
            }

            JavaFile javaFile = JavaFile.builder(key.packageName(), typeSpec.build()).build();
            javaFile.writeTo(filer);
        }
    }

    private static String generateName(String prefix, Field declaredField) {
        String newName = "";
        String oldName = declaredField.getName();
        if (Boolean.logicalAnd(declaredField.getType() == Boolean.TYPE, "get".equals(prefix))) {
            prefix = "is";
            prefix = oldName.startsWith(prefix) ? "" : prefix;
            if (prefix == "") {
                return oldName;
            }
        }
        newName = prefix.concat(String.valueOf(oldName.charAt(0)).toUpperCase().concat(oldName.substring(1, oldName.length())));
        return newName;
    }


}
