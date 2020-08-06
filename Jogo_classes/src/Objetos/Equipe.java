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
public class Equipe {
    Integer idEquipe;
    String nome;
    Integer pontos;
    private int qtdPersonagem;
    
    private Personagem[] vetorPersonagem = new Personagem[qtdPersonagem];  
    
    public Equipe (){
        this.vetorPersonagem[0] = new Personagem();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }
    
    public boolean adicionaPersonagem(Personagem personagem) {
    for (int i = 0; i < qtdPersonagem; i++) {
        if (this.vetorPersonagem[i] == null) {
        vetorPersonagem[i] = personagem;
        System.out.println("Personagem adicionado com sucesso!");
        return true;
        }
    }
    System.out.println("Não há mais espaço para adicionar");
    return false;
    }
}
