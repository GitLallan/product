package com.lallan.controller;

import com.lallan.entites.ProductEntity;
import com.lallan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/p1")
public class ProductRestController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<List<ProductEntity>> getAllProduct(){
     List<ProductEntity>productEntityList=productService.getAllProduct();
     return new ResponseEntity<List<ProductEntity>>(productEntityList,new HttpHeaders(), HttpStatus.OK);

    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductEntity> getProductById(@PathVariable("id")Long id){
        ProductEntity productEntity=productService.getProductById(id);
        return new ResponseEntity<ProductEntity>(productEntity, new HttpHeaders(),HttpStatus.OK);
    }

    @PostMapping("/product")
    public  ResponseEntity<ProductEntity> createByProducts(@RequestBody  ProductEntity productEntity){
        ProductEntity entity=productService.updateProduct(productEntity);
        return  new ResponseEntity<ProductEntity>(entity, new HttpHeaders(), HttpStatus.OK);


    }

    @DeleteMapping("product/{id}")
    public void deleteProductById(@PathVariable ("id") Long id){
        productService.deleteProductById(id);

    }


}
