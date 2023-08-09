package com.example.keihiapi.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
@Entity
@Data


@Table(name = "users")
public class User {
    @Id
    @Generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String passhash;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasshash() {
        return passhash;
    }

    public void setPasshash(String passhash) {
        this.passhash = passhash;
    }
}
