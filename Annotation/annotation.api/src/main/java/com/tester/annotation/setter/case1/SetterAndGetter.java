package com.tester.annotation.setter.case1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface SetterAndGetter {
AccessLevel value() default AccessLevel.PUBLIC;

AnyAnnotation[] onMethod() default {};
AnyAnnotation[] onParam() default {};


}
