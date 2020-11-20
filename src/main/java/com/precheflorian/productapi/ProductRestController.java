package com.precheflorian.productapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
  @Autowired
  private ProductRepository productRepository;
  @GetMapping("/products")
  public List<Product> getAllProducts(){
    return productRepository.findAll();
  }

}
