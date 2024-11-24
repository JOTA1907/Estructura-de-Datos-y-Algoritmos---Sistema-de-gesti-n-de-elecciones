/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Ejecucion.TRABAJOEDAGRUPAL;
import Modelo.Eleccion;
import Modelo.Mesa.*;
import Modelo.Mesa;
import java.util.LinkedList;
import javax.swing.JComboBox;
import static Ejecucion.TRABAJOEDAGRUPAL.Elecciones;
import javax.swing.JOptionPane;
/**
 *
 * @author joaqu
 */
public class CrearMesa extends javax.swing.JFrame {

    /**
     * Creates new form CrearMesa
     */
    public CrearMesa() {
        initComponents();
    }
    String eleccionid;
    
    public CrearMesa(String eleccionid) {
        initComponents();
        
        this.NumeroMesatxtField.setText(Integer.toString(Eleccion.getNumMesa()));
        idEleccion.setText(eleccionid);
        this.eleccionid = eleccionid;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NumeroMesatxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UbicaciontxtField = new javax.swing.JTextField();
        CrearMesabtn = new javax.swing.JButton();
        cancelarMesabtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idEleccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 54, 114));

        jPanel3.setBackground(new java.awt.Color(221, 0, 5));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 55, 112));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONPE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 260));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Elección");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 20));

        NumeroMesatxtField.setEditable(false);
        NumeroMesatxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NumeroMesatxtField.setToolTipText("");
        NumeroMesatxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroMesatxtFieldActionPerformed(evt);
            }
        });
        panel1.add(NumeroMesatxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 280, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ubicacion:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        UbicaciontxtField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        UbicaciontxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbicaciontxtFieldActionPerformed(evt);
            }
        });
        panel1.add(UbicaciontxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 280, -1));

        CrearMesabtn.setBackground(new java.awt.Color(2, 54, 114));
        CrearMesabtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CrearMesabtn.setForeground(new java.awt.Color(255, 255, 255));
        CrearMesabtn.setText("Crear");
        CrearMesabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearMesabtnActionPerformed(evt);
            }
        });
        panel1.add(CrearMesabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 202, -1, 20));

        cancelarMesabtn.setBackground(new java.awt.Color(2, 54, 114));
        cancelarMesabtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancelarMesabtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelarMesabtn.setText("Cancelar");
        cancelarMesabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarMesabtnActionPerformed(evt);
            }
        });
        panel1.add(cancelarMesabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CREAR MESA");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        idEleccion.setBackground(new java.awt.Color(0, 0, 0));
        idEleccion.setForeground(new java.awt.Color(0, 0, 0));
        idEleccion.setText("ID:");
        panel1.add(idEleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumeroMesatxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroMesatxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroMesatxtFieldActionPerformed

    private void CrearMesabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearMesabtnActionPerformed

        boolean correcto = false;
        
        String ubicacion = UbicaciontxtField.getText();
        for (Eleccion eleccion : TRABAJOEDAGRUPAL.Elecciones) {
            if (Integer.parseInt(this.eleccionid) == eleccion.getId()) {
                if (!ubicacion.isEmpty()) {
                    eleccion.crearMesa(UbicaciontxtField.getText());
                    correcto = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ingrese una ubicacion");
                    correcto = false;
                } 
            }
        }

        if (correcto == true) {
            JOptionPane.showMessageDialog(null, "Mesa creada correctamente");
            MenuMesas menuMesas = new MenuMesas(eleccionid);
            menuMesas.setVisible(true);
            this.setVisible(false);
        }
        else{
           JOptionPane.showMessageDialog(null, "No se pudo crear la mesa");
        }

    }//GEN-LAST:event_CrearMesabtnActionPerformed

    private void cancelarMesabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarMesabtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelarMesabtnActionPerformed

    private void UbicaciontxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbicaciontxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UbicaciontxtFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CrearMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearMesabtn;
    private javax.swing.JTextField NumeroMesatxtField;
    private javax.swing.JTextField UbicaciontxtField;
    private javax.swing.JButton cancelarMesabtn;
    private javax.swing.JLabel idEleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
