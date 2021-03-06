/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirfin.archivioProdottiGal.dto;

import it.sirfin.archivioProdottiGal.model.Prodotto;
import java.util.List;


public class ListaProdottiDto {

    private List<Prodotto> listaProdotti;

    public ListaProdottiDto() {
    }

    public ListaProdottiDto(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        return "ListaProdottiDto{" + "listaProdotti=" + listaProdotti + '}';
    }     
    
}
