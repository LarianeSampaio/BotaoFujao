package tela;


import recurso.AplicaNimbusLookAndFeel;
import negocio.Dados;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaTermos = new javax.swing.JTable();
        PainelCad = new javax.swing.JPanel();
        jlTermo = new javax.swing.JLabel();
        jlSignificado = new javax.swing.JLabel();
        jlFonte = new javax.swing.JLabel();
        txtTermo = new javax.swing.JTextField();
        txtSignificado = new javax.swing.JTextField();
        txtFonte = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jlNumeroTermo = new javax.swing.JLabel();
        txtNumeroTermo = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jlPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dicionário de Termos");

        TabelaTermos.setBackground(new java.awt.Color(204, 204, 204));
        TabelaTermos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° ", "Termo", "Significado", "Fonte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTermos.setToolTipText("");
        TabelaTermos.setRowHeight(36);
        TabelaTermos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TabelaTermosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(TabelaTermos);
        if (TabelaTermos.getColumnModel().getColumnCount() > 0) {
            TabelaTermos.getColumnModel().getColumn(0).setResizable(false);
            TabelaTermos.getColumnModel().getColumn(1).setResizable(false);
            TabelaTermos.getColumnModel().getColumn(2).setResizable(false);
            TabelaTermos.getColumnModel().getColumn(3).setResizable(false);
        }

        PainelCad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Termos"));
        PainelCad.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PainelCadAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlTermo.setText("Termo: ");

        jlSignificado.setText("Significado");

        jlFonte.setText("Fonte: ");

        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbExit.setText("EXIT");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jlNumeroTermo.setText("N° Termo: ");

        javax.swing.GroupLayout PainelCadLayout = new javax.swing.GroupLayout(PainelCad);
        PainelCad.setLayout(PainelCadLayout);
        PainelCadLayout.setHorizontalGroup(
            PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlSignificado)
                    .addComponent(jlNumeroTermo)
                    .addComponent(jlTermo)
                    .addComponent(jlFonte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadLayout.createSequentialGroup()
                        .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSignificado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTermo)
                            .addGroup(PainelCadLayout.createSequentialGroup()
                                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 363, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(PainelCadLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        PainelCadLayout.setVerticalGroup(
            PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumeroTermo)
                    .addComponent(txtNumeroTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTermo)
                    .addComponent(txtTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlSignificado)
                    .addComponent(txtSignificado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFonte))
                .addGap(34, 34, 34)
                .addGroup(PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar))
                .addGap(34, 34, 34))
        );

        jbCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        jbCadastrar.setText("CADASTRAR");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbSair.setText("SAIR");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jlPesquisar.setText("DIGITE O TERMO PARA PESQUISAR");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });

        jLabel1.setText("CADASTRAR TERMO:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PainelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrar))
                .addGap(18, 18, 18)
                .addComponent(PainelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PainelCadAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PainelCadAncestorAdded

        
    }//GEN-LAST:event_PainelCadAncestorAdded

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        EsconderPainelCad();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
      
      
       Dados dados = new Dados();
       
       String Numero = txtNumeroTermo.getText();
       String termo = txtTermo.getText();
       String significado = txtSignificado.getText();
       String fonte = txtFonte.getText(); 
       
       DefaultTableModel tabelaModelo = (DefaultTableModel)TabelaTermos.getModel();
       tabelaModelo.addRow(new String[]{Numero, termo, significado, fonte});
       
       //Validar campos.
       
       
       //Salvando em arquivo TXT.
       dados.setNumero(txtNumeroTermo.getText());
       dados.setTermo(txtTermo.getText());
       dados.setSignificado(txtSignificado.getText());
       dados.setFonte(txtFonte.getText());
       
       JOptionPane.showMessageDialog(null,dados.salvarTermo());
      
        
       //Limpa campos
       txtTermo.setText("");
       txtNumeroTermo.setText("");
       txtFonte.setText("");
       txtSignificado.setText("");

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
       PainelCad.setVisible(false);
    }//GEN-LAST:event_jbExitActionPerformed

    private void TabelaTermosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaTermosAncestorAdded
        
      DefaultTableModel tabela = new DefaultTableModel();
 
      ArrayList<Object>NomeColuna = new ArrayList<>();
      
      NomeColuna.add("N°");
      NomeColuna.add("Termo");
      NomeColuna.add("Significado");
      NomeColuna.add("Fonte");
      
       for (Object Coluna : NomeColuna) {
          tabela.addColumn(Coluna);
        }
      this.TabelaTermos.setModel(tabela);
      
      ArrayList<Object[]> dados=new ArrayList<>();
      Object[]informacao1 = new Object[]{"1", "Análise SWOT "," Analisa a competitividade de uma organização, considerando variáveis como Forças, Oportunidades, Fraquezas, Ameaças; popularmente chamada de “FOFA”.", " https://administradores.com.br/artigos/50-termos-utilizados-frequentemente-no-mundo-executivo"};
      Object[]informacao2 = new Object[]{"2", "Benchmarking ", " Processo de avaliação sistêmico, usado para estabelecer metas para melhorias no processo, produtos e serviços, comparando uma empresa com outras que possuem desempenho melhor. De maneira simples, seria “copiar o que deu certo nas empresas. De sucesso e melhorar ainda mais na sua empresa", "https://administradores.com.br/artigos/50-termos-utilizados-frequentemente-no-mundo-executivo"};
      Object[]informacao3 = new Object[]{"3", "Brainstorming "," È uma atividade desenvolvida para explorar a potencialidade criativa de um indivíduo ou de um grupo - criatividade em equipe - colocando-a a serviço de objetivos organizacionais. Também conhecida como tempestade de ideias "," https://administradores.com.br/artigos/50-termos-utilizados-frequentemente-no-mundo-executivo"};
      Object[]informacao4 = new Object[]{"4", "Business Intelligence ", " Ou inteligência de negócios, refere-se ao processo de coleta, organização, análise,Compartilhamento e monitoramento de informações que oferecem suporte a gestão De negócios.", " https://administradores.com.br/artigos/50-termos-utilizados-frequentemente-no-mundo-executivo"};
      Object[]informacao5 = new Object[]{"5", "CEO ", " Chief Executiver Officer – Diretor executivo, pessoa com maior autoridade na hierarquia operacional de uma organização.Responsável pelas estratégias e visão da empresa..", " https://administradores.com.br/artigos/50-termos-utilizados-frequentemente-no-mundo-executivo"};
      Object[]informacao6 = new Object[]{"6", "Administracao "," A maneira de governar organizações ou parte delas. Processo de planejar, organizar, dirigir e controlar o uso de recursos organizacionais para alcançar determinados objetivos.De maneira eficiente e eficaz."," Chiavenato, Idalberto – Introducao a teoria geral da administracao/Idalberto Chiavenato. – 9. ed. – Barueri, SP : Manole, 2014."};
      Object[]informacao7 = new Object[]{"7", "Atitude "," Comportamento pessoal do administrador diante das situações com que se defronta no seu trabalho. A atitude representa o estilo pessoal de fazer as coisas acontecerem, a maneira de liderar, de motivar, de comunicar e de levar adiante."," Chiavenato, Idalberto – Introducao a teoria geral da administracao/Idalberto Chiavenato. – 9. ed. – Barueri, SP : Manole, 2014."};
      Object[]informacao8 = new Object[]{"8", "Eficacia "," Atingir objetivos e resultados. Um trabalho eficaz é proveitoso e bem‐sucedido.","  Chiavenato, Idalberto – Introducao a teoria geral da administracao/Idalberto Chiavenato. – 9. ed. – Barueri, SP : Manole, 2014."};
      Object[]informacao9 = new Object[]{"9", "Eficiencia "," Fazer bem e corretamente. O trabalho eficiente é um trabalho bem executado.","  Chiavenato, Idalberto – Introducao a teoria geral da administracao/Idalberto Chiavenato. – 9. ed. – Barueri, SP : Manole, 2014."};
      Object[]informacao10 = new Object[]{"10", "Empreendedor "," Pessoa que tem a coragem de assumir riscos para aproveitar oportunidades em situações nas quais outras pessoas veriam apenas problemas ou ameacas.","  Chiavenato, Idalberto – Introducao a teoria geral da administracao/Idalberto Chiavenato. – 9. ed. – Barueri, SP : Manole, 2014."};      
     

    //Inserir dados.
      dados.add(informacao1);
      dados.add(informacao2);
      dados.add(informacao3);
      dados.add(informacao4);
      dados.add(informacao5);
      dados.add(informacao6);
      dados.add(informacao7);
      dados.add(informacao8);
      dados.add(informacao9);
      dados.add(informacao10);
      
      for(Object[] dadosTermos: dados){
          tabela.addRow(dadosTermos);
          
      }

        
    }//GEN-LAST:event_TabelaTermosAncestorAdded

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
       //Pesquisar
        DefaultTableModel modelo = (DefaultTableModel)TabelaTermos.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        TabelaTermos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtPesquisar.getText().trim()));
    }//GEN-LAST:event_txtPesquisarKeyPressed

    public void EsconderPainelCad(){
        PainelCad.setVisible(true);
    }
    
    public void OcultarPainelCad(){
        PainelCad.setVisible(false);
    }
  
    
    public static void main(String args[]) {
       AplicaNimbusLookAndFeel.pegaNimbus();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PainelCad;
    private javax.swing.JTable TabelaTermos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlFonte;
    private javax.swing.JLabel jlNumeroTermo;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JLabel jlSignificado;
    private javax.swing.JLabel jlTermo;
    private javax.swing.JTextField txtFonte;
    private javax.swing.JTextField txtNumeroTermo;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSignificado;
    private javax.swing.JTextField txtTermo;
    // End of variables declaration//GEN-END:variables
}
