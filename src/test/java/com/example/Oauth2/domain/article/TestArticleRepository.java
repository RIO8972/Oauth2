package com.example.Oauth2.domain.article;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestArticleRepository {
    @Autowired ArticleRepository articleRepository;
    @Test
    public void testSaveArticle() {
        //1예상데이터
        String title = "title";
        String content = "content";
        //2 데이터 저장
        articleRepository.save(Article.builder()
                .title(title)
                .content(content)
                .build());
        //3 데이터 조회
        Article _article = articleRepository
                .findById(1L)
                .orElse(null);
        //4 확인
        assertThat(_article.getTitle()).isEqualTo(title);
        assertThat(_article.getContent()).isEqualTo(content);
    }
}
