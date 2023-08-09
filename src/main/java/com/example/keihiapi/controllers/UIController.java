package com.example.keihiapi.controllers;

import com.example.keihiapi.model.Category;
import com.example.keihiapi.model.Cost;
import com.example.keihiapi.model.CostRequest;
import com.example.keihiapi.repository.CategoryRepository;
import com.example.keihiapi.repository.CostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UIController {
    @Autowired
    CostRepository costRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @GetMapping(path="/getcosts")
    public List<Cost> allCosts(){
        return costRepository.findAll();
    }
    @PostMapping(path="/savecost")
        public List<Cost> allCosts(@RequestBody CostRequest costRequest){
        Cost cost = new Cost();
        cost.setDate(costRequest.getDate());
        cost.setName(costRequest.getName());
        cost.setAmount(costRequest.getAmount());
        cost.setQuantity(costRequest.getQuantity());

        String stringCategory = costRequest.getCategory();

        Set<Category> categories = new HashSet<>();

        Category costCategory = categoryRepository.searchCategoryByName(stringCategory);
        categories.add(costCategory);
        cost.setCategory(categories);
        costRepository.save(cost);
        System.out.println("Saved");
            return costRepository.findAll();
    }
    @PostMapping(path="/addnewcategory")
    //public List<Category> categories(@RequestBody Category newCategory){
    public void categories(@RequestBody Category newCategory){
        categoryRepository.save(newCategory);
        System.out.println("Saved");
       // return categoryRepository.findAll();
    }
    @GetMapping(path="/categories")
    public List<Category> categories(){

         return categoryRepository.findAll();
    }

}
