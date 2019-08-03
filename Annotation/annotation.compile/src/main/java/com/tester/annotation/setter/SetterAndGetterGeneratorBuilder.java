package com.tester.annotation.setter;

import com.squareup.javapoet.*;
import com.tester.annotation.setter.case1.SetterAndGetter;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static javax.lang.model.element.Modifier.PRIVATE;
import static javax.lang.model.element.Modifier.PUBLIC;

public class SetterAndGetterGeneratorBuilder {

    private Filer filer;
    private List<GeneratorAnnotatedClass> resultGeneratorAnnotatedClass;

    public SetterAndGetterGeneratorBuilder(Filer filer, List<GeneratorAnnotatedClass> resultGeneratorAnnotatedClass) {

        this.filer = filer;
        this.resultGeneratorAnnotatedClass = resultGeneratorAnnotatedClass;
    }

    public void generate() throws IOException, ProcessingException {


        for (GeneratorAnnotatedClass generatorAnnotatedClass : resultGeneratorAnnotatedClass) {
            try {
                TypeElement annotatedClassElement = generatorAnnotatedClass.getAnnotatedClassElement();
                ClassName className = ClassName.get(annotatedClassElement);

                String targetName = className.simpleName().toString();
                String builderName = String.format("%sBuilder", targetName);
                String packageName = className.packageName();
                ClassName builderType = ClassName.get(packageName, builderName);
                TypeSpec.Builder builder = TypeSpec
                        .classBuilder(builderName)
                        .addModifiers(PUBLIC, Modifier.FINAL);

                List<VariableElement> vars = generatorAnnotatedClass.getVariableElements();
                List<FieldSpec> fields = new ArrayList<FieldSpec>(vars.size());
                List<MethodSpec> setters = new ArrayList<MethodSpec>(vars.size());
                List<MethodSpec> getters = new ArrayList<MethodSpec>(vars.size());
                for (VariableElement var : vars) {
                    TypeName typeName = TypeName.get(var.asType());
                    String name = var.getSimpleName().toString();

                    // create the field
                    fields.add(FieldSpec.builder(typeName, name, PRIVATE).build());

                    // create the setter
                    setters.add(MethodSpec.methodBuilder(name)
                            .addModifiers(PUBLIC)
                            .returns(builderType)
                            .addParameter(typeName, name)
                            .addStatement("this.$N = $N", name, name)
                            .addStatement("return this")
                            .build());

                }
                // create the build method
                TypeName targetType = TypeName.get(generatorAnnotatedClass.getAnnotatedElement().asType());
                MethodSpec.Builder buildMethodBuilder =
                        MethodSpec.methodBuilder("build")
                                .addModifiers(PUBLIC)
                                .returns(targetType)
                                .addStatement("$1T $2N = new $1T()", targetType, targetName);

                for (FieldSpec field : fields) {
                    buildMethodBuilder
                            .addStatement("$1N.$2N = this.$2N", targetName, field);
                }

                buildMethodBuilder.addStatement("return $N", targetName);
                MethodSpec buildMethod = buildMethodBuilder.build();
                builder.addMethod(buildMethod);
                builder.addFields(fields).addMethods(setters);

                JavaFile javaFile = JavaFile.builder(className.packageName(), builder.build()).build();

                javaFile.writeTo(filer);
            } catch (Exception e) {
                throw new ProcessingException(generatorAnnotatedClass.getAnnotatedElement(), "Only classes can be annotated with @%s",
                        SetterAndGetter.class.getSimpleName());
            }
        }

    }
}
