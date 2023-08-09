package com.example.keihiapi.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
@Entity
@Data
@Table(name = "category")

public class Category {
    @Id
    @Generated
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer category_id;
    @Column
    private String category_name;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
