package practice;

import practice.annotations.Environment;
import practice.annotations.Version;
import practice.annotations.Versions;
import practice.models.Engineer;
import practice.models.Person;

import java.util.Arrays;
import java.util.stream.Collectors;

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
    System.out.println(engineer);

    Engineer engineer2 = new Engineer(1L, "Scott Tiger");

    if(getDept() != null)
    engineer2.setDepartement(getDept());

    System.out.println(engineer2);

    var annotations = engineer.getClass().getAnnotations();
    System.out.println(annotations.length + " annotation(s) found");

    Arrays.stream(annotations).forEach(annotation -> {
      if(annotation instanceof Version){
        var version = (Version) annotation;
        System.out.println("Version annotation on type");
        System.out.printf("Version #%d  Author [%s]", version.value(),version.author());
      }else if (annotation instanceof Versions){
        var versions = (Versions) annotation;
        for (var version : versions.value()) {
          System.out.println("\n Versions annotation on type");
          System.out.printf("Version #%d  Author [%s]", version.value(),version.author());
        }
      } else if (annotation instanceof Environment) {
        var environment = (Environment) annotation;
          System.out.println("\n Environment annotation on type");
          System.out.printf("Found %s environment annotation%n", environment.value());
      }
    });

    var annotation = engineer.getClass().getAnnotation(Environment.class);

    if(annotation != null){
      System.out.println("\n Engineer has Environment annotation");
    } else {
      System.out.println("\n Engineer doesn't have Environment annotation");
    }

  }

  private static String getDept(){
    String value = "";
    return value;
  }
}
