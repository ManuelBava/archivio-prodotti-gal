/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirfin.archivioProdottiGal.dto;

import it.sirfin.archivioProdottiGal.model.Prodotto;


public class ProdottoDto {
    
    private Prodotto prodotto ;

    public ProdottoDto() {
    }

    public ProdottoDto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "ProdottoDto{" + "prodotto=" + prodotto + '}';
    }   
    
}
