package practice.annotations;

import java.lang.annotation.*;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 28/05/2022
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) // To make "Version" annotation taken into account by compiler during runtime
@Repeatable(Versions.class) //To enable annotations repetition
//@Retention(RetentionPolicy.SOURCE) // To make "Version" annotation ignored by compiler during runtime
public @interface Version {
  //Fields as a method
  int value(); // mandatory
  String author() default "";  // "default" keyword makes it  optional
  String licence() default "MIT"; // "default" keyword makes it  optional

  //Array field
  String[] environments() default {"dev","prod"}; // "default" keyword makes it  optional
}
