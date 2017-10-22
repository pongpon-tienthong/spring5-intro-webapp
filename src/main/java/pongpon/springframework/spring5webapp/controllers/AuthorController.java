package pongpon.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pongpon.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
