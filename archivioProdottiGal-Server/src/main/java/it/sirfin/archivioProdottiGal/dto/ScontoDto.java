/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioProdottiGal.dto;

public class ScontoDto {

    private double sconto;

    public ScontoDto() {
    }

    public ScontoDto(double sconto) {
        this.sconto = sconto;
    }

    public double getSconto() {
        return sconto;
    }

    public void setSconto(double sconto) {
        this.sconto = sconto;
    }

    @Override
    public String toString() {
        return "ScontoDto{" + "sconto=" + sconto + '}';
    }
    
}
