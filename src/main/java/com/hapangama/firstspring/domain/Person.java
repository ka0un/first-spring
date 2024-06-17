package com.hapangama.firstspring.domain;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private int age;
    @Column
    @Enumerated(EnumType.STRING)
    private Role title;

    public Person(String name, int age, Role title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    protected Person(){}


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getTitle() {
        return title;
    }

    public void setTitle(Role title) {
        this.title = title;
    }

}
