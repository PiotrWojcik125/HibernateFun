package hibernatefun.intrastructure.mapper;

import hibernatefun.domain.aggregate.Author;
import hibernatefun.intrastructure.entity.AuthorEntity;
import liquibase.pro.packaged.A;

public class AuthorEntityMapper {
  private AuthorEntityMapper() {
  }

  public static Author toDomain(AuthorEntity authorEntity) {
    return new Author(authorEntity.getFirstName(), authorEntity.getLastName());
  }

  public static AuthorEntity toEntity(Author author) {
    AuthorEntity authorEntity = new AuthorEntity();
    authorEntity.setFirstName(author.getFirstName());
    authorEntity.setLastName(author.getLastName());
    return authorEntity;
  }
}
