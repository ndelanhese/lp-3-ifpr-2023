package views.product;

import views.productCategory.*;
import views.usersGroup.*;
import views.users.*;
import DAO.productDAO;
import javax.swing.JOptionPane;
import models.product;

public class update extends javax.swing.JFrame {

    public index usuarioGerenciarForm;

    /**
     * Creates new form UsuarioAlterar
     */
    public update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelDadosGerais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jButtonSalvarDadosGerais = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUnitOfMeasure = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuário Alterar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar Produto");

        jLabel2.setText("ID:");

        jLabel3.setText("Nome:");

        jTextFieldID.setEnabled(false);
        jTextFieldID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldIDFocusLost(evt);
            }
        });

        jButtonSalvarDadosGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonSalvarDadosGerais.setText("Salvar");
        jButtonSalvarDadosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarDadosGeraisActionPerformed(evt);
            }
        });

        jLabel4.setText("Unidade de medida: ");

        txtUnitOfMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitOfMeasureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosGeraisLayout = new javax.swing.GroupLayout(jPanelDadosGerais);
        jPanelDadosGerais.setLayout(jPanelDadosGeraisLayout);
        jPanelDadosGeraisLayout.setHorizontalGroup(
            jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosGeraisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosGeraisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarDadosGerais))
                    .addGroup(jPanelDadosGeraisLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtUnitOfMeasure)))
                .addContainerGap())
        );
        jPanelDadosGeraisLayout.setVerticalGroup(
            jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosGeraisLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUnitOfMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButtonSalvarDadosGerais)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dados Gerais", jPanelDadosGerais);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIDFocusLost
        String id = jTextFieldID.getText();

        if (!id.trim().equals("")) {
            this.mostrarUsuario(id);
        } else {
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            txtUnitOfMeasure.setText("");
        }
    }//GEN-LAST:event_jTextFieldIDFocusLost

    public void mostrarUsuario(String idTexto) {
        try {
            Integer id = Integer.parseInt(idTexto);

            productDAO dao = new productDAO();
            product obj = dao.getUsuario(id);

            if (obj != null) {
                //Preenche os dados do formulário
                jTextFieldID.setText(obj.getId().toString());
                jTextFieldNome.setText(obj.getName());
                txtUnitOfMeasure.setText(obj.getUnitOfMeasure());
            } else {
                JOptionPane.showMessageDialog(this, "Registro não encontrado.");
                jTextFieldID.setText("");
                jTextFieldNome.setText("");
                txtUnitOfMeasure.setText("");
                jTextFieldID.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar registro.");
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            txtUnitOfMeasure.setText("");
            jTextFieldID.requestFocus();
        }
    }

    private void jButtonSalvarDadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarDadosGeraisActionPerformed
        //Validações
        // - Campos obrigatórios
        // - Email correto

        Integer id = Integer.valueOf(jTextFieldID.getText());
        String nome = jTextFieldNome.getText();
        String unitOfMeasure = txtUnitOfMeasure.getText();

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (unitOfMeasure.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe a unidade de medida.");
            txtUnitOfMeasure.requestFocus();
            return;
        }

        product u = new product(id, nome, unitOfMeasure);

        try {
            productDAO dao = new productDAO();
            dao.atualizar(u);

            usuarioGerenciarForm.callback();

            JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonSalvarDadosGeraisActionPerformed

    private void txtUnitOfMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitOfMeasureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitOfMeasureActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarDadosGerais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelDadosGerais;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField txtUnitOfMeasure;
    // End of variables declaration//GEN-END:variables
}