package practice;

import practice.annotations.Version;
import practice.annotations.Versions;
import practice.models.Engineer;
import practice.models.Person;

import java.util.Arrays;

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
    System.out.println(annotations.length + " annotation(s) found");

    Arrays.stream(annotations).forEach(annotation -> {
      if(annotation instanceof Version){
        var version = (Version) annotation;
        System.out.println("Version annotation on type");
        System.out.printf("Version #%d%n  Author [%s]", version.value(),version.author());
      }else if (annotation instanceof Versions){
        var versions = (Versions) annotation;
        for (var version : versions.value()) {
          System.out.println("\n Versions annotation on type");
          System.out.printf("Version #%d%n  Author [%s]", version.value(),version.author());
        }
      }
    });

  }
}
