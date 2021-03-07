import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ListaProdottiDto } from './lista-prodotti-dto';
import { Prodotto } from './prodotto';
import { ProdottoDto } from './prodotto-dto';
import { ScontoDto } from './sconto-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  ricercaProdotto = "";
  IVA = 0;
  calcolaSconto = 0;
  prodotti: Prodotto[] = [];
  url = "http://localhost:8080/";

  constructor(private http: HttpClient) {
  }

  aggiorna() {

  }
  aggiungi() {
    let dto = new ProdottoDto();
    dto.prodotto = this.prodotto;
    this.http.post<ListaProdottiDto>(this.url + "inserisci", dto)
      .subscribe(v => this.prodotti = v.listaProdotti);
    this.IVA = this.prodotto.prezzo * 1.22;
    this.prodotto = new Prodotto();
  }
  ricerca() {
//da implementare
  }
  rimuovi(p: Prodotto) {
    let dto = new ProdottoDto();
    dto.prodotto = p;
    this.http.post<ListaProdottiDto>(this.url + "cancella", dto)
      .subscribe(v => this.prodotti = v.listaProdotti);
  }

  sconto(prodotto: Prodotto) {
    let dto = new ProdottoDto();
    dto.prodotto = prodotto;
    this.http.post<ScontoDto>(this.url + "sconto", dto)
      .subscribe(v => this.calcolaSconto = v.importo);
  }
  
  resetDb() {
    this.http.get<ListaProdottiDto>(this.url + "reset")
    .subscribe(r => this.prodotti = r.listaProdotti);
  }
}
