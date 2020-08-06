
package componente_Telas;


import componente_BancoDados.Database;
import componente_Entidades.Clientes;
import java.sql.*;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastro extends javax.swing.JFrame {

    private Database db = null;
    private Clientes  cli  = null;

    public TelaCadastro() {
        initComponents();
        db = new Database();
         cli  = new Clientes(db);
        btRecarregarActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apDados = new javax.swing.JScrollPane();
        tbDados = new javax.swing.JTable();
        btFechar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btIncluir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btRecarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        tbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        apDados.setViewportView(tbDados);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btRecarregar.setText("Recarregar");
        btRecarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRecarregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(apDados, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apDados, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btIncluir)
                    .addComponent(btExcluir)
                    .addComponent(btRecarregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btRecarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecarregarActionPerformed
        try {
            ResultSet rs = db.executaQuery("SELECT idcli, nome, dt_nasc, cpf, telefone, endereco, numero, bairro, cidade, cep FROM cliente");

            Vector cabecalho = new Vector();

            cabecalho.add("ID");
            cabecalho.add("Nome");
            cabecalho.add("Data de Nascimento");
            cabecalho.add("CPF");
            cabecalho.add("Telefone");
            cabecalho.add("Endereco");
            cabecalho.add("Numero");
            cabecalho.add("Bairro");
            cabecalho.add("Cidade");
            cabecalho.add("CEP");
            

            Vector linhas = new Vector();
            while (rs.next()) {
                Vector colunas = new Vector();
                colunas.add(rs.getString("idcli"));
                colunas.add(rs.getString("nome"));
                colunas.add(rs.getString("dt_nasc"));
                colunas.add(rs.getString("cpf"));
                colunas.add(rs.getString("telefone"));
                colunas.add(rs.getString("endereco"));
                colunas.add(rs.getString("numero"));
                colunas.add(rs.getString("bairro"));
                colunas.add(rs.getString("cidade"));
                colunas.add(rs.getString("cep"));
                
                linhas.add(new Vector(colunas));
            }

            tbDados.setModel(new DefaultTableModel(linhas, cabecalho));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btRecarregarActionPerformed

    private int getIDcli() {
        int idcli = -1;

        if (tbDados.getSelectedRow() > -1) {

            int coluna = 0;
            for (int i = 0; i < tbDados.getColumnCount(); i++) {
                if (tbDados.getColumnName(i).equals("ID")) {
                    coluna = i;
                    break;
                }
            }

            String c = (String) tbDados.getValueAt(tbDados.getSelectedRow(), coluna);
            try {
                idcli = Integer.parseInt(c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return idcli;
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int idcli = getIDcli();

        if (idcli > -1) {
            if (Mess.confirma("Deseja excluir este item")) {
                 cli.exclui( idcli );
                btRecarregarActionPerformed(null);
            }
        } else {
            Mess.error("ID inválido");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed

        TelaCadastroManutencao man = new TelaCadastroManutencao(this, true);
        man.setEntity( cli );
        man.setVisible(true);

        btRecarregarActionPerformed(null);

    }//GEN-LAST:event_btIncluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int idcli = getIDcli();

        if (idcli > -1) {
            TelaCadastroManutencao man = new TelaCadastroManutencao(this, true);
            man.setEntity( cli );

            try {
                ResultSet rs = db.executaQuery("SELECT idcli, nome, dt_nasc, cpf, telefone, endereco, numero, bairro, cidade, cep FROM cliente WHERE idcli = '" + idcli + "'");
                if (rs.next()) {

                    cli.setIdcli(idcli);
                    cli.setNome(rs.getString("nome"));
                    cli.setDt_nasc(rs.getString("dt_nasc"));
                    cli.setCpf(rs.getString("cpf"));
                    cli.setTelefone(rs.getString("telefone"));
                    cli.setEndereco(rs.getString("endereco"));
                    cli.setNumero(Integer.parseInt(rs.getString("numero")));
                    cli.setBairro(rs.getString("bairro"));
                    cli.setCidade( rs.getString ("cidade"));
                    cli.setCep(rs.getString("cep"));
                    
                    man.preencheValores();
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            man.setVisible(true);          
        }

        btRecarregarActionPerformed(null);
    }//GEN-LAST:event_btAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      AplicaNimbusLookAndFeel.pegaNimbus();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane apDados;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btRecarregar;
    private javax.swing.JTable tbDados;
    // End of variables declaration//GEN-END:variables
}
