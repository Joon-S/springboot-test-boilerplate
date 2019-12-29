package com.joons.springboottestboilerplate.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "school")
@Getter
@Setter
public class School {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "^.*[학교|school]$")
    @Size(min = 5, message = "최소한 5자리수 이상으로 추가해야한다.")
    @Column(name = "name")
    private String name;
}
