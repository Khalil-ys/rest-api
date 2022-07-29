package com.restapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User extends BaseEntity{

    @Id
    @SequenceGenerator(name = "user_seq_gen",sequenceName = "user_gen",initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq_gen")
    @Column(name = "id")
    private Integer id;
    @Column(name = "name",length = 20)
    private String name;
    @Column(name = "surname",length = 20)
    private String surname;
}
