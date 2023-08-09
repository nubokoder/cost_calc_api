package com.example.keihiapi.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
@Data
@Table(name = "costs")

public class Cost {
    @Id
    @Generated
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long cost_id; //ID, auto-generated
    private Date date; //Date bought
    private String name;
    private Integer quantity;
    private Integer amount; //Because in country where I live money is
    // not divide to 1/100(e.g. Cents) I make this field as integer
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "costs_category",
            joinColumns = @JoinColumn(name = "cost_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> category = new HashSet<>();
    //public cost (){

   // }

    public Long getCost_id() {
        return cost_id;
    }

    public void setCost_id(Long cost_id) {
        this.cost_id = cost_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Set<Category> getCategory() {
        return category;
    }

    public void setCategory(Set<Category> category) {
        this.category = category;
    }
}
