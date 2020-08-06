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
public class Perfil {
    
    Integer idPerfil;
    String nome;
    String genero;
    Integer Idade;
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }
}
