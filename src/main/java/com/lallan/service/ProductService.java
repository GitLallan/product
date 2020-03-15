package com.lallan.service;

import com.lallan.entites.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
 public List<ProductEntity>getAllProduct();
 public  ProductEntity getProductById(Long id);
 public  ProductEntity updateProduct(ProductEntity entity);
 public  void deleteProductById(Long id);
}
