package com.gofluent.shoppingbasket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofluent.shoppingbasket.models.Basket;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {

}
