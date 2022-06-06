package hibernatefun.infrastructure.entity;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class AuthorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
  @SequenceGenerator(name = "author_generator", sequenceName = "author_seq")
  private Long id;
  private String firstName;
  private String lastName;

  public AuthorEntity() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
