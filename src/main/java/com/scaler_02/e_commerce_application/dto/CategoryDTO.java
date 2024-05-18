package com.scaler_02.e_commerce_application.dto;

import com.scaler_02.e_commerce_application.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    private Long id;
    private String title;

    public Category toCategory() {
        Category category = new Category();
        category.setId(this.id);
        category.setTitle(this.title);
        return category;
    }
}
