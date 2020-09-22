package com.gofluent.shoppingbasket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofluent.shoppingbasket.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	
}