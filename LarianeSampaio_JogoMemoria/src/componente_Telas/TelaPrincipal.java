
package componente_Telas;

import componente_Regras.ControleBotoes;
import componente_Regras.StatusBotoes;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lariane
 */
public class TelaPrincipal extends JFrame {
    
    private static final int QUANTIDADES_JOGADAS = 2;
    private int jogadas = 0;
    
    private int erros = 0;
    private int acertos = 0;
    
    private JPanel painel;
    
    private List<ControleBotoes> listaControle;
    private List<ControleBotoes> listaSelecionados;
    
    private ActionListener acaoBotoes;
    private ActionListener acaoSair;

    
    public TelaPrincipal(){
        super("Jogo da Memória");
        
        listaControle = new ArrayList<>();
        listaSelecionados = new ArrayList<>();
        
        //Evento dos botoes
        acaoBotoes = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton botao = (JButton) e.getSource();
                for (ControleBotoes cont : listaControle ){
                    if ( cont.getReferenciaBotoes().get( botao ) != null){
                        jogadas ++;
                        cont.executarAcaoBotoes(( JButton) e.getSource(), StatusBotoes.SELECIONADO);
                        //controle de inclusao
                        if ( !listaSelecionados.contains( cont )){
                            listaSelecionados.add( cont );
                        }
                        
                        if ( jogadas == QUANTIDADES_JOGADAS ){
                            //acabou as jogadas
                            if ( listaSelecionados.size() > 1 ){
                                //deixar os botoes com estado inicial
                                for ( ControleBotoes cb: listaSelecionados ){
                                    cb.zerarSelecoes();
                                   
                            } 
                            } 
                            jogadas = 0;
                            listaSelecionados.clear();
                        }
                        break;
                    }
                }
            }
    };
        
         //Evento sair
        acaoSair = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
               } 
        };
        
        JLabel jlAcertos = new JLabel("Acertos");
        jlAcertos.setBounds(10, 10, 100, 30);
        this.add(jlAcertos);
        
        JTextField txtAcertos = new JTextField();
        txtAcertos.setBounds(80, 10, 100, 30);
        txtAcertos.setText( Integer.toString( acertos ));
        this.add(txtAcertos);
        
        JLabel jlErros = new JLabel("Erros");
        jlErros.setBounds(200, 10, 100, 30);
        this.add(jlErros);
        
        JTextField txtErros = new JTextField();
        txtErros.setBounds(250, 10, 100, 30);
        txtErros.setText( Integer.toString( erros ) );
        this.add(txtErros);
        
        JButton jbSair = new JButton("Sair");
        jbSair.setBounds(450,500,100,50);
        jbSair.setBackground(Color.gray);
        jbSair.addActionListener( this.acaoSair );
        this.add( jbSair );
        
        painel = new JPanel();
        this.add( painel );
        painel.setLayout( null );
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        criarJogo( 8 );
        this.setBounds(250, 200, 600, 600);
        this.setVisible( true );
        
        

        
    }
    
    private void criarJogo( int qtPares ){
         ControleBotoes controle = null;
         List<Rectangle> posicionamentos = new ArrayList<>();
         int posX = 50;
         int posY =50;
         
         Random rand = new Random();
         
         int seq = 0;
         int i = 0;
         
         for ( i = 0; i< (qtPares *2); i++ ){
            //randomizar o posicionamento dos botoes
            Rectangle rec = new Rectangle(posX, posY, 100, 100);
            posicionamentos.add ( rec );
            if ( i % 4 == 0 && i > 0 ) {
                posY += 105;
                posX = 50;
            } else {
                posX += 105;
            }
         }
         
        //quantidade de botoes
        for ( i =0; i< ( qtPares * 2 ); i++ ){
            if ( i % 2 ==0 ){
                //quantidade de controladores
                seq++;
                controle = new ControleBotoes();
                controle.setNmBotao(" Botao " +seq );
                this.listaControle.add( controle );
            }
            
            
            JButton botao = new JButton("Jogo");
            //botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componente_Imagens/pontointerrogacao.png"))); // NOI18N
            this.painel.add( botao );
            botao.addActionListener( this.acaoBotoes );
            int pos = rand.nextInt( ( (  posicionamentos.size() -1 ) > 0 ) ?  posicionamentos.size() -1: 1 ) ;
            botao.setBounds( posicionamentos.get(pos) );
            posicionamentos.remove( pos );
            
            controle.adicionarBotao( botao );
        }
        
       
        
        
    }
}
