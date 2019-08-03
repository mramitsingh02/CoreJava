package com.tester.annotation.builder.case1;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.VariableElement;
import java.io.IOException;
import java.util.Set;

public class BuilderFactory {

    private Set<ClassName> result;
    private Filer filer;

    public BuilderFactory(Filer filer, Set<ClassName> result) {
        this.result = result;
        this.filer = filer;
    }

    public void generate() throws IOException {

        for (ClassName className : result) {
// get element metadata

            String packageName = getPackageName(className);
            String targetName = lowerCamelCase(className.simpleName().toString());
            Set<VariableElement> vars = getNonPrivateVariables(className);

            String builderName = String.format("%sBuilder", targetName);
            ClassName builderType = ClassName.get(packageName, builderName);

            TypeSpec.Builder builder = TypeSpec
                    .classBuilder(builderName)
                    .addModifiers(Modifier.PUBLIC, Modifier.FINAL);


            JavaFile javaFile = JavaFile.builder(className.packageName(), builder.build())
                    .build();

            javaFile.writeTo(filer);
        }


    }

    private Set<VariableElement> getNonPrivateVariables(ClassName className) {
        //TypeElement typeElement = (TypeElement) annotatedElement;
        return null;
    }

    private String lowerCamelCase(String toString) {
        return toString.toLowerCase();
    }

    private String getPackageName(ClassName className) {
    return className.packageName();
    }
}
