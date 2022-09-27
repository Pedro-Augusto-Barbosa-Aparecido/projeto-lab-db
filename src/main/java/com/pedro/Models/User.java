package com.pedro.Models;

import com.pedro.Models.generic.BaseModel;
import com.pedro.exceptions.InvalidField;
import org.jetbrains.annotations.NotNull;

public class User extends BaseModel {
    private String email;
    private String cpf;

    public User(String email, String cpf, String name) {
        this.email = email;
        this.cpf = cpf;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(@NotNull String newEmail) throws Exception {
        if (newEmail.equalsIgnoreCase(this.email))
            throw new InvalidField("O email eh igual ao ja cadastrado!!!");

        this.email = newEmail;

    }

}
