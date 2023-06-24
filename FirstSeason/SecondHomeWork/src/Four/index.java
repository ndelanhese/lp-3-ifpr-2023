package Four;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class index extends javax.swing.JFrame {

    private int[][] board;
    private int currentPlayer;
    private int playerOneScore;
    private int playerTwoScore;
    private boolean gameOver;
    private int foundCount;

    public index() {
        initComponents();
        initializeGame();
    }

    private void initializeGame() {
        board = new int[4][4];
        currentPlayer = 1;
        playerOneScore = 0;
        playerTwoScore = 0;
        foundCount = 0;
        gameOver = false;
        fillBoard();
    }

    private void fillBoard() {
        board[0][0] = 1;
        board[0][1] = 1;
        board[0][2] = 0;
        board[0][3] = 1;
        board[1][0] = 0;
        board[1][1] = 0;
        board[1][2] = 1;
        board[1][3] = 0;
        board[2][0] = 0;
        board[2][1] = 0;
        board[2][2] = 0;
        board[2][3] = 0;
        board[3][0] = 0;
        board[3][1] = 0;
        board[3][2] = 0;
        board[3][3] = 1;
    }

    private void hiddenButtonsText() {
        ButtonOne.setText("");
        ButtonTwo.setText("");
        ButtonThree.setText("");
        ButtonFour.setText("");
        ButtonFive.setText("");
        ButtonSix.setText("");
        ButtonSeven.setText("");
        ButtonEight.setText("");
        ButtonNine.setText("");
        ButtonTen.setText("");
        ButtonEleven.setText("");
        ButtonTwelve.setText("");
        ButtonThirteen.setText("");
        ButtonFourteen.setText("");
        ButtonFiveteen.setText("");
        ButtonSixteen.setText("");

    }

    private void startGame() {
        enableButtons();
        hiddenButtonsText();
    }

    private void enableButtons() {
        ButtonOne.setEnabled(true);
        ButtonTwo.setEnabled(true);
        ButtonThree.setEnabled(true);
        ButtonFour.setEnabled(true);
        ButtonFive.setEnabled(true);
        ButtonSix.setEnabled(true);
        ButtonSeven.setEnabled(true);
        ButtonEight.setEnabled(true);
        ButtonNine.setEnabled(true);
        ButtonTen.setEnabled(true);
        ButtonEleven.setEnabled(true);
        ButtonTwelve.setEnabled(true);
        ButtonThirteen.setEnabled(true);
        ButtonFourteen.setEnabled(true);
        ButtonFiveteen.setEnabled(true);
        ButtonSixteen.setEnabled(true);
    }

    private void buttonAction(int row, int col, JButton button) {
        if (gameOver) {
            return;
        }
        int value = board[row][col];
        if (value == 1) {
            button.setText("1");
            if (currentPlayer == 1) {
                playerOneScore++;
            } else {
                playerTwoScore++;
            }
            foundCount++;
            if (foundCount == 5) {
                gameOver = true;
                showWinner();
                return;
            }
        } else {
            button.setText("X");
        }
        currentPlayer = currentPlayer == 1 ? 2 : 1;
    }

    private void showWinner() {
        String winner;
        if (playerOneScore > playerTwoScore) {
            winner = "Jogador 1";
        } else if (playerOneScore < playerTwoScore) {
            winner = "Jogador 2";
        } else {
            winner = "Empate";
        }
        JOptionPane.showMessageDialog(this, "O vencedor é: " + winner, "Fim do Jogo", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonOne = new javax.swing.JButton();
        ButtonTwo = new javax.swing.JButton();
        ButtonThree = new javax.swing.JButton();
        ButtonFour = new javax.swing.JButton();
        ButtonFive = new javax.swing.JButton();
        ButtonSix = new javax.swing.JButton();
        ButtonSeven = new javax.swing.JButton();
        ButtonEight = new javax.swing.JButton();
        ButtonEleven = new javax.swing.JButton();
        ButtonTwelve = new javax.swing.JButton();
        ButtonThirteen = new javax.swing.JButton();
        ButtonFourteen = new javax.swing.JButton();
        ButtonFiveteen = new javax.swing.JButton();
        ButtonSixteen = new javax.swing.JButton();
        ButtonNine = new javax.swing.JButton();
        ButtonTen = new javax.swing.JButton();
        ButtonStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonOne.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonOne.setText("1");
        ButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOneActionPerformed(evt);
            }
        });

        ButtonTwo.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonTwo.setText("1");
        ButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTwoActionPerformed(evt);
            }
        });

        ButtonThree.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonThree.setText("X");
        ButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThreeActionPerformed(evt);
            }
        });

        ButtonFour.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonFour.setText("1");
        ButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFourActionPerformed(evt);
            }
        });

        ButtonFive.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonFive.setText("X");
        ButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiveActionPerformed(evt);
            }
        });

        ButtonSix.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonSix.setText("X");
        ButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSixActionPerformed(evt);
            }
        });

        ButtonSeven.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonSeven.setText("X");
        ButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSevenActionPerformed(evt);
            }
        });

        ButtonEight.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonEight.setText("X");
        ButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEightActionPerformed(evt);
            }
        });

        ButtonEleven.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonEleven.setText("X");
        ButtonEleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonElevenActionPerformed(evt);
            }
        });

        ButtonTwelve.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonTwelve.setText("X");
        ButtonTwelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTwelveActionPerformed(evt);
            }
        });

        ButtonThirteen.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonThirteen.setText("X");
        ButtonThirteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThirteenActionPerformed(evt);
            }
        });

        ButtonFourteen.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonFourteen.setText("X");
        ButtonFourteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFourteenActionPerformed(evt);
            }
        });

        ButtonFiveteen.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonFiveteen.setText("X");
        ButtonFiveteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiveteenActionPerformed(evt);
            }
        });

        ButtonSixteen.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonSixteen.setText("1");
        ButtonSixteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSixteenActionPerformed(evt);
            }
        });

        ButtonNine.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonNine.setText("X");
        ButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNineActionPerformed(evt);
            }
        });

        ButtonTen.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        ButtonTen.setText("1");
        ButtonTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTenActionPerformed(evt);
            }
        });

        ButtonStart.setText("Comecar");
        ButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStartActionPerformed(evt);
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
                        .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonStart)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonFiveteen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonEight, ButtonEleven, ButtonFive, ButtonFiveteen, ButtonFour, ButtonFourteen, ButtonNine, ButtonOne, ButtonSeven, ButtonSix, ButtonSixteen, ButtonTen, ButtonThirteen, ButtonThree, ButtonTwelve, ButtonTwo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFiveteen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(ButtonStart)
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonEight, ButtonEleven, ButtonFive, ButtonFiveteen, ButtonFour, ButtonFourteen, ButtonNine, ButtonOne, ButtonSeven, ButtonSix, ButtonSixteen, ButtonTen, ButtonThirteen, ButtonThree, ButtonTwelve, ButtonTwo});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStartActionPerformed
        startGame();
