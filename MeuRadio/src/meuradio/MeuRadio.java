

package meuradio;

import java.util.Scanner;

/**
 *
 * @Lariane Sampaio
 */
public class MeuRadio {

  public static void main(String[] args) {
        Radio radio = new Radio();
        
        radio.setEstado(false);//inicia desligado
        radio.setEstacao(88);
        radio.setVolume(0);
        int i = 0;
        int opcao = 0;

        while (opcao != 7) {

            opcao = Entrada.leiaInt(""
                    +"Rádio- Escolha uma opção!\n\n"
                    + "[1] - Ligar\n"
                    + "[2] - Desligar\n"
                    + "[3] - Incrementar estação\n"
                    + "[3] - Decrementar estação\n"
                    + "[3] - Aumentar Volume\n"
                    + "[3] - Diminuir Volume\n"
                    + "[7] - Sair");

            if (opcao == 1) {
                // ligar
                radio.ligar();

            } else if (opcao == 2) {
                //desligar
                radio.desligar();
               

            } else if (opcao == 3) {
                //incrementar estacao
                radio.incrementarEstacao();
                
            } else if (opcao == 4) {
                //decrementar estacao
                radio.decrementarEstacao();
                
            } else if (opcao == 5) {
                //incrementar volume
                radio.incrementarVolume();
                
            } else if (opcao == 6) {
                //decrementar estacao
                radio.decrementarVolume();
                
            }
        }

        System.exit(0);
    }
 
}
