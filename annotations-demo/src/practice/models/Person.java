package practice.models;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 24/05/2022
 */
public class Person {
  protected  Long id;
  protected  String name;

  public Person() {
  }

  public Person(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public String greet() {
    return "Hi, I am " + this.name;
  }


  public String details() {
    return String.format("[%d] %s", this.id, this.name);
  }
}