// TODO add your handling code here:
    }//GEN-LAST:event_ButtonStartActionPerformed

    private void ButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOneActionPerformed
        buttonAction(0, 0, ButtonOne);       // TODO add your handling code here:
    }//GEN-LAST:event_ButtonOneActionPerformed

    private void ButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTwoActionPerformed
        buttonAction(0, 1, ButtonTwo);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTwoActionPerformed

    private void ButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThreeActionPerformed
        buttonAction(0, 2, ButtonThree);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonThreeActionPerformed

    private void ButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFourActionPerformed
        buttonAction(0, 3, ButtonFour);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFourActionPerformed

    private void ButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiveActionPerformed
        buttonAction(1, 0, ButtonFive);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFiveActionPerformed

    private void ButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSixActionPerformed
        buttonAction(1, 1, ButtonSix);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSixActionPerformed

    private void ButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSevenActionPerformed
        buttonAction(1, 2, ButtonSeven);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSevenActionPerformed

    private void ButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEightActionPerformed
        buttonAction(1, 3, ButtonEight);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEightActionPerformed

    private void ButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNineActionPerformed
        buttonAction(2, 0, ButtonNine);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonNineActionPerformed

    private void ButtonTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTenActionPerformed
        buttonAction(2, 1, ButtonTen);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTenActionPerformed

    private void ButtonElevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonElevenActionPerformed
        buttonAction(2, 2, ButtonEleven);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonElevenActionPerformed

    private void ButtonTwelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTwelveActionPerformed
        buttonAction(2, 3, ButtonTwelve);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTwelveActionPerformed

    private void ButtonThirteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThirteenActionPerformed
        buttonAction(3, 0, ButtonThirteen);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonThirteenActionPerformed

    private void ButtonFourteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFourteenActionPerformed
        buttonAction(3, 1, ButtonFourteen);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFourteenActionPerformed

    private void ButtonFiveteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiveteenActionPerformed
        buttonAction(3, 2, ButtonFiveteen);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFiveteenActionPerformed

    private void ButtonSixteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSixteenActionPerformed
        buttonAction(3, 3, ButtonSixteen);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSixteenActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEight;
    private javax.swing.JButton ButtonEleven;
    private javax.swing.JButton ButtonFive;
    private javax.swing.JButton ButtonFiveteen;
    private javax.swing.JButton ButtonFour;
    private javax.swing.JButton ButtonFourteen;
    private javax.swing.JButton ButtonNine;
    private javax.swing.JButton ButtonOne;
    private javax.swing.JButton ButtonSeven;
    private javax.swing.JButton ButtonSix;
    private javax.swing.JButton ButtonSixteen;
    private javax.swing.JButton ButtonStart;
    private javax.swing.JButton ButtonTen;
    private javax.swing.JButton ButtonThirteen;
    private javax.swing.JButton ButtonThree;
    private javax.swing.JButton ButtonTwelve;
    private javax.swing.JButton ButtonTwo;
    // End of variables declaration//GEN-END:variables
}
