/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Ejecucion.TRABAJOEDAGRUPAL;
import static Ejecucion.TRABAJOEDAGRUPAL.Elecciones;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MenuCandidato extends javax.swing.JFrame {

    /**
     * Creates new form MenuCandidato
     */
    int IdC;
    String selec;
    Eleccion eleccionSeleccionada;
    int xMouse,yMouse;
    JComboBox<String> comboElecciones;
    
    public MenuCandidato() {
        initComponents(); 
    }
    public MenuCandidato(int id){
        initComponents();
        this.IdC = id;
        this.eleccionSeleccionada = TRABAJOEDAGRUPAL.buscarEleccionPorId(IdC);
        this.txtId.setText(Integer.toString(id));
        comboElecciones = new JComboBox<>();

        // Rellenar el JComboBox con las elecciones de la lista enlazada
        for (Candidato candidato : eleccionSeleccionada.getListaCandidatos()) {
            comboElecciones.addItem(candidato.getDni());
            
        }

            // Evento para manejar la selección de una elección
            comboElecciones.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedIndex = comboElecciones.getSelectedIndex();
                    if (selectedIndex == -1) { // Nada seleccionado aún
                        System.out.println("No has seleccionado ninguna opción.");
                    } else {
                        selec = (String) comboElecciones.getSelectedItem();
                        System.out.println("Seleccionaste: " + selec);
                    }
                }
            });
            bg.add(comboElecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 180, 30));
        
        
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
        BtnNuevoCandit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(51, Short.MAX_VALUE)
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
                .addContainerGap(408, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("MENÚ CANDIDATO");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        BtnNuevoCandit.setBackground(new java.awt.Color(2, 54, 114));
        BtnNuevoCandit.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BtnNuevoCandit.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevoCandit.setText("Crear");
        BtnNuevoCandit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoCanditMouseClicked(evt);
            }
        });
        BtnNuevoCandit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoCanditActionPerformed(evt);
            }
        });
        bg.add(BtnNuevoCandit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, 30));

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

        BtnModificar.setBackground(new java.awt.Color(2, 54, 114));
        BtnModificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setText("Modificar");
        BtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModificarMouseClicked(evt);
            }
        });
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        bg.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 210, 30));

        BtnEliminar.setBackground(new java.awt.Color(2, 54, 114));
        BtnEliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        bg.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 210, 30));

        jButton1.setBackground(new java.awt.Color(2, 54, 114));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 70, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Id:");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));
        bg.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 50, 20));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("Dni:");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoCanditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNuevoCanditMouseClicked
        // TODO add your handling code here:
        CrearCandidato candidato = new CrearCandidato();
        candidato.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnNuevoCanditMouseClicked

    private void BtnNuevoCanditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoCanditActionPerformed
        // TODO add your handling code here:
       
        CrearCandidato candidato = new CrearCandidato(IdC);
        candidato.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnNuevoCanditActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnModificarMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
        if(selec==null){
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna opción.");
        }
        ModificarCandidato candit = new ModificarCandidato(IdC,selec);
        candit.setVisible(true);
        this.dispose();
        
       

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        if(selec==null){
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna opción.");
        }
        
        for (Candidato candidato : eleccionSeleccionada.getListaCandidatos()) {
            if (candidato.getDni().equals(selec)) {
                eleccionSeleccionada.eliminarCandidato(selec);
                actualizarComboBox();
            }
        }
        
        

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuEleccion abrir = new MenuEleccion();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void actualizarComboBox() {
    // Limpiar los elementos actuales del JComboBox
    comboElecciones.removeAllItems(); 

    // Verificar que eleccionSeleccionada no sea null y tenga candidatos
    if (eleccionSeleccionada != null && eleccionSeleccionada.getListaCandidatos() != null) {
        // Añadir los DNIs de los candidatos restantes al JComboBox
        for (Candidato candidato : eleccionSeleccionada.getListaCandidatos()) {
            comboElecciones.addItem(candidato.getDni());
        }
    }

    // Restablecer sin selección inicial
    comboElecciones.setSelectedIndex(-1); 
}
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
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCandidato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevoCandit;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
}
