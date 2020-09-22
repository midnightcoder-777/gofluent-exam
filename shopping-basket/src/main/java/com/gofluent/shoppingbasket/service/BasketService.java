package com.gofluent.shoppingbasket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gofluent.shoppingbasket.models.Basket;
import com.gofluent.shoppingbasket.models.Item;

@Service
public interface BasketService {

	public List<Item> getItems();
	
	public Item getItem(Long id);
	
	public void saveItems(ArrayList<Item> items);

	public Basket getBasket(Long id);
	
	public void saveBasket(Basket basket);
	
	public void updateBasket(Basket basket);
	
	public Basket addBasketItem(Long basketId, Item item);
	
	public Basket removeBasketItem(Basket basket);

}

