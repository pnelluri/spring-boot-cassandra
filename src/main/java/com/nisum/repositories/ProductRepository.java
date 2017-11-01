package com.nisum.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nisum.domain.Product;

import java.util.UUID;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, UUID> {
}
