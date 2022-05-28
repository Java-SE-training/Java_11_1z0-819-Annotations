package practice.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 28/05/2022
 */
//@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) // To make "Version" annotation taken into account by compiler during runtime
public @interface Versions {
  Version[] value();
}
