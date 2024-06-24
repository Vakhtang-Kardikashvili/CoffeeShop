package com.example.cofeeShop;

import org.springframework.data.repository.CrudRepository;

 interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
