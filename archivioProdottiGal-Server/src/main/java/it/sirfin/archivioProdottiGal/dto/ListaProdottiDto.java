/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirfin.archivioProdottiGal.dto;

import it.sirfin.archivioProdottiGal.model.Prodotto;
import java.util.List;


public class ListaProdottiDto {

    private List<Prodotto> listaAuto;

    public ListaProdottiDto() {
    }

    public ListaProdottiDto(List<Prodotto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public List<Prodotto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Prodotto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    @Override
    public String toString() {
        return "ListaProdottiDto{" + "listaAuto=" + listaAuto + '}';
    }     
    
}
