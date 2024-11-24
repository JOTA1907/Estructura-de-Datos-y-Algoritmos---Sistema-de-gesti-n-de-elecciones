/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Ejecucion.TRABAJOEDAGRUPAL;
import Modelo.*;
import static Ejecucion.TRABAJOEDAGRUPAL.Elecciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author luisg
 */
public class MenuInformes extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int xMouse,yMouse;
    String selec;
    public MenuInformes() {
        
        initComponents();
        
        JComboBox<String> comboElecciones = new JComboBox<>();

        // Rellenar el JComboBox con las elecciones de la lista enlazada
        for (Eleccion eleccion : TRABAJOEDAGRUPAL.Elecciones) {
            comboElecciones.addItem(String.valueOf(eleccion.getId()));
            
        }

        // Evento para manejar la selección de una elección
        comboElecciones.setSelectedIndex(-1); // No mostrar selección inicial

        comboElecciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboElecciones.getSelectedIndex();
                if (selectedIndex == -1) { // Nada seleccionado aún
                    System.out.println("No has seleccionado ninguna opción.");
                } else {
                    String seleccion = (String) comboElecciones.getSelectedItem();
                    selec = seleccion;
                    System.out.println("Seleccionaste: " + seleccion);
                }
            }
        });
        bg.add(comboElecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, 30));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        BtnRegistro4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnRegistro5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 54, 114));

        jPanel2.setBackground(new java.awt.Color(221, 0, 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 55, 112));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONPE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("MENÚ");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        BtnSalir.setBackground(new java.awt.Color(2, 54, 114));
        BtnSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("Salir");
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        bg.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 80, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        BtnRegistro4.setBackground(new java.awt.Color(2, 54, 114));
        BtnRegistro4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BtnRegistro4.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistro4.setText("Actas");
        BtnRegistro4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistro4MouseClicked(evt);
            }
        });
        BtnRegistro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistro4ActionPerformed(evt);
            }
        });
        bg.add(BtnRegistro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, 30));

        jLabel3.setText("Elecciones");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 70, -1));

        BtnRegistro5.setBackground(new java.awt.Color(2, 54, 114));
        BtnRegistro5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BtnRegistro5.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistro5.setText("Reporte Final");
        BtnRegistro5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistro5MouseClicked(evt);
            }
        });
        BtnRegistro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistro5ActionPerformed(evt);
            }
        });
        bg.add(BtnRegistro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnRegistro4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistro4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistro4MouseClicked

    private void BtnRegistro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistro4ActionPerformed
        // TODO add your handling code here:
        TablaActas actas = new TablaActas(Integer.parseInt(selec));
        actas.setVisible(true);
        
    }//GEN-LAST:event_BtnRegistro4ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnRegistro5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistro5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistro5MouseClicked

    private void BtnRegistro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistro5ActionPerformed
        // TODO add your handling code here:
        if("Cerrado".equals(TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(selec)).getEstado())){
        Informe informe = new Informe(selec);
        informe.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Elección debe haber sido cerrada.");
        }
    }//GEN-LAST:event_BtnRegistro5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MenuInformes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistro4;
    private javax.swing.JButton BtnRegistro5;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
