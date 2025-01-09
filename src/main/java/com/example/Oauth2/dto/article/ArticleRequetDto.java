package com.example.Oauth2.dto.article;

import com.example.Oauth2.domain.article.Article;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor
public class ArticleRequetDto {
    private String title;
    private String content;

    public ArticleRequetDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article toEntity() {
        return Article.builder()
        .title(title)
        .content(content)
        .build();
    }
}
