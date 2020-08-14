/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meulivro;

/**
 *
 * Lariane Sampaio
 */
public class Livro {

    private String titulo;
    private int ano;
    private String editora;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
   public String obterAutorFormatoAbnt() {
        if (autor.length() > 0){
            int lastIndex = autor.lastIndexOf(' ');
            String end = autor
                   .substring(lastIndex, autor.length())
                   .trim()
                   .toUpperCase();
            String first = autor.substring(0, lastIndex).trim();
           return String.format("%s, %s.", end, first); 
        }
        return null;
    }
    
    public String obterInformacaoCompletaLivro (){             
        return String.format("%s%s.%s.%s.", obterAutorFormatoAbnt(), titulo, editora, ano);
    }
 
}
