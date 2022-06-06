package hibernatefun.infrastructure;

import hibernatefun.domain.entity.Author;
import hibernatefun.domain.service.AuthorReadService;
import hibernatefun.infrastructure.mapper.AuthorEntityMapper;
import hibernatefun.infrastructure.repository.AuthorJpaRepository;

import java.util.Optional;

public class AuthorReadServiceImpl implements AuthorReadService {


  private final AuthorJpaRepository authorJpaRepository;

  public AuthorReadServiceImpl(AuthorJpaRepository authorJpaRepository) {
    this.authorJpaRepository = authorJpaRepository;
  }

  @Override
  public Optional<Author> getAuthorById(Long id) {
    return authorJpaRepository.findById(id).map(AuthorEntityMapper::toDomain);
  }
}
