package com.gofluent.shoppingbasket.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gofluent.shoppingbasket.models.Basket;
import com.gofluent.shoppingbasket.models.Item;
import com.gofluent.shoppingbasket.service.BasketService;

@RestController
@RequestMapping("api/v1/gofluent/")
public class BasketController {
	

	private static final Logger logger = LoggerFactory.getLogger(BasketController.class);
	
	@Autowired
	private BasketService basketService;
	
	@GetMapping(value = "/items", produces = "application/json")
	public ResponseEntity<List<Item>> getItemList(){
		
		List<Item> items = basketService.getItems();
		
		return new ResponseEntity<List<Item>>(items, null, HttpStatus.OK);
	
	}
	
	@PostMapping(value = "/items", consumes = "application/json")
	public void saveItems(@RequestBody ArrayList<Item> item){
		logger.info("Item: {}", item.toString());
		basketService.saveItems(item);
	}
	
	
	@GetMapping(value = "/basket/{id}", consumes = "application/json")
	public ResponseEntity<Basket> getbasket(@PathVariable Long id){
		logger.info("Basket ID: {}", id);
		Basket basket = basketService.getBasket(id);
		return new ResponseEntity<Basket>(basket, null, HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/basket/add/{basketId}", consumes = "application/json")
	public ResponseEntity<Basket> addBasketItem(@PathVariable Long basketId, @RequestBody Item item){
		logger.info("BasketID: {} and Item: {}", basketId, item.toString());
		Basket response = basketService.addBasketItem(basketId, item);
		return new ResponseEntity<Basket>(response, null, HttpStatus.OK);
	}
	
	@PutMapping(value = "/basket/remove", consumes = "application/json")
	public ResponseEntity<Basket> removeBasketItem(@RequestBody Basket basket){
		logger.info("Basket: {}", basket);
		Basket response = basketService.removeBasketItem(basket);
		return new ResponseEntity<Basket>(response, null, HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/basket", consumes = "application/json")
	public void saveBasket(@RequestBody Basket basket){
		logger.info("Basket: {}", basket.toString());
		basketService.saveBasket(basket);
	}

}
