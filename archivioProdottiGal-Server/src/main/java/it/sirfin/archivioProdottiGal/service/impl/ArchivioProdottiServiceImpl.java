/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioProdottiGal.service.impl;

import it.sirfin.archivioProdottiGal.dto.ListaProdottiDto;
import it.sirfin.archivioProdottiGal.dto.ScontoDto;
import it.sirfin.archivioProdottiGal.model.Prodotto;
import it.sirfin.archivioProdottiGal.repository.ProdottoRepository;
import it.sirfin.archivioProdottiGal.service.ArchvioProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivioProdottiServiceImpl implements ArchvioProdottiService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public ListaProdottiDto aggiornaListaProdotti() {
        return new ListaProdottiDto(prodottoRepository.findAll());
    }

    @Override
    public ListaProdottiDto inserimento(Prodotto prodotto) {
        prodottoRepository.save(prodotto);
        return aggiornaListaProdotti();
    }

    @Override
    public ScontoDto calcoloSconto(Prodotto prodotto) {
        double sconto = prodotto.getPrezzo() * 0.7;
        return new ScontoDto(sconto);
    }

    @Override
    public ListaProdottiDto cancellazione(Prodotto prodotto) {
        prodottoRepository.delete(prodotto);
        return aggiornaListaProdotti();
    }

    @Override
    public ListaProdottiDto ricerca(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaProdottiDto resetDB() {
       prodottoRepository.deleteAllInBatch();
       return aggiornaListaProdotti();
    }

}
