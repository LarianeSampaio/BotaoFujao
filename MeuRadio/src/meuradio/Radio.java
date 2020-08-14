/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meuradio;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * Lariane Sampaio
 */
public class Radio {
    
   private int estacao; // limites de 88 a 110
   private int volume; // limites de 0 a 40
   private boolean estado; // ligado/desligado

    public int getEstacao() {
        return estacao;
    }

    public void setEstacao(int estacao) {
        this.estacao = estacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //verifica status do Radio
    public String estadoRadio(){
        boolean result = estado;
        
        if ( !result){
            return ("Radio Desligado");
        }
        
        return ("Radio Ligado");
    }
    public void ligar(){
        
       this.setEstado(true);
       System.out.println("#####################################");
       System.out.println("####Status Atualizado do Radio###");
       System.out.println(estadoRadio());
       System.out.println("A estação atual é " + this.getEstacao());
       System.out.println("O volume atual é " + this.getVolume());
    }
    
    public void desligar(){
        this.setEstado(false);
        System.out.println("#####################################");
        System.out.println("####Status Atualizado do Radio###");
        System.out.println(estadoRadio()); 
        System.out.println("A estação atual é " + this.getEstacao());
        System.out.println("O volume atual é " + this.getVolume());
    }
    
    public void incrementarEstacao(){
        //Caso o rádio esteja na estação 110 e for solicitado incremento de estação, 
        //o rádio deve ser posicionado na estação 88, visto que ele tem comportamento circular.
        
         if (estacao >= 110){
             estacao = 88;
              System.out.println("#####################################");
             System.out.println("ATENÇÃO: Radio já esta na estação 110, então irá voltar para 88");
         }
         else {
             estacao = this.getEstacao() + 1;
              System.out.println("#####################################");
              System.out.println("A estação foi alterada com sucesso, agora é " + estacao);
         }
        
        System.out.println("####Status Atualizado do Radio###");
        System.out.println(estadoRadio());
        System.out.println("A estação atual é " + estacao);
        System.out.println("O volume atual é " + volume);

        
    }
    public void decrementarEstacao(){
        
        estacao = this.getEstacao() -1;
        System.out.println("#####################################");
        System.out.println("A estação foi alterada, agora é "+ estacao);
        
        System.out.println("####Status Atualizado do Radio###");
        System.out.println(estadoRadio());
        System.out.println("A estação atual é " + estacao);
        System.out.println("O volume atual é " + volume);
        
    }
    
    // Caso o volume esteja no valor 40 e o incremento for selecionado, 
    //nada deve ocorrer quanto ao seu valor, apenas informar em vídeo “valor máximo atingido”.
    public void incrementarVolume(){
        
        
         if ( volume >= 40 ){
             System.out.println("#####################################");
             System.out.println("ATENÇÃO: Volume máximo atingido");
         }
         else {
             volume = this.getVolume()+1;
             System.out.println("#####################################");
             System.out.println("Volume aumentou, agora é " + volume);
         }
             
         
         
        System.out.println("####Status Atualizado do Radio###");
        System.out.println(estadoRadio());
        System.out.println("A estação atual é " + estacao);
        System.out.println("O volume atual é " + volume);
        
    }
    public void decrementarVolume (){
        
        if ( volume == 0 ){
            System.out.println("#####################################");
            System.out.println("O volume já está zerado");
        }
        else {
                volume = this.getVolume() -1;
                System.out.println("#####################################");
                System.out.println("O volume diminuiu , agora é " + volume);
        }
        
        System.out.println("####Status Atualizado do Radio###");
        System.out.println(estadoRadio());
        System.out.println("A estação atual é " + estacao);
        System.out.println("O volume atual é " + volume);
        
    }
    
    
}
