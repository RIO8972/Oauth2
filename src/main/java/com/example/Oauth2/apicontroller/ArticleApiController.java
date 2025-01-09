package com.example.Oauth2.apicontroller;

import com.example.Oauth2.domain.article.ArticleRepository;
import com.example.Oauth2.dto.article.ArticleRequetDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ArticleApiController {
    final private ArticleRepository articleRepository;
    @PostMapping("/crate/articles")
    public Long create(@RequestBody ArticleRequetDto dto) {
        //나중에 서비스 객체 추가하기
        return articleRepository.save(dto.toEntity()).getId();
    }
}
