package ru.semyak.springcourse.springlesson.models;

import jakarta.validation.constraints.*;

public class Person {
    private int id;


    @NotEmpty(message = "Имя не должно быть пустым!")
    @Size(min = 2, max = 20, message = "Значение имени некорректное!")
    private String name;

    @Min(value = 0, message = "Возраст не может быть отрицательным")
    @Max(value = 120, message = "Значение возраста слишком большое!")
    private int age;

    @NotEmpty(message = "Значение эл.почты обязательно!")
    @Email(message = "Почта должна быть валидной!")
    private String email;

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
