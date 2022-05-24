package practice.models;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 24/05/2022
 */
public class Person {
  private Long id;
  private String name;

  public Person() {
  }

  public Person(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public String greet() {
    return "Hi, I am " + this.name;
  }

  @Override
  public String toString() {
    return "Person{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }
}
