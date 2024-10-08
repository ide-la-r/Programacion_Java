/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenInterfaces;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author MEDAC_MAÑANA
 */
public class Ejercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio2
     */
    public Ejercicio2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoTitulo = new javax.swing.JLabel();
        textoFichero = new javax.swing.JLabel();
        fichero = new javax.swing.JTextField();
        checkboxAgregar = new javax.swing.JCheckBox();
        checkboxCapitalizar = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoVolcar = new javax.swing.JTextArea();
        botonVolcar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoTitulo.setText("EJERCICIO 2");

        textoFichero.setText("Nombre del Fichero:");

        checkboxAgregar.setText("Agregar");

        checkboxCapitalizar.setText("Capitalizar");

        textoVolcar.setColumns(20);
        textoVolcar.setRows(5);
        jScrollPane1.setViewportView(textoVolcar);

        botonVolcar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVolcar.setText("VOLCAR TEXTO");
        botonVolcar.setActionCommand("VOLCAR TEXTO");
        botonVolcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(checkboxAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkboxCapitalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fichero)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(botonVolcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoFichero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fichero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxAgregar)
                    .addComponent(checkboxCapitalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVolcar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolcarActionPerformed
        String destino = fichero.getText();
        BufferedWriter br = null;
        File archivo = new File(destino);
        
        if (!"".equals(destino)) {
            if (checkboxAgregar.isSelected()) {
                try {
                br = new BufferedWriter(new FileWriter(archivo,true));


                br.append(textoVolcar.getText());

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error escribiendo", "ERROR", ERROR);
                }

                finally{

                    try {
                        if (br != null) br.close();
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error cerrando flujos", "ERROR", ERROR);
                    }
                }
            }
            else if (checkboxCapitalizar.isSelected()) {
                try {
                    br = new BufferedWriter(new FileWriter(archivo));

                    String mayuscula = textoVolcar.getText().toUpperCase();
                    br.write(mayuscula);

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error escribiendo", "ERROR", ERROR);
                }

                finally{

                    try {
                        if (br != null) br.close();
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error cerrando flujos", "ERROR", ERROR);
                    }
                }
            }
            else if (checkboxAgregar.isSelected() && checkboxCapitalizar.isSelected()) {
                try {
                    br = new BufferedWriter(new FileWriter(archivo,true));


                    br.append(textoVolcar.getText().toUpperCase());

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error escribiendo", "ERROR", ERROR);
                }

                finally{

                    try {
                        if (br != null) br.close();
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error cerrando flujos", "ERROR", ERROR);
                    }
                }
            }
            else{
                try {
                    br = new BufferedWriter(new FileWriter(archivo));


                    br.write(textoVolcar.getText());

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error escribiendo", "ERROR", ERROR);
                }

                finally{

                    try {
                        if (br != null) br.close();
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error cerrando flujos", "ERROR", ERROR);
                    }
                }
            }
        
        textoVolcar.setText("");
        }
        
        
    }//GEN-LAST:event_botonVolcarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolcar;
    private javax.swing.JCheckBox checkboxAgregar;
    private javax.swing.JCheckBox checkboxCapitalizar;
    private javax.swing.JTextField fichero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textoFichero;
    private javax.swing.JLabel textoTitulo;
    private javax.swing.JTextArea textoVolcar;
    // End of variables declaration//GEN-END:variables
}
