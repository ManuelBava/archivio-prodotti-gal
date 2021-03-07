/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirfin.archivioProdottiGal.service;

import it.sirfin.archivioProdottiGal.dto.ListaProdottiDto;
import it.sirfin.archivioProdottiGal.dto.ScontoDto;
import it.sirfin.archivioProdottiGal.model.Prodotto;


public interface ArchvioProdottiService {

    ListaProdottiDto aggiornaListaProdotti();
           
    ListaProdottiDto inserimento(Prodotto prodotto);
    
    ScontoDto calcoloSconto(Prodotto prodotto);
            
    ListaProdottiDto cancellazione(Prodotto prodotto);            
            
    ListaProdottiDto ricerca(String criterio);
    
    ListaProdottiDto resetDB ();
}
