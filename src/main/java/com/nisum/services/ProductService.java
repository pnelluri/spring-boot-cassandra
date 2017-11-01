package com.nisum.services;


import java.util.List;
import java.util.UUID;

import com.nisum.commands.ProductForm;
import com.nisum.domain.Product;

public interface ProductService {

    List<Product> listAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
