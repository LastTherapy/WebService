package ru.dobrocraft.rest_learn.entity;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter

@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  int id;

    private String name;

    private int balance;
}
