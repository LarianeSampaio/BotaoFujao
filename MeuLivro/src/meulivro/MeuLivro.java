

package meulivro;

/**
 *
 * @Lariane Sampaio
 */
public class MeuLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

            Livro livros = new Livro();
            //entrada de dados
            livros.setTitulo(Entrada.leiaString("Informe um titulo"));
            livros.setEditora(Entrada.leiaString("Informe uma editora"));
            livros.setAutor(Entrada.leiaString("Informe um autor"));
            livros.setAno(Entrada.leiaInt("Informe o ano de publicação"));
        
            System.out.println(livros.obterAutorFormatoAbnt());
            System.out.println(livros.obterInformacaoCompletaLivro ());
        }


}
