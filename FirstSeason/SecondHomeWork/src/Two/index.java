/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Two;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author delanhese
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    int operator = 0;
    private ArrayList<Integer> values;
    private int currentPlayer;
    private ArrayList<JButton> buttons;

    public index() {
        initComponents();
        operator = JOptionPane.showConfirmDialog(null, "Voce quer usar o X?");
        values = new ArrayList<>();
        values.add(0);
        values.add(0);
        values.add(0);
        values.add(0);
        values.add(0);
        values.add(0);
        values.add(0);
        values.add(0);
        values.add(0);
        currentPlayer = 1;
        buttons = new ArrayList<>();
        buttons.add(ButtonOne);
        buttons.add(ButtonTwo);
        buttons.add(ButtonThree);
        buttons.add(ButtonFour);
        buttons.add(ButtonFive);
        buttons.add(ButtonSix);
        buttons.add(ButtonSeven);
        buttons.add(ButtonEigth);
        buttons.add(ButtonNine);
    }

    private void setNewValue(int position) {
        if (values.get(position) == 0) {
            values.set(position, operator + 1);
            JButton button = getButtonByPosition(position);
            if (operator == 0) {
                button.setText("X");
            } else {
                button.setText("O");
            }
            if (!checkGameOver()) {
                computerMove();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Posição já ocupada!");
        }
    }

    private void computerMove() {
        ArrayList<Integer> availablePositions = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == 0) {
                availablePositions.add(i);
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(availablePositions.size());
        int computerPosition = availablePositions.get(randomIndex);
        values.set(computerPosition, 3 - currentPlayer);
        if (operator == 0) {
            buttons.get(computerPosition).setText("O");
        } else {
            buttons.get(computerPosition).setText("X");
        }
        checkGameOver();
    }

    private boolean checkGameOver() {
        for (int i = 0; i <= 6; i += 3) {
            int value = values.get(i);
            if (value != 0 && value == values.get(i + 1) && value == values.get(i + 2)) {
                showGameOverMessage(value);
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            int value = values.get(i);
            if (value != 0 && value == values.get(i + 3) && value == values.get(i + 6)) {
                showGameOverMessage(value);
                return true;
            }
        }
        int centerValue = values.get(4);
        if (centerValue != 0) {
            if ((centerValue == values.get(0) && centerValue == values.get(8)) || (centerValue == values.get(2) && centerValue == values.get(6))) {
                showGameOverMessage(centerValue);
                return true;
            }
        }
        boolean isFull = true;
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == 0) {
                isFull = false;
                break;
            }
        }
        if (isFull) {
            showGameOverMessage(0);
            return true;
        }
        return false;
    }

    private void showGameOverMessage(int winner) {
        String message;
        if (winner == 0) {
            message = "Jogo empatado!";
        } else if ((operator == 0 && winner == 1) || (operator == 1 && winner == 2)) {
            message = "Você venceu!";
        } else {
            message = "Você perdeu!";
        }
        JOptionPane.showMessageDialog(null, message);
        resetGame();
    }

    private JButton getButtonByPosition(int position) {
        switch (position) {
            case 0:
                return ButtonOne;
            case 1:
                return ButtonTwo;
            case 2:
                return ButtonThree;
            case 3:
                return ButtonFour;
            case 4:
                return ButtonFive;
            case 5:
                return ButtonSix;
            case 6:
                return ButtonSeven;
            case 7:
                return ButtonEigth;
            case 8:
                return ButtonNine;
            default:
                return null;
        }
    }

    private void resetGame() {
        operator = JOptionPane.showConfirmDialog(null, "Você quer usar o X?");
        currentPlayer = 1;
        for (JButton button : buttons) {
            button.setText("");
        }
        for (int i = 0; i < values.size(); i++) {
            values.set(i, 0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonOne = new javax.swing.JButton();
        ButtonThree = new javax.swing.JButton();
        ButtonTwo = new javax.swing.JButton();
        ButtonFour = new javax.swing.JButton();
        ButtonSix = new javax.swing.JButton();
        ButtonFive = new javax.swing.JButton();
        ButtonSeven = new javax.swing.JButton();
        ButtonNine = new javax.swing.JButton();
        ButtonEigth = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonOne.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOneActionPerformed(evt);
            }
        });

        ButtonThree.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThreeActionPerformed(evt);
            }
        });

        ButtonTwo.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTwoActionPerformed(evt);
            }
        });

        ButtonFour.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFourActionPerformed(evt);
            }
        });

        ButtonSix.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSixActionPerformed(evt);
            }
        });

        ButtonFive.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiveActionPerformed(evt);
            }
        });

        ButtonSeven.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSevenActionPerformed(evt);
            }
        });

        ButtonNine.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNineActionPerformed(evt);
            }
        });

        ButtonEigth.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonEigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEigthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEigth, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEigth, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOneActionPerformed
        setNewValue(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonOneActionPerformed

    private void ButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTwoActionPerformed
        setNewValue(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTwoActionPerformed

    private void ButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThreeActionPerformed
        setNewValue(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonThreeActionPerformed

    private void ButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFourActionPerformed
        setNewValue(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFourActionPerformed

    private void ButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiveActionPerformed
        setNewValue(4);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFiveActionPerformed

    private void ButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSixActionPerformed
        setNewValue(5);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSixActionPerformed

    private void ButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSevenActionPerformed
        setNewValue(6);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSevenActionPerformed

    private void ButtonEigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEigthActionPerformed
        setNewValue(7);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEigthActionPerformed

    private void ButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNineActionPerformed
        setNewValue(8);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonNineActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEigth;
    private javax.swing.JButton ButtonFive;
    private javax.swing.JButton ButtonFour;
    private javax.swing.JButton ButtonNine;
    private javax.swing.JButton ButtonOne;
    private javax.swing.JButton ButtonSeven;
    private javax.swing.JButton ButtonSix;
    private javax.swing.JButton ButtonThree;
    private javax.swing.JButton ButtonTwo;
    // End of variables declaration//GEN-END:variables
}
