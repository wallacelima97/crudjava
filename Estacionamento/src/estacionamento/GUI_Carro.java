/*
Projeto: Estacionamento
Autor: Wallace Lima dos Santos
RA: 2090782021037
21/05/2021
Objetivo: Inteface gráfica da aplicação do estacionamento com a tabela carro
 */
package estacionamento;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author wz
 */
public class GUI_Carro extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Carro
     */
    public GUI_Carro() {
        initComponents();
        preencherTabelaCarro();

    }

    public void preencherTabelaCarro() {
        Connection con = Conexao.abrirConexao();
        CarroDAO cd = new CarroDAO(con);
        List<CarroBean> listaCarro = new ArrayList<CarroBean>();
        listaCarro = cd.listarTodos();
        DefaultTableModel tbm
                = (DefaultTableModel) jt_Carro.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        int i = 0;
        for (CarroBean cb : listaCarro) {
            tbm.addRow(new String[1]);
            jt_Carro.setValueAt(cb.getPlaca(), i, 0);
            jt_Carro.setValueAt(cb.getCor(), i, 1);
            jt_Carro.setValueAt(cb.getDescricao(), i, 2);
            i++;
        }
        Conexao.fecharConexao(con);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Carro = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jb_Incluir = new javax.swing.JButton();
        jb_Alterar = new javax.swing.JButton();
        jb_Excluir = new javax.swing.JButton();
        jb_Pesquisar = new javax.swing.JButton();
        jb_Limpar = new javax.swing.JButton();
        jb_Fechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_Mensagem = new javax.swing.JLabel();
        jtf_Placa = new javax.swing.JTextField();
        jtf_Cor = new javax.swing.JTextField();
        jtf_Descricao = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cadastramento de Veículos");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\wz\\Desktop\\FOTOS DO CARRO\\691c6cc8db12e56fdba8dea86e44bea9.jpg")); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel2.setText("Wallace Lima");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jt_Carro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Cor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_Carro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_CarroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_Carro);
        if (jt_Carro.getColumnModel().getColumnCount() > 0) {
            jt_Carro.getColumnModel().getColumn(0).setResizable(false);
            jt_Carro.getColumnModel().getColumn(1).setResizable(false);
            jt_Carro.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jb_Incluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Incluir.setText("Incluir");
        jb_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_IncluirActionPerformed(evt);
            }
        });

        jb_Alterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Alterar.setText("Alterar");
        jb_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_AlterarMouseClicked(evt);
            }
        });
        jb_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AlterarActionPerformed(evt);
            }
        });

        jb_Excluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Excluir.setText("Excluir");
        jb_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ExcluirActionPerformed(evt);
            }
        });

        jb_Pesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Pesquisar.setText("Pesquisar");
        jb_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_PesquisarActionPerformed(evt);
            }
        });

        jb_Limpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Limpar.setText("Limpar");
        jb_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimparActionPerformed(evt);
            }
        });

        jb_Fechar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Fechar.setText("Fechar");
        jb_Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_FecharMouseClicked(evt);
            }
        });
        jb_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jb_Incluir)
                .addGap(40, 40, 40)
                .addComponent(jb_Alterar)
                .addGap(35, 35, 35)
                .addComponent(jb_Excluir)
                .addGap(37, 37, 37)
                .addComponent(jb_Pesquisar)
                .addGap(39, 39, 39)
                .addComponent(jb_Limpar)
                .addGap(29, 29, 29)
                .addComponent(jb_Fechar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Incluir)
                    .addComponent(jb_Alterar)
                    .addComponent(jb_Excluir)
                    .addComponent(jb_Pesquisar)
                    .addComponent(jb_Limpar)
                    .addComponent(jb_Fechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Placa");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cor");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Descrição");

        jl_Mensagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jl_Mensagem.setText("Aguardando dados...");

        jtf_Placa.setColumns(10);
        jtf_Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_PlacaActionPerformed(evt);
            }
        });

        jtf_Cor.setColumns(20);

        jtf_Descricao.setColumns(400);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_Mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jl_Mensagem)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_PlacaActionPerformed

    private void jb_FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_FecharMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_FecharMouseClicked

    private void jb_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_FecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jb_FecharActionPerformed

    private void jb_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimparActionPerformed
        //limpar o modelo matemático

        //limpar a interface
        jtf_Placa.setText("");
        jtf_Cor.setText("");
        jtf_Descricao.setText("");
        jl_Mensagem.setText("");

        DefaultTableModel tbm
                = (DefaultTableModel) jt_Carro.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }


    }//GEN-LAST:event_jb_LimparActionPerformed

    private void jb_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_IncluirActionPerformed
        // incluir dados
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        cb.setPlaca(jtf_Placa.getText());
        cb.setCor(jtf_Cor.getText().toUpperCase());
        cb.setDescricao(jtf_Descricao.getText());
        jl_Mensagem.setText(cd.inserir(cb));
        Conexao.fecharConexao(con);
        preencherTabelaCarro();

    }//GEN-LAST:event_jb_IncluirActionPerformed

    private void jb_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_PesquisarActionPerformed
        // codigo da pesquisa
        preencherTabelaCarro();
    }//GEN-LAST:event_jb_PesquisarActionPerformed

    private void jb_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AlterarActionPerformed
        // código para alterar
            Connection con = Conexao.abrirConexao(); 
 CarroBean cb = new CarroBean(); 
 CarroDAO cd = new CarroDAO(con); 
 cb.setPlaca(jtf_Placa.getText()); 
 cb.setCor(jtf_Cor.getText()); 
 cb.setDescricao(jtf_Descricao.getText()); 
 jl_Mensagem.setText(cd.alterar(cb)); 
 Conexao.fecharConexao(con); 
 preencherTabelaCarro();
        
    }//GEN-LAST:event_jb_AlterarActionPerformed

    private void jb_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_AlterarMouseClicked

        // código do botão alterar
        Connection con = Conexao.abrirConexao(); 
 CarroBean cb = new CarroBean(); 
 CarroDAO cd = new CarroDAO(con); 
 cb.setPlaca(jtf_Placa.getText()); 
 cb.setCor(jtf_Cor.getText()); 
 cb.setDescricao(jtf_Descricao.getText()); 
 jl_Mensagem.setText(cd.alterar(cb)); 
 Conexao.fecharConexao(con); 
  

 

    }//GEN-LAST:event_jb_AlterarMouseClicked

    private void jb_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ExcluirActionPerformed
        // TODO add your handling code here:
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        cb.setPlaca(jtf_Placa.getText());
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja excluir esse veículo: " + jtf_Placa.getText() + "?", "Exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            jl_Mensagem.setText(cd.excluir(cb));
        }
        Conexao.fecharConexao(con);
        preencherTabelaCarro();

    }//GEN-LAST:event_jb_ExcluirActionPerformed

    private void jt_CarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_CarroMouseClicked
        // TODO add your handling code here:
        Integer linha = jt_Carro.getSelectedRow(); 
 String placa = (String)jt_Carro.getValueAt(linha, 0); 
 String cor = (String)jt_Carro.getValueAt(linha, 1); 
 String descricao = (String)jt_Carro.getValueAt(linha, 2);
 jtf_Placa.setText(placa); 
jtf_Cor.setText(cor); 
jtf_Descricao.setText(descricao);
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        cb.setPlaca(jtf_Placa.getText());
        cb.setCor(jtf_Cor.getText());
        cb.setDescricao(jtf_Descricao.getText());
       
       
        
    }//GEN-LAST:event_jt_CarroMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Carro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Carro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Carro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Carro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Carro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_Alterar;
    private javax.swing.JButton jb_Excluir;
    private javax.swing.JButton jb_Fechar;
    private javax.swing.JButton jb_Incluir;
    private javax.swing.JButton jb_Limpar;
    private javax.swing.JButton jb_Pesquisar;
    private javax.swing.JLabel jl_Mensagem;
    private javax.swing.JTable jt_Carro;
    private javax.swing.JTextField jtf_Cor;
    private javax.swing.JTextField jtf_Descricao;
    private javax.swing.JTextField jtf_Placa;
    // End of variables declaration//GEN-END:variables
}