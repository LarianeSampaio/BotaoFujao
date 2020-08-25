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
    
    private static boolean jogadorVinculado = true;
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
                    Time time = new Time();

                    // popula o objeto com dados vindos do usuario
                    time.setCodigo(Entrada.leiaInt("CÓDIGO do time"));
                    time.setNome(Entrada.leiaString("NOME do time"));
                    time.setTecnico(Entrada.leiaString("TÉCNICO do time"));
                    
                    Jogador jogadorTime = new Jogador();
                    
                    jogadorTime.setCodigo(Entrada.leiaInt("CÓDIGO do jogador"));
                    jogadorTime.setNome(Entrada.leiaString("NOME do jogador"));
                    jogadorTime.setPosicao(Entrada.leiaString("POSIÇÃO do jogador"));
                     
                    jogadores[j]=jogadorTime;
                     
                    time.setJogadores(jogadores);

                    // armazena objeto imovel no vetor
                    times[t] = time;

                    // avanca ponteiro
                    t++;
                    
            } else if (opcao == 3) {
                
                System.out.println("Listagem de todos Jogadores:");
                
                for (int x = 0; x < j; x++) {
                    
                    System.out.println("Código do Jogador: "+jogadores[x].getCodigo() + "-");
                    System.out.println("Nome do Jogador: "+jogadores[x].getNome() + "-");        
                    System.out.println("Posição do Jogador: "+jogadores[x].getPosicao() + "-\n");
                }
                    
                    
                    
            } else if (opcao == 4) {
                
                System.out.println("Listagem dos Times sem os Jogadores:");

                for (int x = 0; x < t; x++) {
                    System.out.println("Código do Time: "+times[x].getCodigo() + " - \n");
                    System.out.println("Nome do Time: "+times[x].getNome() + " - \n");
                    System.out.println("Nome do Técnico: "+times[x].getTecnico() + " \n ");
                }
                System.out.println("");

                
            } else if (opcao == 5) {
                System.out.println("Vincular jogador a um time:");
                
                int novoJogador = Entrada.leiaInt("Código do Jogador a ser vinculado");
                int timeVinculado = Entrada.leiaInt("Codigo do Time que receberá o vinculo");


                if (!jogadorVinculado) {
                    System.out.println("O Jogador já esta vinculado a este time");
                } else 
                   // Jogador[] vetorAux = times[posicao].getJogadores();
                    

               
                System.out.println("Vincular Jogador a um time");
           
                        
            } else if (opcao == 6) {
               
                 System.out.println("Listar dados completos de um time:");
                 
                int codigoTime = Entrada.leiaInt("Digite o código do Time a ser listado");
                 
                for (int i=0; i < t; i++) {
                      
                    if (times[i].getCodigo() == codigoTime ){
                        System.out.println("Código do Time: "+times[i].getCodigo() + " - \n");
                        System.out.println("Nome do Time: "+times[i].getNome() + " - \n");
                        System.out.println("Técnico do Time: "+times[i].getTecnico() + " \n ");
                        System.out.println("Jogadores:" +times[i].getJogadores() + " \n ");
                    }
                    else {
                        System.out.println("Este código não exite");
                    }
                        
            }
                 
                

                
            }
        }

        System.exit(0);
    }

}
