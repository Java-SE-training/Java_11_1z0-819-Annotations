package practice.annotations;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 28/05/2022
 */
public @interface Version {
  //Fields as a method
  int value() default 1; // "default" keyword makes it  optional
  String author(); // mandatory
  String licence() default "MIT"; // "default" keyword makes it  optional

  //Array field
  String[] environments() default {"dev","prod"}; // "default" keyword makes it  optional
}
