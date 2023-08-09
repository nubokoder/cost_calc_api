package com.example.keihiapi.model;

import java.util.Date;
import java.util.Set;

public class CostRequest {
    private Date date; //Date bought
    private String name;
    private Integer quantity;
    private Integer amount;
    private String category;

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getCategory() {return category;}
}
