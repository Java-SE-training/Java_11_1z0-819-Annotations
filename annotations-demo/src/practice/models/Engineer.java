package practice.models;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 24/05/2022
 */
public class Engineer extends Person{
  public Engineer() {
  }

  public Engineer(Long id, String name) {
    super(id, name);
  }

  @Override
  public String details() {
    return String.format("[Engineer #%d] %s", this.id, this.name);
  }


}
