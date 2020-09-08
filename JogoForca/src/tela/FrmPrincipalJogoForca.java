package tela;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class FrmPrincipalJogoForca extends JFrame{
    
    
   
    public FrmPrincipalJogoForca(){
        
        super("JOGO DA FORCA");

        
        jtbBarraFerramenta.add(btnNovoJogo);
        jtbBarraFerramenta.add(lblLetra);
        jtbBarraFerramenta.add(jcbOpcao);
        jtbBarraFerramenta.add(lblUltimaLetra);
        jtbBarraFerramenta.add(tfbletra);
       
        add(jtbBarraFerramenta, BorderLayout.NORTH);
        
        
        
        for (int i=0; i<12; ++i){
            Letra[i] = new JLabel("__");
            jpControle.add(Letra[i]);
            Letra[i].setFont(new Font("Serif" , Font.BOLD, 48));  
            Letra[i].setVisible(false);
        }
        
        
        Geral.setLayout(Layout);
        Geral.add(jpControle);
        Geral.add(jpAnimacao);
        //Geral.add(btnSair);
        add(Geral);
        lblBarraStatus.setFont(new Font("Serif", Font.BOLD, 14));
        lblBarraStatus.setHorizontalAlignment(SwingConstants.LEFT);
        add(lblBarraStatus,BorderLayout.WEST);
        

        add(btnSair,BorderLayout.SOUTH);
        
            jcbOpcao.setEnabled(false);
            tfbletra.setEnabled(false);
            
        
            
        Eventos_JogoDaForca Eventos = new Eventos_JogoDaForca();
        btnNovoJogo.addActionListener(Eventos);
        btnSair.addActionListener(Eventos);
        
        jcbOpcao.addItemListener(Eventos);
     
     
 }   
             
    
    
    private class Eventos_JogoDaForca implements ActionListener, ItemListener{
        
        private String palavraSecreta, palavraCorreta;
        int tamanhoPalavra, letrasEncontradas, numErros, camposVazios;
        int mensagem=0;
        
        public void actionPerformed (ActionEvent event){
            
            
            if (event.getSource() == btnNovoJogo){
                
                mensagem=0;
                numErros = 0;
                
                ExibirComponentes(false);
                
                for (int i=0; i<tamanhoPalavra; ++i)
                    Letra[i].setVisible(false);
                
                palavraSecreta = JOptionPane.showInputDialog(FrmPrincipalJogoForca.this, "INFORME UMA PALAVRA SECRETA");
                
                if(palavraSecreta != null){
                
                    if ((palavraSecreta.length() > 12) || (palavraSecreta.length() <= 0)) 
                        JOptionPane.showMessageDialog(FrmPrincipalJogoForca.this, "A palavra escolhida deverá ter no mímimo 1 e no máximo 12 caracteres!", 
                     "Menssagem", JOptionPane.PLAIN_MESSAGE);
                    else{
                
                 ExibirComponentes(true);
                        tamanhoPalavra = palavraSecreta.length();
                    
                        for (int i=0; i<tamanhoPalavra; ++i){
                            Letra[i].setVisible(true);
                            Letra[i].setText("__");
                         }
                    }
                         }
            }
            
           if (event.getSource() == btnSair){ 
               System.exit(0);
           }
            
           
            
        }
        
    public void itemStateChanged(ItemEvent event){
            if(event.getStateChange() == ItemEvent.SELECTED){
                
                
                tfbletra.setText("" + jcbOpcao.getSelectedItem());

                letrasEncontradas = 0;
                
                for (int i=0; i<tamanhoPalavra; ++i){
                    if (tfbletra.getText().charAt(0) == palavraSecreta.toUpperCase().charAt(i)){
                       Letra[i].setText("" + tfbletra.getText().charAt(0));
                       JOptionPane.showMessageDialog(FrmPrincipalJogoForca.this, "Você chutou bem!!Letra correta");
                       letrasEncontradas++;
                    }
                } 
                
                
                       camposVazios = 0;
                       
                for (int i=0; i<tamanhoPalavra; ++i)
                    if (Letra[i].getText() != "__") camposVazios++;
                
                if ((camposVazios == tamanhoPalavra) && (mensagem==0)){
                    
                        ExibirComponentes(false);
                        mensagem = 1;
                        Vencedor();
                    
                } else{
                
                   
                    if ((letrasEncontradas == 0) && (mensagem==0)){
                    
                        numErros++; 
                        
                        jpAnimacao.setErro(numErros);
                        
                        lblBarraStatus.setText(" Erros: " + numErros);
                        JOptionPane.showMessageDialog(FrmPrincipalJogoForca.this, "Você chutou errado!!Letra incorreta");
                        
                        if (numErros == 5){
                            ExibirComponentes(false);
                            Perdedor();
                        }
                    }
                }
            }
        }
        
        
  public void ExibirComponentes(boolean parametro){
        
                jcbOpcao.setEnabled(parametro);
                tfbletra.setEnabled(parametro);
                
        }
        
        public void Vencedor(){      
            JOptionPane.showMessageDialog(FrmPrincipalJogoForca.this, "PARABÉNS VOCÊ VENCEU!!!");  
         Atualizar();
        }
    
    
        public void Perdedor(){
            JOptionPane.showMessageDialog(FrmPrincipalJogoForca.this, "A palavra secreta era: " + palavraSecreta);
            JOptionPane.showMessageDialog(FrmPrincipalJogoForca.this, "VOCE PERDEU! \n TENTE NOVAMENTE MAIS TARDE!");
         Atualizar();
        }
    
        public void Atualizar(){
            jpAnimacao.setErro(7);
            tfbletra.setText("");
            jcbOpcao.setSelectedIndex(0);
            lblBarraStatus.setText(" Numero de Letra(s) errada(s): 0");
        }
 }
    
    
    class Enforcado extends JPanel{ 
    
    private int numErros;
    
        void setErro(int NumeroErros) {
            numErros = NumeroErros;
        }  
            
      }
    
    
    String Lista[] = {" " ,"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
                        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                        "U", "V", "W", "X", "Y", "Z"};
    
    private JToolBar jtbBarraFerramenta = new JToolBar();
    private JLabel lblLetra = new JLabel(" Chutar uma Letra: ");
    private JButton btnNovoJogo = new JButton("Novo Jogo");
    private JComboBox jcbOpcao = new JComboBox(Lista);
    private JLabel lblUltimaLetra = new JLabel(" Utima Letra Escolhida: ");
    private JTextField tfbletra  = new JTextField();
    private JButton btnSair = new JButton("SAIR");
    
    
    
    private GridLayout Layout = new GridLayout(2,1);
    private JPanel Geral = new JPanel();
    private JPanel jpControle = new JPanel();
    private JLabel Letra[] = new JLabel[12];
    private Enforcado jpAnimacao = new Enforcado();
    
    
    private JLabel lblBarraStatus = new JLabel("  ERROS: 0");
    
    
    
  
    public static void main(String[] args){
    
        
        FrmPrincipalJogoForca janelaPropriedades = new  FrmPrincipalJogoForca();
        
        
        janelaPropriedades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPropriedades.setSize(800,520);
        janelaPropriedades.setVisible(true);
        janelaPropriedades.setResizable(false);
        janelaPropriedades.setLocationRelativeTo(null);
    }
}
