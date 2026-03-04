package com.epw.Product.Service;

import com.epw.Product.dto.ProductResponse;
import com.epw.Product.dto.CreateProductRequest;
import com.epw.Product.dto.UpdateProductRequest;

import java.util.List;

public interface ProductService {

    ProductResponse create(CreateProductRequest request);

    List<ProductResponse> list();

    ProductResponse getById(Long id);

    ProductResponse update(Long id, UpdateProductRequest request);

    void delete(Long id);
}