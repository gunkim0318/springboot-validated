package com.gun.app.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
public class Member {
    @NotBlank
    private String userId;
    private String password;
    @NotBlank
    @Size(max=3)
    private String userName;
    @Email(message="이메일 형식을 확인해주세요.")
    @NotEmpty
    private String email;
    private String gender;
}