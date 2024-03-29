package com.example.SpringbootElasticSearchExample.Controller;

import com.example.SpringbootElasticSearchExample.Entity.Product;
import com.example.SpringbootElasticSearchExample.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService  productService;
    @GetMapping("/findAll")
    Iterable<Product> findAll(){
        return productService.getProducts();

    }



    @PostMapping("/insert")
    public Product insertProduct(@RequestBody  Product product){
        return productService.insertProduct(product);
    }

}