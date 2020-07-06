/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente_Regras;

import componente_Telas.TelaPrincipal;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

/**
 *
 * @author Lariane
 */
public class ControleBotoes {
    
    private String nmBotao;
    private Map<JButton, StatusBotoes> referenciaBotoes;
    private Integer contagemAcertos = 0;
 
   
    
    public ControleBotoes(){
        this.referenciaBotoes = new HashMap<> ();
    }
    
    public void executarAcaoBotoes( JButton botao, StatusBotoes status ){
        alterarSelecao( botao, status );
         if ( this.isTodosSelecionados() ){
            alterarStatusTodosBotoes( StatusBotoes.PARES_ENCONTRADOS );
        } else {
             alterarVisualizacaoBotao( botao );
         }
    } 
    
    private void alterarStatusTodosBotoes( StatusBotoes status ) {
        for ( JButton botao : this.referenciaBotoes.keySet() ){
            alterarSelecao( botao, status );
            alterarVisualizacaoBotao( botao );
        }
    }

    public String getNmBotao() {
        return nmBotao;
    }

    public void setNmBotao(String nmBotao) {
        this.nmBotao = nmBotao;
    }

    public Map<JButton, StatusBotoes> getReferenciaBotoes() {
        return referenciaBotoes;
    }

    public void setReferenciaBotoes(Map<JButton, StatusBotoes> referenciaBotoes) {
        this.referenciaBotoes = referenciaBotoes;
    }
    
    public void adicionarBotao( JButton botao ) {
        this.referenciaBotoes.put( botao, StatusBotoes.NORMAL );
    }
    
    public void alterarSelecao( JButton botao, StatusBotoes status ) {
        this.referenciaBotoes.put( botao, status );
       
    }
 
    
    private void alterarVisualizacaoBotao( JButton botao ){
        
        StatusBotoes status = this.referenciaBotoes.get( botao );
        
        switch ( status ) {
            case NORMAL: 
                botao.setBackground( null );
                botao.setText( "Jogo");
                break;
            case SELECIONADO: //exibir imagem e mudar cor
                botao.setBackground( Color.orange );
                botao.setText( this.nmBotao );
                break;
            case PARES_ENCONTRADOS: //mudar cor e exibir imagem
                botao.setBackground( Color.red );
                botao.setText( this.nmBotao );
                contagemAcertos ++;
                //botao.setEnabled( false );
                break;
        }
    }
    
    public Integer contagemAcertos(){
        return contagemAcertos;
    }
    
    public void zerarSelecoes(){
       alterarStatusTodosBotoes( StatusBotoes.NORMAL );
    }
    
    public Boolean isTodosSelecionados(){
        for ( StatusBotoes bt : this.referenciaBotoes.values() ){
            if (  bt != StatusBotoes.SELECIONADO ){
                //nao foi selecionado
                return false;
            }
        }
        return true;
    }
            
            
    
}
