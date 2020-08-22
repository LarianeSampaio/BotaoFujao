package negocio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Lariane Sampaio
 */
public class Dados {
    
    private String numero;
    private String termo;
    private String significado;
    private String fonte;

    
    public Dados(String numero, String termo, String significado, String fonte) {
        this.numero = numero;
        this.termo = termo;
        this.significado = significado;
        this.fonte = fonte;
    }
    
     public Dados(){
     //   
    } 
     
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

   public String salvarTermo(){
       //salvar em txt
        try {
            FileWriter fw = new FileWriter("DicionarioTermos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Numero Termo: "+this.numero);
            pw.println("Termo: "+this.termo);
            pw.println("Significado: "+this.significado);
            pw.println("Fonte :"+this.fonte);
            pw.flush();
            pw.close();
            fw.close();
            
            
         
        } catch (IOException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
       
        
        return "Termo cadastrado com sucesso!";
    } 
   
    
}
