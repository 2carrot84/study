package com.example.demo.cafekiosk.unit.order;

import com.example.demo.cafekiosk.unit.beverage.Beverage;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Order {

  private final LocalDateTime orderDateTime;
  private final List<Beverage> beverages;
}
