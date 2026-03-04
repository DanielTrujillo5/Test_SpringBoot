package com.epw.Product.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public class UpdateProductRequest {

    @NotBlank(message = "name is required")
    @Size(max = 150, message = "name must be <= 150 characters")
    private String name;

    @NotBlank(message = "description is required")
    @Size(max = 500, message = "description must be <= 500 characters")
    private String description;

    @NotNull(message = "price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "price must be greater than 0")
    private BigDecimal price;

    @NotNull(message = "stock is required")
    @Min(value = 0, message = "stock cannot be negative")
    private Integer stock;

    public UpdateProductRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}