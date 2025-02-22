package com.example.Oauth2.domain.user;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;
import lombok.*;

@Entity
@Getter @ToString
@DynamicUpdate // Entity update시, 원하는 데이터만 update하기 위함
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Table(name="USERS") //https://lktgt.tistory.com/47 USER는 얘약어여엇 USERS사용
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "user_id")
    private Long id;
    @Column(name = "username", nullable = false)
    private String username; // 로그인한 사용자의 이름
    @Column(name = "email", nullable = false)
    private String email; // 로그인한 사용자의 이메일
    @Column(name = "provider", nullable = false)
    private String provider; // 사용자가 로그인한 서비스(ex) google, naver..)

    public User updateUser(String username, String email) {
        this.username = username;
        this.email = email;
        return this;
    }
}
