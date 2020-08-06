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
public class Personagem {
    
    Integer idPersonagem;
    String nome;
    Integer nivel;
    Integer numTrofeu;

    Equipe equipe = new Equipe();
    Batalha batalha = new Batalha();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getNumTrofeu() {
        return numTrofeu;
    }

    public void setNumTrofeu(Integer numTrofeu) {
        this.numTrofeu = numTrofeu;
    }

    
    public void verificaTrofeu() {
        if ( batalha.retornaVencedor(nivel) != this.idPersonagem){
            numTrofeu = 1;
        }
        
    }
    
}
