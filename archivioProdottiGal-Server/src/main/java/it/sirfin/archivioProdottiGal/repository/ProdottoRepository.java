/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirfin.archivioProdottiGal.repository;

import it.sirfin.archivioProdottiGal.model.Prodotto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long>{
    List<Prodotto> findByCodiceContainsOrDescrizioneContains(String t, String m);

}
