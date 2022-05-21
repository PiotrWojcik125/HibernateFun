package hibernatefun.intrastructure;

import hibernatefun.domain.aggregate.Author;
import hibernatefun.domain.service.AuthorService;
import hibernatefun.intrastructure.mapper.AuthorEntityMapper;
import hibernatefun.intrastructure.repository.AuthorJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class AuthorServiceImpl implements AuthorService {
  private final AuthorJpaRepository authorJpaRepository;

  public AuthorServiceImpl(AuthorJpaRepository authorJpaRepository) {
    this.authorJpaRepository = authorJpaRepository;
  }

  @Override
  public Author createAuthor(Author author) {
    return AuthorEntityMapper.toDomain(authorJpaRepository.save(AuthorEntityMapper.toEntity(author)));
  }
}
