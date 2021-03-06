/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirfin.archivioProdottiGal.controller;

import it.sirfin.archivioProdottiGal.dto.CriterioRicercaDto;
import it.sirfin.archivioProdottiGal.dto.ListaProdottiDto;
import it.sirfin.archivioProdottiGal.dto.ScontoDto;
import it.sirfin.archivioProdottiGal.model.Prodotto;
import it.sirfin.archivioProdottiGal.service.ArchvioProdottiService;
import it.sirfin.archivioProdottiGal.service.impl.ArchivioProdottiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ArchivioProdottiController {

   @Autowired
   ArchvioProdottiService archivioProdottiService;

    @RequestMapping("/inserisci-auto")
    @ResponseBody
    public ListaProdottiDto aggiornaListaProdotti() {
        return archivioProdottiService.aggiornaListaProdotti();
    }
    
    @RequestMapping("/inserisci")
    @ResponseBody
    public ListaProdottiDto inserimento(Prodotto prodotto) {
        return archivioProdottiService.inserimento(prodotto);
    }

    @RequestMapping("/calcola")
    @ResponseBody
    public ScontoDto calcoloSconto(Prodotto prodotto) {
        return archivioProdottiService.calcoloSconto(prodotto);
    }

    @RequestMapping("/cancella")
    @ResponseBody
    public ListaProdottiDto cancellazione(Prodotto prodotto) {
        return archivioProdottiService.cancellazione(prodotto);
    }

    @RequestMapping("/ricerca")
    @ResponseBody
    public ListaProdottiDto ricerca(String criterio) {
        return archivioProdottiService.ricerca(criterio);
    }
   
}
