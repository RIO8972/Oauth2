package com.example.Oauth2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("/")
    public String home() {
        return "/articles/home";
    }

    @GetMapping("/oauth-login")
    public String _login (){
        return "/oauth/oauthLogin";
    }
}
