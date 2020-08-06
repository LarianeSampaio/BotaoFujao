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
public class Batalha {
    Integer idBatalha;
    String nome;
    String cenario;
    Integer qtdPontos = 0;
    
    Personagem vencedor = new Personagem();
    Equipe equipe = new Equipe();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }
    
    public Integer retornaVencedor( Integer pontos ){
        if (pontos > 0){
            
            qtdPontos = pontos;
            
        }
        return vencedor.idPersonagem;
    }
}
