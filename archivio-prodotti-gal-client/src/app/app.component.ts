import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { Prodotto } from './prodotto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  ricercaProdotto = "";
  IVA = 0;
  prodotti: Prodotto[] = [];

  constructor(private http: HttpClientModule) { 
  }

  aggiorna(){

  }
  aggiungi() {

   }
  ricerca() {

   }
  rimuovi() { 

  }
  sconto() {

   }
  resetDb() { 

  }
}
