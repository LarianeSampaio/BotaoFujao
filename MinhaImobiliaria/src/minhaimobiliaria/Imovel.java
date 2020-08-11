/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minhaimobiliaria;

/**
 *
 * Lariane Sampaio
 */
public class Imovel {

    private String codigoImovel;
    private String endereco;
    private double areaTotal;
    private double valor;

    public String getCodigoImovel() {
        return codigoImovel;
    }

    public void setCodigoImovel(String codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double obterValorMetroQuadrado () {
        return (valor/areaTotal);
    }
}