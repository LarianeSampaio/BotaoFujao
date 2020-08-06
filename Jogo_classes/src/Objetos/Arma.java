/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Lariane Sampaio
 */
public class Arma {
    
    Integer idArma;
    String nome;
    String tipoArma;
    Boolean Status;

    Personagem personagem = new Personagem();
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
    
    boolean isStatus(){
        boolean hab = false;
        
        if ( personagem.getNivel() > 0){
            hab = true;
        }
        return hab;
    }
}
