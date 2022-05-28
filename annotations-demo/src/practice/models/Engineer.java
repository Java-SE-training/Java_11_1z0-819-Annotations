package practice.models;

import practice.annotations.Version;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 24/05/2022
 */
@Version(value = 1,author = "John", environments = {"e1","e2"})
@Version(value = 2,author = "Scott", environments = {"e1","e2"})
public class Engineer extends Person{

  //@Version(1) Not working
  private String departement;

  @Version(2)
  public Engineer() {
  }

  @Version(3)
  public Engineer(Long id, String name) {
    super(id, name);
  }

  @Override
  public String details() {
    return String.format("[Engineer #%d] %s", this.id, this.name);
  }


}
