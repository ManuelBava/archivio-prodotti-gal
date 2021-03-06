/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirfin.archivioProdottiGal.controller;

import it.sirfin.archivioProdottiGal.dto.ListaProdottiDto;
import it.sirfin.archivioProdottiGal.dto.ProdottoDto;
import it.sirfin.archivioProdottiGal.dto.ScontoDto;
import it.sirfin.archivioProdottiGal.service.ArchvioProdottiService;
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

    @RequestMapping("/aggiorna")
    @ResponseBody
    public ListaProdottiDto aggiornaListaProdotti() {
        return archivioProdottiService.aggiornaListaProdotti();
    }
    
    @RequestMapping("/inserisci")
    @ResponseBody
    public ListaProdottiDto inserimento(@RequestBody ProdottoDto dto) {
        return archivioProdottiService.inserimento(dto.getProdotto());
    }

    @RequestMapping("/sconto")
    @ResponseBody
    public ScontoDto calcoloSconto(@RequestBody ProdottoDto dto) {
        return archivioProdottiService.calcoloSconto(dto.getProdotto());
    }

    @RequestMapping("/cancella")
    @ResponseBody
    public ListaProdottiDto cancellazione(@RequestBody ProdottoDto dto) {
        return archivioProdottiService.cancellazione(dto.getProdotto());
    }

    @RequestMapping("/ricerca")
    @ResponseBody
    public ListaProdottiDto ricerca(@RequestBody String criterio) {
        return archivioProdottiService.ricerca(criterio);
    }
}
