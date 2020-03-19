package com.example.validation

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

class UserForm {
    @NotNull
    @Size(min =2, max=30)
    private String name

    private Integer age;


    UserForm(String name, Long age) {
        this.name = name
        this.age = age
    }

    @Override
    String toString() {
        return "User(Name: ${this.name} , Age: ${this.age})"
    }
}
