import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type':'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class BasketService {

  constructor(private http:HttpClient) { }

  getBasket() {
    return this.http.get('/server/api/v1/gofluent/basket/1',httpOptions);
  }

  addToBasket(item) {
    let body = JSON.stringify(item);
    return this.http.put('/server/api/v1/gofluent/basket/add/1',body, httpOptions);
  }

  removeToBasket(basket) {
    let body = JSON.stringify(basket);
    return this.http.put('/server/api/v1/gofluent/basket/remove',body, httpOptions);
  }

}
