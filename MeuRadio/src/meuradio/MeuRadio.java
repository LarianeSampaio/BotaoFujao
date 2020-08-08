

package meuradio;

import java.util.Scanner;

/**
 *
 * @Lariane Sampaio
 */
public class MeuRadio {
    
    public static void menu(){
      
		System.out.println("\n\n### Rádio - Escolha uma opção ###");
		System.out.println("\n                  =========================== ");
		System.out.println("                  |     1 - Ligar              |");
		System.out.println("                  |     2 - Desligar           |");
		System.out.println("                  |     3 - Incrementar estação|");
		System.out.println("                  |     4 - Decrementar estação|");
		System.out.println("                  |     5 - Aumentar Volume    |");
		System.out.println("                  |     6 - Diminuir Volume    |");
		System.out.println("                  |     0 - Sair               |");
		System.out.println("                  ============================= ");
                System.out.println("Escolha uma Opcao:");
               
    }

    
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setEstado(false);//inicia desligado
        radio.setEstacao(88);
        radio.setVolume(0);
         
                
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
           // opcao = Entrada.leiaInt("Escolha uma Opcao: ");
            System.out.print("\n");
            switch(opcao){
            case 1:
                radio.ligar();
                break;
                
            case 2:
                radio.desligar();
                break;
                
            case 3:
                radio.incrementarEstacao();
                break;
                
            case 4:
                radio.decrementarEstacao();
                break;
            
            case 5:
                radio.incrementarVolume();
                break;
                
            case 6:
                radio.decrementarVolume();
                break;
                
            case 0:
                System.out.println("Programa encerrado.");
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }


}
