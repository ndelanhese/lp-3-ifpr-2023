package One;

import javax.swing.JOptionPane;

/**
 *
 * @author delanhese
 */
public class index extends javax.swing.JFrame {

    String word = "HANGMAN";
    String wordArray[] = word.split("");
    int currentPosition = 0;
    String gameWord[] = new String[wordArray.length];
    int lives = 7;

    public index() {
        initComponents();
        updateLivesLabel();

    }

    private void setNewLetter(String key) {
        boolean found = false;
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equalsIgnoreCase(key)) {
                gameWord[i] = key;
                found = true;
            }
        }
        if (!found) {
            lives--;
            updateLivesLabel();
        }
        currentPosition++;
        setInputValue();
    }

    private void updateLivesLabel() {
        LivesLabel.setText("Vidas restantes: " + lives);
    }

    private void setBackSpace() {
        if (currentPosition == 0) {
            gameWord[0] = "";
            setInputValue();
            return;
        }
        gameWord[currentPosition - 1] = "";
        currentPosition--;
        setInputValue();
    }

    private void setInputValue() {
        InputOne.setText(gameWord[0]);
        InputTwo.setText(gameWord[1]);
        InputThree.setText(gameWord[2]);
        InputFour.setText(gameWord[3]);
        InputFive.setText(gameWord[4]);
        InputSix.setText(gameWord[5]);
        InputSeven.setText(gameWord[6]);
        String userWord = "";
        for (int i = 0; i < gameWord.length; i++) {
            userWord += gameWord[i].trim();
        }
        if (userWord.length() == 7) {
            validateWord();
        }
    }

    private void validateWord() {
    if (gameWord == null) {
        return;
    }
    String userWord = "";
    for (int i = 0; i < gameWord.length; i++) {
        if (gameWord[i] != null && !gameWord[i].isEmpty()) {
            userWord += gameWord[i];
        }
    }
    System.out.println(userWord);
    if (!userWord.equals(word)) {
        JOptionPane.showMessageDialog(null, "Você perdeu.");
        resetGame();
        return;
    }

    JOptionPane.showMessageDialog(null, "Você ganhou.");
    resetGame();
}


    private void resetGame() {
        ButtonA.setEnabled(true);
        ButtonB.setEnabled(true);
        ButtonC.setEnabled(true);
        ButtonD.setEnabled(true);
        ButtonE.setEnabled(true);
        ButtonF.setEnabled(true);
        ButtonG.setEnabled(true);
        ButtonH.setEnabled(true);
        ButtonI.setEnabled(true);
        ButtonJ.setEnabled(true);
        ButtonK.setEnabled(true);
        ButtonL.setEnabled(true);
        ButtonM.setEnabled(true);
        ButtonN.setEnabled(true);
        ButtonO.setEnabled(true);
        ButtonP.setEnabled(true);
        ButtonQ.setEnabled(true);
        ButtonR.setEnabled(true);
        ButtonS.setEnabled(true);
        ButtonT.setEnabled(true);
        ButtonU.setEnabled(true);
        ButtonV.setEnabled(true);
        ButtonW.setEnabled(true);
        ButtonX.setEnabled(true);
        ButtonY.setEnabled(true);
        ButtonZ.setEnabled(true);
        ButtonCedilha.setEnabled(true);
        InputOne.setText("");
        InputTwo.setText("");
        InputThree.setText("");
        InputFour.setText("");
        InputFive.setText("");
        InputSix.setText("");
        InputSeven.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonQ = new javax.swing.JButton();
        ButtonW = new javax.swing.JButton();
        ButtonE = new javax.swing.JButton();
        ButtonY = new javax.swing.JButton();
        ButtonI = new javax.swing.JButton();
        ButtonP = new javax.swing.JButton();
        ButtonT = new javax.swing.JButton();
        ButtonO = new javax.swing.JButton();
        ButtonR = new javax.swing.JButton();
        ButtonU = new javax.swing.JButton();
        ButtonG = new javax.swing.JButton();
        ButtonK = new javax.swing.JButton();
        ButtonCedilha = new javax.swing.JButton();
        ButtonA = new javax.swing.JButton();
        ButtonF = new javax.swing.JButton();
        ButtonS = new javax.swing.JButton();
        ButtonJ = new javax.swing.JButton();
        ButtonD = new javax.swing.JButton();
        ButtonH = new javax.swing.JButton();
        ButtonL = new javax.swing.JButton();
        ButtonEnter = new javax.swing.JButton();
        ButtonM = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        ButtonN = new javax.swing.JButton();
        ButtonB = new javax.swing.JButton();
        ButtonZ = new javax.swing.JButton();
        ButtonV = new javax.swing.JButton();
        ButtonX = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        InputFive = new javax.swing.JTextField();
        InputOne = new javax.swing.JTextField();
        InputFour = new javax.swing.JTextField();
        InputTwo = new javax.swing.JTextField();
        InputThree = new javax.swing.JTextField();
        InputSix = new javax.swing.JTextField();
        InputSeven = new javax.swing.JTextField();
        lifeOne = new javax.swing.JLabel();
        lifeTwo = new javax.swing.JLabel();
        lifeThree = new javax.swing.JLabel();
        lifeFour = new javax.swing.JLabel();
        lifeFive = new javax.swing.JLabel();
        lifeSix = new javax.swing.JLabel();
        LivesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HangMan Game");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ButtonQ.setText("Q");
        ButtonQ.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonQ.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonQ.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQActionPerformed(evt);
            }
        });

        ButtonW.setText("W");
        ButtonW.setDefaultCapable(false);
        ButtonW.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonW.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonW.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWActionPerformed(evt);
            }
        });

        ButtonE.setText("E");
        ButtonE.setDefaultCapable(false);
        ButtonE.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonE.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonE.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEActionPerformed(evt);
            }
        });

        ButtonY.setText("Y");
        ButtonY.setDefaultCapable(false);
        ButtonY.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonY.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonY.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonYActionPerformed(evt);
            }
        });

        ButtonI.setText("I");
        ButtonI.setDefaultCapable(false);
        ButtonI.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonI.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonI.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIActionPerformed(evt);
            }
        });

        ButtonP.setText("P");
        ButtonP.setDefaultCapable(false);
        ButtonP.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonP.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonP.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPActionPerformed(evt);
            }
        });

        ButtonT.setText("T");
        ButtonT.setDefaultCapable(false);
        ButtonT.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonT.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonT.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTActionPerformed(evt);
            }
        });

        ButtonO.setText("O");
        ButtonO.setDefaultCapable(false);
        ButtonO.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonO.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonO.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOActionPerformed(evt);
            }
        });

        ButtonR.setText("R");
        ButtonR.setDefaultCapable(false);
        ButtonR.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonR.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonR.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRActionPerformed(evt);
            }
        });

        ButtonU.setText("U");
        ButtonU.setDefaultCapable(false);
        ButtonU.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonU.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonU.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUActionPerformed(evt);
            }
        });

        ButtonG.setText("G");
        ButtonG.setDefaultCapable(false);
        ButtonG.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonG.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonG.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGActionPerformed(evt);
            }
        });

        ButtonK.setText("K");
        ButtonK.setDefaultCapable(false);
        ButtonK.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonK.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonK.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKActionPerformed(evt);
            }
        });

        ButtonCedilha.setText("Ç");
        ButtonCedilha.setDefaultCapable(false);
        ButtonCedilha.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonCedilha.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonCedilha.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonCedilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCedilhaActionPerformed(evt);
            }
        });

        ButtonA.setText("A");
        ButtonA.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonA.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonA.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAActionPerformed(evt);
            }
        });

        ButtonF.setText("F");
        ButtonF.setDefaultCapable(false);
        ButtonF.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonF.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonF.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFActionPerformed(evt);
            }
        });

        ButtonS.setText("S");
        ButtonS.setDefaultCapable(false);
        ButtonS.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonS.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonS.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSActionPerformed(evt);
            }
        });

        ButtonJ.setText("J");
        ButtonJ.setDefaultCapable(false);
        ButtonJ.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonJ.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonJ.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonJActionPerformed(evt);
            }
        });

        ButtonD.setText("D");
        ButtonD.setDefaultCapable(false);
        ButtonD.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonD.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonD.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDActionPerformed(evt);
            }
        });

        ButtonH.setText("H");
        ButtonH.setDefaultCapable(false);
        ButtonH.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonH.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonH.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHActionPerformed(evt);
            }
        });

        ButtonL.setText("L");
        ButtonL.setDefaultCapable(false);
        ButtonL.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonL.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonL.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLActionPerformed(evt);
            }
        });

        ButtonEnter.setText("ENTER");
        ButtonEnter.setDefaultCapable(false);
        ButtonEnter.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonEnter.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonEnter.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnterActionPerformed(evt);
            }
        });

        ButtonM.setText("M");
        ButtonM.setDefaultCapable(false);
        ButtonM.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonM.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonM.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMActionPerformed(evt);
            }
        });

        ButtonC.setText("C");
        ButtonC.setDefaultCapable(false);
        ButtonC.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonC.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonC.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });

        ButtonN.setText("N");
        ButtonN.setDefaultCapable(false);
        ButtonN.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonN.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonN.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNActionPerformed(evt);
            }
        });

        ButtonB.setText("B");
        ButtonB.setDefaultCapable(false);
        ButtonB.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonB.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonB.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBActionPerformed(evt);
            }
        });

        ButtonZ.setText("Z");
        ButtonZ.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonZ.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonZ.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZActionPerformed(evt);
            }
        });

        ButtonV.setText("V");
        ButtonV.setDefaultCapable(false);
        ButtonV.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonV.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonV.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVActionPerformed(evt);
            }
        });

        ButtonX.setText("X");
        ButtonX.setDefaultCapable(false);
        ButtonX.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonX.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonX.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXActionPerformed(evt);
            }
        });

        ButtonBack.setText("BACK");
        ButtonBack.setDefaultCapable(false);
        ButtonBack.setMaximumSize(new java.awt.Dimension(44, 44));
        ButtonBack.setMinimumSize(new java.awt.Dimension(44, 44));
        ButtonBack.setPreferredSize(new java.awt.Dimension(44, 44));
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        InputFive.setEditable(false);
        InputFive.setPreferredSize(new java.awt.Dimension(44, 44));

        InputOne.setEditable(false);
        InputOne.setPreferredSize(new java.awt.Dimension(44, 44));

        InputFour.setEditable(false);
        InputFour.setPreferredSize(new java.awt.Dimension(44, 44));

        InputTwo.setEditable(false);
        InputTwo.setPreferredSize(new java.awt.Dimension(44, 44));

        InputThree.setEditable(false);
        InputThree.setPreferredSize(new java.awt.Dimension(44, 44));

        InputSix.setEditable(false);
        InputSix.setPreferredSize(new java.awt.Dimension(44, 44));

        InputSeven.setEditable(false);
        InputSeven.setPreferredSize(new java.awt.Dimension(44, 44));

        LivesLabel.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        LivesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(InputOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InputSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(ButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(ButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonCedilha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lifeOne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lifeTwo)
                                .addGap(18, 18, 18)
                                .addComponent(lifeFive)
                                .addGap(18, 18, 18)
                                .addComponent(lifeSix)
                                .addGap(18, 18, 18)
                                .addComponent(lifeFour)
                                .addGap(18, 18, 18)
                                .addComponent(lifeThree)
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LivesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonE, ButtonI, ButtonO, ButtonP, ButtonR, ButtonT, ButtonU, ButtonW, ButtonY});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lifeFive, lifeFour, lifeOne, lifeSix, lifeThree, lifeTwo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LivesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lifeOne)
                    .addComponent(lifeTwo)
                    .addComponent(lifeFive)
                    .addComponent(lifeSix)
                    .addComponent(lifeFour)
                    .addComponent(lifeThree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCedilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonE, ButtonI, ButtonO, ButtonP, ButtonQ, ButtonR, ButtonT, ButtonU, ButtonW, ButtonY});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lifeFive, lifeFour, lifeOne, lifeSix, lifeThree, lifeTwo});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWActionPerformed
        setNewLetter("W");
        ButtonW.setEnabled(false);
    }//GEN-LAST:event_ButtonWActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        setBackSpace();

    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHActionPerformed
        setNewLetter("H");
        ButtonH.setEnabled(false);
    }//GEN-LAST:event_ButtonHActionPerformed

    private void ButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnterActionPerformed
        validateWord();
    }//GEN-LAST:event_ButtonEnterActionPerformed

    private void ButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQActionPerformed
        setNewLetter("Q");
        ButtonQ.setEnabled(false);
    }//GEN-LAST:event_ButtonQActionPerformed

    private void ButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEActionPerformed
        setNewLetter("E");
        ButtonE.setEnabled(false);
    }//GEN-LAST:event_ButtonEActionPerformed

    private void ButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRActionPerformed
        setNewLetter("R");
        ButtonR.setEnabled(false);
    }//GEN-LAST:event_ButtonRActionPerformed

    private void ButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTActionPerformed
        setNewLetter("T");
        ButtonT.setEnabled(false);

    }//GEN-LAST:event_ButtonTActionPerformed

    private void ButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonYActionPerformed
        setNewLetter("Y");
        ButtonY.setEnabled(false);
        ButtonY.setEnabled(false);

    }//GEN-LAST:event_ButtonYActionPerformed

    private void ButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUActionPerformed
        setNewLetter("U");
        ButtonU.setEnabled(false);
        ButtonU.setEnabled(false);

    }//GEN-LAST:event_ButtonUActionPerformed

    private void ButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIActionPerformed
        setNewLetter("I");
        ButtonI.setEnabled(false);

    }//GEN-LAST:event_ButtonIActionPerformed

    private void ButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOActionPerformed
        setNewLetter("O");
        ButtonO.setEnabled(false);

    }//GEN-LAST:event_ButtonOActionPerformed

    private void ButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPActionPerformed
        setNewLetter("P");
        ButtonP.setEnabled(false);

    }//GEN-LAST:event_ButtonPActionPerformed

    private void ButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAActionPerformed
        setNewLetter("A");
        ButtonA.setEnabled(false);

    }//GEN-LAST:event_ButtonAActionPerformed

    private void ButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSActionPerformed
        setNewLetter("S");
        ButtonS.setEnabled(false);

    }//GEN-LAST:event_ButtonSActionPerformed

    private void ButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDActionPerformed
        setNewLetter("D");
        ButtonD.setEnabled(false);

    }//GEN-LAST:event_ButtonDActionPerformed

    private void ButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFActionPerformed
        setNewLetter("F");
        ButtonF.setEnabled(false);

    }//GEN-LAST:event_ButtonFActionPerformed

    private void ButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGActionPerformed
        setNewLetter("G");
        ButtonG.setEnabled(false);

    }//GEN-LAST:event_ButtonGActionPerformed

    private void ButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonJActionPerformed
        setNewLetter("J");
        ButtonJ.setEnabled(false);

    }//GEN-LAST:event_ButtonJActionPerformed

    private void ButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKActionPerformed
        setNewLetter("K");
        ButtonK.setEnabled(false);

    }//GEN-LAST:event_ButtonKActionPerformed

    private void ButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLActionPerformed
        setNewLetter("L");
        ButtonL.setEnabled(false);

    }//GEN-LAST:event_ButtonLActionPerformed

    private void ButtonCedilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCedilhaActionPerformed
        setNewLetter("Ç");
        ButtonCedilha.setEnabled(false);

    }//GEN-LAST:event_ButtonCedilhaActionPerformed

    private void ButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZActionPerformed
        setNewLetter("Z");
        ButtonZ.setEnabled(false);

    }//GEN-LAST:event_ButtonZActionPerformed

    private void ButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXActionPerformed
        setNewLetter("X");
        ButtonX.setEnabled(false);

    }//GEN-LAST:event_ButtonXActionPerformed

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        setNewLetter("C");
        ButtonC.setEnabled(false);

    }//GEN-LAST:event_ButtonCActionPerformed

    private void ButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVActionPerformed
        setNewLetter("V");
        ButtonV.setEnabled(false);

    }//GEN-LAST:event_ButtonVActionPerformed

    private void ButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBActionPerformed
        setNewLetter("B");
        ButtonB.setEnabled(false);

    }//GEN-LAST:event_ButtonBActionPerformed

    private void ButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNActionPerformed
        setNewLetter("N");
        ButtonN.setEnabled(false);

    }//GEN-LAST:event_ButtonNActionPerformed

    private void ButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMActionPerformed
        setNewLetter("M");
        ButtonM.setEnabled(false);

    }//GEN-LAST:event_ButtonMActionPerformed

    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonA;
    private javax.swing.JButton ButtonB;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonCedilha;
    private javax.swing.JButton ButtonD;
    private javax.swing.JButton ButtonE;
    private javax.swing.JButton ButtonEnter;
    private javax.swing.JButton ButtonF;
    private javax.swing.JButton ButtonG;
    private javax.swing.JButton ButtonH;
    private javax.swing.JButton ButtonI;
    private javax.swing.JButton ButtonJ;
    private javax.swing.JButton ButtonK;
    private javax.swing.JButton ButtonL;
    private javax.swing.JButton ButtonM;
    private javax.swing.JButton ButtonN;
    private javax.swing.JButton ButtonO;
    private javax.swing.JButton ButtonP;
    private javax.swing.JButton ButtonQ;
    private javax.swing.JButton ButtonR;
    private javax.swing.JButton ButtonS;
    private javax.swing.JButton ButtonT;
    private javax.swing.JButton ButtonU;
    private javax.swing.JButton ButtonV;
    private javax.swing.JButton ButtonW;
    private javax.swing.JButton ButtonX;
    private javax.swing.JButton ButtonY;
    private javax.swing.JButton ButtonZ;
    private javax.swing.JTextField InputFive;
    private javax.swing.JTextField InputFour;
    private javax.swing.JTextField InputOne;
    private javax.swing.JTextField InputSeven;
    private javax.swing.JTextField InputSix;
    private javax.swing.JTextField InputThree;
    private javax.swing.JTextField InputTwo;
    private javax.swing.JLabel LivesLabel;
    private javax.swing.JLabel lifeFive;
    private javax.swing.JLabel lifeFour;
    private javax.swing.JLabel lifeOne;
    private javax.swing.JLabel lifeSix;
    private javax.swing.JLabel lifeThree;
    private javax.swing.JLabel lifeTwo;
    // End of variables declaration//GEN-END:variables
}
