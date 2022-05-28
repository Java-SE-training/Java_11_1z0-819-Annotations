package practice.annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 28/05/2022
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Environment {
  String value();
}
