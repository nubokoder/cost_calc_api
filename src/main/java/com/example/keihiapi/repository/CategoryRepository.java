package com.example.keihiapi.repository;

import com.example.keihiapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
   // Optional<Category> findByName(String category_name);
      @Query("select ep from Category ep where ep.category_name=:category_name")
    public Category searchCategoryByName (@Param("category_name") String category_name);
}
