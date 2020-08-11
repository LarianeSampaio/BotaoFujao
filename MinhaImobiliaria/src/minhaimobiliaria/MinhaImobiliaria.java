package minhaimobiliaria;

import java.util.Scanner;

/**
 *
 * @Lariane Sampaio
 */
public class MinhaImobiliaria {
    
    public static void main(String[] args) {
        
    Imovel imoveis[] = new Imovel[100]; //cria vetor
        int i = 0;
        int opcao = 0;

        while (opcao != 4) {

            opcao = Entrada.leiaInt(""
                    +"Cadastro de Imóveis - Escolha uma opção!\n\n"
                    + "[1] - Cadastrar imóvel\n"
                    + "[2] - Listar todos os imóveis\n"
                    + "[3] - Obter valor metro quadrado dos imóveis\n"
                    + "[4] - Sair");

            if (opcao == 1) {
                // cria objeto imovel
                Imovel imovel = new Imovel();

                // popula o objeto com dados vindos do usuario
                imovel.setCodigoImovel(Entrada.leiaString("CÓDIGO imóvel"));
                imovel.setEndereco(Entrada.leiaString("ENDEREÇO com número imóvel"));
                imovel.setAreaTotal(Entrada.leiaDouble("ÁREA imóvel"));
                imovel.setValor(Entrada.leiaDouble("VALOR imóvel"));

                // armazena objeto imovel no vetor
                imoveis[i] = imovel;

                // avanca ponteiro
                i++;

            } else if (opcao == 2) {
                System.out.println("Listagem completa dos imóveis:");

                for (int j = 0; j < i; j++) {
                    System.out.print(imoveis[j].getCodigoImovel() + " - ");
                    System.out.print(imoveis[j].getEndereco() + " - ");
                    System.out.print(imoveis[j].getAreaTotal() + " m² - ");
                    System.out.println(imoveis[j].getValor());
                }
                System.out.println("");

            } else if (opcao == 3) {
                System.out.println("Listagem Código e Valor metro quadrado");

                for (int j = 0; j < i; j++) {
                    System.out.print(imoveis[j].getCodigoImovel() + " - ");
                    System.out.println(imoveis[j].obterValorMetroQuadrado());
                }
                System.out.println("");
            }
        }

        System.exit(0);
    }
}

