package hibernatefun.endpoint.controller;

import hibernatefun.domain.service.AuthorWriteService;
import hibernatefun.endpoint.dto.AuthorDto;
import hibernatefun.endpoint.mapper.AuthorDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/author")
public class AuthorController {

  private final AuthorWriteService authorDomainService;

  public AuthorController(AuthorWriteService authorDomainService) {
    this.authorDomainService = authorDomainService;
  }

  @PostMapping("/create")
  @Transactional
  public void createAuthor(@RequestBody AuthorDto author) {
    for (int i = 0; i < 51; i++) {
      authorDomainService.createAuthor(AuthorDtoMapper.toDomain(author));
    }
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<AuthorDto> getAuthor() {
    return new ResponseEntity<>(new AuthorDto("1", "2"), HttpStatus.OK);
  }
}
