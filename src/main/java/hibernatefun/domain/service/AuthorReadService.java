package hibernatefun.domain.service;

import hibernatefun.domain.entity.Author;

import java.util.Optional;

public interface AuthorReadService {

  Optional<Author> getAuthorById(Long id);
}
