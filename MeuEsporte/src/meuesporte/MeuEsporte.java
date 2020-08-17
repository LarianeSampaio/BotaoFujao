/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meuesporte;

import Entidades.Jogador;
import Entidades.Time;

/**
 *
 * @Lariane Sampaio
 */
public class MeuEsporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogador jogadores[] = new Jogador[3];
        Time times[] = new Time[3];
        
        int j = 0;
        int t = 0;
        int opcao = 0;

        while (opcao != 7) {

            opcao = Entrada.leiaInt(""
                    + "[1] - Cadastrar jogador;\n"
                    + "[2] - Cadastrar time;\n"
                    + "[3] - Listar jogadores cadastrados;\n"
                    + "[4] - Listar times cadastrados - sem os jogadores;\n"
                    + "[5] - Vincular jogador a um time;\n"
                    + "[6] - Listar dados completos de um time;\n"
                    + "[7] - Sair.");

            if (opcao == 1) {
                // cadastra jogador
                Jogador jogador = new Jogador();
                

                // popula o objeto com dados vindos do usuario
                jogador.setCodigo(Entrada.leiaInt("CÓDIGO do jogador"));
                jogador.setNome(Entrada.leiaString("NOME do jogador"));
                jogador.setPosicao(Entrada.leiaString("POSIÇÃO do jogador"));

                // armazena objeto imovel no vetor
                jogadores[j] = jogador;

                // avanca ponteiro
                j++;

            } else if (opcao == 2){
                //cadastro Time
                    Jogador jogador = new Jogador();
                    Time time = new Time();

                    // popula o objeto com dados vindos do usuario
                    time.setCodigo(Entrada.leiaInt("CÓDIGO do time"));
                    time.setNome(Entrada.leiaString("NOME do time"));
                    time.setTecnico(Entrada.leiaString("TÉCNICO do time"));
                    jogador.setNome(Entrada.leiaString("NOME do jogador"));
                    time.setJogadores(jogadores);


                    // armazena objeto imovel no vetor
                    times[t] = time;

                    // avanca ponteiro
                    t++;
                    
            } else if (opcao == 3) {
                
                System.out.println("Listagem dos Times sem os Jogadores:");

                for (int x = 0; x < t; x++) {
                    System.out.print(times[x].getCodigo() + " - \n");
                    System.out.print(times[x].getNome() + " - \n");
                    System.out.print(times[x].getTecnico() + " \n ");
                }
                System.out.println("");

                
            } else if (opcao == 5) {
                System.out.println("Vincular Jogador a um time");
            //nao sei como vincular jogador a um timpo
                        
            } else if (opcao == 6) {
                //nao sei como buscar pelo codigo
                 System.out.println("Listar dados completos de um time:");
                 Time time = new Time();
                 
                 time.setCodigo( Entrada.leiaInt("Qual código do time deseja listar?"));
                 
                

                
            }
        }

        System.exit(0);
    }
    //}

}
