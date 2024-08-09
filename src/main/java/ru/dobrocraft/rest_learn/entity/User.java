package ru.dobrocraft.rest_learn.entity;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(unique = true)
    private String name;

    private int balance;
}
