package com.tester.annotation.setter;

import com.squareup.javapoet.*;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class PersonBuilder {
    private final Filer filer;
    private final List<ClassName> result;


    public PersonBuilder(Filer filer, List<ClassName> result) {
        this.filer = filer;
        this.result = result;
    }


    public void generate() throws IOException {

        for (ClassName key : result) {
            String packageName = key.packageName();
            String simpleName = key.simpleName();

            FieldSpec age = FieldSpec.builder(int.class, "age")
                    .addModifiers(Modifier.PRIVATE)
                    .build();
            FieldSpec name = FieldSpec.builder(String.class, "name")
                    .addModifiers(Modifier.PRIVATE)
                    .initializer("$S", "qiyue")
                    .build();
            MethodSpec constructorMethod = MethodSpec.constructorBuilder()
                    .addModifiers(Modifier.PUBLIC)
                    .addParameter(String.class, "name")
                    .addStatement("this.$N = $N", "name", "name")
                    .build();
            MethodSpec getAgeMethod = MethodSpec.methodBuilder("getAge")
                    .addModifiers(Modifier.PUBLIC)
                    .addStatement("return " + age.name)
                    .returns(age.type)
                    .build();
            MethodSpec getNameMethod = MethodSpec.methodBuilder("getName")
                    .addModifiers(Modifier.PUBLIC)
                    .addStatement("return " + name.name)
                    .returns(name.type)
                    .build();
            TypeSpec typeSpec = TypeSpec.classBuilder("Person")
                    .addModifiers(Modifier.PUBLIC).addMethod(getNameMethod)
                    .addMethod(getAgeMethod)
                    .addMethod(constructorMethod)
                    .addField(age)
                    .addField(name)
                    .build();
            JavaFile javaFile = JavaFile.builder(key.packageName(), typeSpec).build();
            javaFile.writeTo(filer);
        }
    }


    public void generate1() throws IOException {
        String classC = null;
        Class<?> aClass = null;


        for (ClassName key : result) {
            String packageName = key.packageName();
            String simpleName = key.simpleName();

            for (Field declaredField : aClass.getDeclaredFields()) {
                TypeName typeName = ParameterizedTypeName.get(declaredField.getType());
                FieldSpec mapField = FieldSpec.builder(typeName, declaredField.getName(), Modifier.PRIVATE).build();

               /* MethodSpec.Builder methodSetter = MethodSpec.methodBuilder(generateName("set", declaredField))
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(declaredField.getType(), declaredField.getName())
                        .beginControlFlow("this." + declaredField.getName() + " = " + declaredField.getName())
                        .endControlFlow();*/
             /*   MethodSpec.Builder methodGetter = MethodSpec.methodBuilder(generateName("get", declaredField))
                        .addModifiers(Modifier.PUBLIC)

                        .beginControlFlow("return this." +declaredField.getName())
                        .endControlFlow()
                        .returns(declaredField);*/

                //    MethodSpec methodSpec = methodSetter.build();
                TypeSpec helloWorld = TypeSpec.classBuilder(key.simpleName() + "Factory")
                        .addModifiers(Modifier.PUBLIC)
                        .addField(mapField)
                        //          .addMethod(methodSpec)
                        .build();
                JavaFile javaFile = JavaFile.builder(key.packageName(), helloWorld)
                        .build();
                javaFile.writeTo(filer);

            }


        }
    }


    private static void generateGetter(Field declaredField) {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("public ").append(declaredField.getType().getName()).append(" ");
        String name = generateName("get", declaredField);
        stringBuffer.append(name).append("() {");
        stringBuffer.append("return this.").append(declaredField.getName());
        stringBuffer.append("}");
        System.out.println(stringBuffer.toString());
    }

    private static void generateSetter(Field declaredField) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("public void ");
        String name = generateName("set", declaredField);
        stringBuffer.append(name).append("(").append(declaredField.getType().getName()).append(" ").append(declaredField.getName()).append(") {");
        stringBuffer.append("this.").append(declaredField.getName()).append("=").append(declaredField.getName());
        stringBuffer.append("}");
        System.out.println(stringBuffer.toString());
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
