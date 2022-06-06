package hibernatefun.endpoint.mapper;

import hibernatefun.domain.entity.Author;
import hibernatefun.endpoint.dto.AuthorDto;

public class AuthorDtoMapper {
  private AuthorDtoMapper() {
  }

  public static AuthorDto toDto(Author author) {
    return new AuthorDto(author.getFirstName(), author.getLastName());
  }

  public static Author toDomain(AuthorDto authorDto) {
    return new Author(authorDto.getFirstName(), authorDto.getLastName());
  }
}
