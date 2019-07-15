package com.tester.annotation.builder.case1;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
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

            TypeSpec.Builder navigatorClass = TypeSpec
                    .classBuilder(className.simpleName() + "Builder")
                    .addModifiers(Modifier.PUBLIC, Modifier.FINAL);

           // FieldSpec.Builder defaultField = FieldSpec.builder(Modifier.PRIVATE, "student", )


         /*   Class<? extends ClassName> classNameClass = className.getClass();

            Field[] fields = classNameClass.getDeclaredFields();
            for (Field field : fields) {
                MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("build" + field.getName())
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .addParameter(field.getType(), field.getName())
                        .addStatement("return this");
                MethodSpec methodSpec = methodBuilder.build();
                navigatorClass.addMethod(methodSpec);


            }
*/
            JavaFile javaFile = JavaFile.builder(className.packageName(), navigatorClass.build())
                    .build();

            javaFile.writeTo(filer);
        }


    }
}
