package Three;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class index extends javax.swing.JFrame {

    private ArrayList<String> questions;
    private ArrayList<String> responses;
    private ArrayList<String> userResponses;
    private int currentQuestion = 0;

    public index() {
        initComponents();
        questions = new ArrayList<>();
        questions.add("Qual é a capital da França?");
        questions.add("Quem pintou a obra Mona Lisa?");
        questions.add("Qual é o maior planeta do Sistema Solar?");
        questions.add("Qual é o rio mais longo do mundo?");
        questions.add("Quem escreveu a peça Romeu e Julieta?");
        responses = new ArrayList<>();
        responses.add("paris");
        responses.add("leonardo da vinci");
        responses.add("jupiter");
        responses.add("nilo");
        responses.add("william shakespeare");
        userResponses = new ArrayList<>();
        populateLayout();
    }

    private void populateLayout() {
        String currentQuestionText = questions.get(currentQuestion);
        int currentQuestionNumber = currentQuestion + 1;
        String currentQuestionNumberText = "Pergunta " + currentQuestionNumber;
        labelQuestion.setText(currentQuestionText);
        labelQuestionNumber.setText(currentQuestionNumberText);
        inputResponse.setText("");
        if (userResponses.size() > currentQuestion) {
            String previousResponse = userResponses.get(currentQuestion);
            inputResponse.setText(previousResponse);
        }
        if (currentQuestion == questions.size() - 1) {
            ButtonNext.setText("Proxima");
        } else {
            ButtonNext.setText("Finalizar");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelQuestionNumber = new javax.swing.JLabel();
        inputResponse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelQuestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonNext.setText("Próxima");
        ButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextActionPerformed(evt);
            }
        });

        jLabel1.setText("Resposta");

        labelQuestionNumber.setText("01");

        jLabel2.setText("Pergunta");

        labelQuestion.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        labelQuestion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(labelQuestionNumber))
                            .addComponent(jLabel2))
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonNext)
                        .addGap(276, 276, 276))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(labelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelQuestionNumber))
                .addGap(18, 18, 18)
                .addComponent(inputResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonNext)
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextActionPerformed
        String userResponse = inputResponse.getText();
        userResponses.add(userResponse);
        if (currentQuestion == questions.size() - 1) {
            int numCorrect = 0;
            int numIncorrect = 0;
            for (int i = 0; i < responses.size(); i++) {
                String userResponseText = userResponses.get(i);
                String correctResponse = responses.get(i);
                if (userResponseText.equalsIgnoreCase(correctResponse)) {
                    numCorrect++;
                } else {
                    numIncorrect++;
                }
            }
            String message = "Respostas corretas: " + numCorrect + "\n";
            message += "Respostas incorretas: " + numIncorrect;
            JOptionPane.showMessageDialog(null, message, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else {
            currentQuestion++;
            populateLayout();
        }
    }//GEN-LAST:event_ButtonNextActionPerformed

    private void resetGame() {
        userResponses.clear();
        currentQuestion = 0;
        populateLayout();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNext;
    private javax.swing.JTextField inputResponse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelQuestion;
    private javax.swing.JLabel labelQuestionNumber;
    // End of variables declaration//GEN-END:variables
}
