package hibernatefun.endpoint.controller;

import hibernatefun.domain.service.AuthorService;
import hibernatefun.endpoint.dto.AuthorDto;
import hibernatefun.endpoint.mapper.AuthorDtoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/vi/")
public class AuthorController {

  private final AuthorService authorService;

  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @PostMapping("/create")
  public void createAuthor(@RequestBody AuthorDto author) {
    authorService.createAuthor(AuthorDtoMapper.toDomain(author));
  }
}
