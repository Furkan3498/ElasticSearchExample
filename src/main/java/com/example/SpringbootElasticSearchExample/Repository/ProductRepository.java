package com.example.SpringbootElasticSearchExample.Repository;

import com.example.SpringbootElasticSearchExample.Entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {

}