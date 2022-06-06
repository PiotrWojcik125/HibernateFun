package hibernatefun.infrastructure;

import hibernatefun.domain.entity.Author;
import hibernatefun.domain.service.AuthorWriteService;
import hibernatefun.infrastructure.entity.AuthorEntity;
import hibernatefun.infrastructure.mapper.AuthorEntityMapper;
import hibernatefun.infrastructure.repository.AuthorJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class AuthorWriteServiceImpl implements AuthorWriteService {
  private final AuthorJpaRepository authorJpaRepository;

  public AuthorWriteServiceImpl(AuthorJpaRepository authorJpaRepository) {
    this.authorJpaRepository = authorJpaRepository;
  }

  @Override
  public Author createAuthor(Author author) {
    AuthorEntity authorEntity = authorJpaRepository.save(AuthorEntityMapper.toEntity(author));
    return AuthorEntityMapper.toDomain(authorEntity);
  }
}
