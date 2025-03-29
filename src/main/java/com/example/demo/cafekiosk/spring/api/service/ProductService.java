package com.example.demo.cafekiosk.spring.api.service;

import com.example.demo.cafekiosk.spring.api.service.product.response.ProductResponse;
import com.example.demo.cafekiosk.spring.domain.product.Product;
import com.example.demo.cafekiosk.spring.domain.product.ProductRepository;
import com.example.demo.cafekiosk.spring.domain.product.ProductSellingStatus;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

  private final ProductRepository productRepository;

  public List<ProductResponse> getSellingProducts() {
    List<Product> products = productRepository.findAllBySellingStatusIn(ProductSellingStatus.forDisplay());

    return products.stream()
        .map(ProductResponse::of)
        .collect(Collectors.toList());
  }

}
