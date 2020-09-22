import { Component, OnInit } from '@angular/core';
import { ItemService } from '../../services/item.service'
import { BasketService } from '../../services/basket.service'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  public items;
  public basket;

  validMessage: string = "";

  constructor(private itemService:ItemService, private basketService:BasketService) { }

  ngOnInit(): void {
    this.getItems();
    this.getBasket();
  }

  getItems(){
    this.itemService.getItems().subscribe(
      data => {this.items = data},
      err => console.log(err),
      () => console.log("Items Loaded")
    );
  }

  getBasket(){
    this.basketService.getBasket().subscribe(
      data => {this.basket = data},
      err => console.log(err),
      () => console.log("Basket Loaded:", this.basket)
    );
  }

  addToBasket(item){

    for(let i = 0; i < this.basket.items.length; ++i){
        if (this.basket.items[i].id === item.id) {
          alert("Item already added");
        }
    }

    this.basketService.addToBasket(item).subscribe(
      data => {this.basket = data},
      err => console.log(err),
      () => console.log("item Added")
    );
  }

  removeToBasket(basket, id){

    for(let i = 0; i < basket.items.length; ++i){
        if (basket.items[i].id === id) {
            basket.items.splice(i,1);
        }
    }

    this.basketService.removeToBasket(basket).subscribe(
      data => {this.basket = data},
      err => console.log(err),
      () => console.log("item remove")
    );
  }


}
