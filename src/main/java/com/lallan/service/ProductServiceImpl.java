package com.lallan.service;

import com.lallan.entites.ProductEntity;
import com.lallan.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public List<ProductEntity> getAllProduct() {
       List<ProductEntity>productEntityList=repository.findAll();
       if(productEntityList.size()>0){
           return  productEntityList;
       }
        return new ArrayList<ProductEntity>();
     /* List<ProductEntity> productEntities=repository.findAll();
      return productEntities;*/
    }

    @Override
    public ProductEntity getProductById(Long id) {
        Optional<ProductEntity> productEntity=repository.findById(id);
        if(productEntity.isPresent()){
            return productEntity.get();
        }
        return null;
    }

    @Override
    public ProductEntity updateProduct(ProductEntity entity) {
        Optional<ProductEntity> productEntity=repository.findById(entity.getId());
        if(productEntity.isPresent()){
            ProductEntity newProductEntity=productEntity.get();
            newProductEntity.setName(entity.getName());
            newProductEntity.setBrand(entity.getBrand());
            newProductEntity.setMadeIn(entity.getMadeIn());
            newProductEntity.setPrice(entity.getPrice());

            newProductEntity=repository.save(newProductEntity);
           return newProductEntity;
        }else
         entity=repository.save(entity);
        return entity;
    }

    @Override
    public void deleteProductById(Long id) {
     Optional<ProductEntity> productEntity=repository.findById(id);
     if (productEntity.isPresent()){
         repository.deleteById(id);
     }
     System.out.println(" Id Not Found");

    }

}
