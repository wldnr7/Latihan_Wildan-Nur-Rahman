/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


public class ConversionCelcius extends javax.swing.JFrame {

    double celcius;
    double fahrenheit;
    double kelvin;
    double reamur;
   
    public ConversionCelcius() {
        initComponents();
    }

    private void celcius(){
        //mengambil nilai dari input text
        celcius = Double.parseDouble(inputText.getText());
        //hasil
        fahrenheit = celcius * 1.8 + 32;
        kelvin = celcius + 273.15;
        reamur = celcius * 0.8;
        
        //set label
        celciusLabel.setText(celcius + " celcius");
        fahrenheitLabel.setText(fahrenheit + " fahrenheit");
        kelvinLabel.setText(kelvin + " kelvin");
        reamurLabel.setText(reamur + " reamur");
         
    }
    private void fahrenheit(){
        fahrenheit = Double.parseDouble(inputText.getText());
        celcius = (fahrenheit - 32) / 1.8;
        kelvin = (fahrenheit + 459.67) / 1.8;
        reamur = (fahrenheit + 32) / 2.25;
        
         //set label
        celciusLabel.setText(celcius + " celcius");
        fahrenheitLabel.setText(fahrenheit + " fahrenheit");
        kelvinLabel.setText(kelvin + " kelvin");
        reamurLabel.setText(reamur + " reamur");
    }
    private void kelvin(){
        kelvin = Double.parseDouble(inputText.getText());
        celcius = kelvin - 273.15;
        fahrenheit = kelvin * 1.8 - 459.67;
        reamur = (kelvin - 273.15) * 0.8;
        
        //set label
        celciusLabel.setText(celcius + " celcius");
        fahrenheitLabel.setText(fahrenheit + " fahrenheit");
        kelvinLabel.setText(kelvin + " kelvin");
        reamurLabel.setText(reamur + " reamur");
    }
    private void reamur(){
        reamur = Double.parseDouble(inputText.getText());
        celcius = reamur / 0.8;
        fahrenheit = (reamur * 2.25) + 32;
        kelvin = (reamur / 0.8) + 273.15;
        
        //set label
        celciusLabel.setText(celcius + " celcius");
        fahrenheitLabel.setText(fahrenheit + " fahrenheit");
        kelvinLabel.setText(kelvin + " kelvin");
        reamurLabel.setText(reamur + " reamur");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputText = new javax.swing.JTextField();
        judulLabel = new javax.swing.JLabel();
        konverButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        rButton1 = new javax.swing.JRadioButton();
        rButton2 = new javax.swing.JRadioButton();
        rButton3 = new javax.swing.JRadioButton();
        rButton4 = new javax.swing.JRadioButton();
        textInputLabel = new javax.swing.JLabel();
        celciusLabel = new javax.swing.JLabel();
        fahrenheitLabel = new javax.swing.JLabel();
        kelvinLabel = new javax.swing.JLabel();
        reamurLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        judulLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judulLabel.setText("Konversi Suhu");

        konverButton.setText("Konversi");
        konverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konverButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        rButton1.setText("Celcius");

        rButton2.setText("Fahrenheit");

        rButton3.setText("Kelvin");

        rButton4.setText("Reamur");

        textInputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textInputLabel.setText("Masukan Input ");

        celciusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        celciusLabel.setText("Celcius");

        fahrenheitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fahrenheitLabel.setText("Fahrenheit");

        kelvinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kelvinLabel.setText("Kelvin");

        reamurLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reamurLabel.setText("Reamur");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Hasil Konversi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(textInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(konverButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetButton))
                        .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButton4)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celciusLabel)
                            .addComponent(jLabel1)
                            .addComponent(fahrenheitLabel)
                            .addComponent(kelvinLabel)
                            .addComponent(reamurLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(judulLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textInputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rButton1)
                    .addComponent(rButton2)
                    .addComponent(rButton3)
                    .addComponent(rButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(konverButton)
                    .addComponent(resetButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(celciusLabel)
                .addGap(18, 18, 18)
                .addComponent(fahrenheitLabel)
                .addGap(18, 18, 18)
                .addComponent(kelvinLabel)
                .addGap(18, 18, 18)
                .addComponent(reamurLabel)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        //set label
        inputText.setText("");
        celciusLabel.setText("Celcius");
        fahrenheitLabel.setText("Fahrenheit");
        kelvinLabel.setText("Kelvin");
        reamurLabel.setText("Reamur");
        
        rButton1.setSelected(false);
        rButton2.setSelected(false);
        rButton3.setSelected(false);
        rButton4.setSelected(false);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void konverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konverButtonActionPerformed
        if(rButton1.isSelected()){
            celcius();
        }else if(rButton2.isSelected()){
            fahrenheit();
        }else if(rButton3.isSelected()){
            kelvin();
        }else if(rButton4.isSelected()){
            reamur();
        }
    }//GEN-LAST:event_konverButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConversionCelcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionCelcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionCelcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionCelcius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionCelcius().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celciusLabel;
    private javax.swing.JLabel fahrenheitLabel;
    public javax.swing.JTextField inputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel kelvinLabel;
    private javax.swing.JButton konverButton;
    private javax.swing.JRadioButton rButton1;
    private javax.swing.JRadioButton rButton2;
    private javax.swing.JRadioButton rButton3;
    private javax.swing.JRadioButton rButton4;
    private javax.swing.JLabel reamurLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel textInputLabel;
    // End of variables declaration//GEN-END:variables
}
