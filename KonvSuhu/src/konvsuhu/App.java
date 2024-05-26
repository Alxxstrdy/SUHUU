/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konvsuhu;

/**
 *
 * @author Alxxstrdy
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public App() {
        initComponents();
        reset();
    }
    void reset(){
        tsuhuasal.setText(null);
        vhasil.setText(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        breset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bclose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tsuhuasal = new javax.swing.JTextField();
        tskalaasal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tskalahasil = new javax.swing.JComboBox<>();
        bkonversi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        vhasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Downloads\\temperature.png")); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        bclose.setText("CLOSE");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SUHU ASAL"));

        tsuhuasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsuhuasalActionPerformed(evt);
            }
        });

        tskalaasal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenheit" }));
        tskalaasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tskalaasalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tsuhuasal)
                    .addComponent(tskalaasal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tsuhuasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tskalaasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("KONVERSI KE"));

        tskalahasil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Fahrenheit" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tskalahasil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tskalahasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bkonversi.setText("KONVERSI");
        bkonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkonversiActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        vhasil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vhasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vhasil.setText("jLabel2");
        jPanel3.add(vhasil, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(breset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bclose)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bkonversi)
                                .addGap(88, 88, 88))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bkonversi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breset)
                    .addComponent(bclose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tsuhuasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsuhuasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsuhuasalActionPerformed

    private void tskalaasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tskalaasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tskalaasalActionPerformed

    private void bkonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkonversiActionPerformed
        double SuhuAsal = Double.parseDouble(tsuhuasal.getText());
        String SkalaAsal = tskalaasal.getSelectedItem().toString();
        String SkalaHasil = tskalahasil.getSelectedItem().toString();
        double hasil = 0;
        if(SkalaAsal.equals("Celcius") && SkalaHasil.equals("Celcius")){
            hasil = SuhuAsal;
        }else if (SkalaAsal.equals("Celcius") && SkalaHasil.equals("Fahrenheit")){
            hasil = (SuhuAsal*9/5)+32;    
        } else if (SkalaAsal.equals("Celcius") && SkalaHasil.equals("Kelvin")){
            hasil = SuhuAsal+273.15;
        }else if (SkalaAsal.equals("Fahrenheit") && SkalaHasil.equals("Celcius")){
            hasil = (SuhuAsal-32)*5/9+273.15;
        }else if (SkalaAsal.equals("Fahrenheit") && SkalaHasil.equals("Fahrenheit")){
            hasil = SuhuAsal;
        }else if (SkalaAsal.equals("Fahrenheit") && SkalaHasil.equals("Kelvin")){
            hasil = (SuhuAsal-32)*5/9+273.15;
        }else if (SkalaAsal.equals("Kelvin") && SkalaHasil.equals("Celcius")){
            hasil = SuhuAsal-273.15;
        }else if (SkalaAsal.equals("Kelvin") && SkalaHasil.equals("Kelvin")){
            hasil = SuhuAsal;
        }else if (SkalaAsal.equals("Kelvin") && SkalaHasil.equals("Fahrenheit")){
            hasil = (SuhuAsal-273.15)*9/5+32;
        }
        String Skala = SkalaHasil.substring(0,1);
        vhasil.setText(String.format("%.2f", hasil)+"\u00b0"+Skala);
        
    }//GEN-LAST:event_bkonversiActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        reset();
    }//GEN-LAST:event_bresetActionPerformed

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        dispose();
    }//GEN-LAST:event_bcloseActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclose;
    private javax.swing.JButton bkonversi;
    private javax.swing.JButton breset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> tskalaasal;
    private javax.swing.JComboBox<String> tskalahasil;
    private javax.swing.JTextField tsuhuasal;
    private javax.swing.JLabel vhasil;
    // End of variables declaration//GEN-END:variables
}
