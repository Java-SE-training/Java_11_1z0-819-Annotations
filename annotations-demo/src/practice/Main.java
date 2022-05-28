package practice;

import practice.models.Engineer;
import practice.models.Person;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 24/05/2022
 */
@SuppressWarnings("deprecation")
public class Main {
  public static void main(String[] args) {
      Person engineer = new Engineer(1L, "Eric Johnson");
    System.out.println(engineer.details());
    System.out.println(engineer.detailsV2());

    var annotations = engineer.getClass().getAnnotations();
    System.out.println(annotations.length);

  }
}
