package com.example.Oauth2.controller;


import com.example.Oauth2.domain.article.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ArticleController {

    final private ArticleRepository articleRepository;

    @GetMapping("/")
    public String home() {
        return "/articles/home";
    }

    @GetMapping("/oauth-login")
    public String _login (){
        return "/oauth/oauthLogin";
    }

    @GetMapping("/create")
    public String create() {
        return "/articles/crud/create";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("articles",
                articleRepository.findAll());
        return "/articles/crud/index";
    }
}
