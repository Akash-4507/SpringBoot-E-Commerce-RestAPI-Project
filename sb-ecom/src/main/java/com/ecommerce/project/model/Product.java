package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private Long product_Id;
    private String ProductName;
    private String Description;
    private Integer Quantity;
    private double Price;
    private Integer discount;
    private double specialPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
