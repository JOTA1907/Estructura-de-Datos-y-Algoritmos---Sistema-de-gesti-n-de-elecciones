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
import Modelo.MiembroMesa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author joaqu
 */
public class MenuMesas extends javax.swing.JFrame {

    /**
     * Creates new form MenuMesas
     */

    int xMouse,yMouse;
    String eleccionid;
    int numeroMesa;
    
    public MenuMesas() {
        initComponents(); 
  
    }
    public MenuMesas(String eleid) {
        initComponents();

        JComboBox<String> comboMesas = new JComboBox<>();

        comboMesas.removeAllItems(); 
        String seleccion = eleid;
        Eleccion eleccionSeleccionada = null;
        for (Eleccion eleccion : TRABAJOEDAGRUPAL.Elecciones) {
            if (seleccion.equals(String.valueOf(eleccion.getId()))) {
                eleccionSeleccionada = eleccion;
                break;
            }
        }
        
        if (eleccionSeleccionada != null) {
            for (Mesa mesa : eleccionSeleccionada.getListaMesas()) {
                comboMesas.addItem(String.valueOf(mesa.getNumero())); 
            }
        }   
        
        comboMesas.setSelectedIndex(-1); 
        comboMesas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboMesas.getSelectedIndex();
                if (selectedIndex == -1) { 
                    System.out.println("No has seleccionado ninguna opción.");
                    
                } else {
                    String seleccion = (String) comboMesas.getSelectedItem();
                    numeroMesa = Integer.parseInt(seleccion);
                    System.out.println("Seleccionaste: " + seleccion);                   
                }
            }
        });
        jPanel1.add(comboMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 210, 30));

        idEleccion.setText(eleid);
        eleccionid = eleid;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CrearMesa = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        idEleccion = new javax.swing.JLabel();
        CerrarMesa = new javax.swing.JButton();
        GenerarActa = new javax.swing.JButton();
        CancelarMesa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ModificarMesa = new javax.swing.JButton();
        Votos = new javax.swing.JButton();
        CrearMiembro = new javax.swing.JButton();
        BtnInfo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        clavePresidente = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(432, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 520));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("MENÚ MESAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        CrearMesa.setBackground(new java.awt.Color(2, 54, 114));
        CrearMesa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CrearMesa.setForeground(new java.awt.Color(255, 255, 255));
        CrearMesa.setText("Crear Mesa");
        CrearMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMesaMouseClicked(evt);
            }
        });
        CrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearMesaActionPerformed(evt);
            }
        });
        jPanel1.add(CrearMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 210, 30));

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
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 80, -1));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Elección");

        idEleccion.setText("ID:");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        CerrarMesa.setBackground(new java.awt.Color(2, 54, 114));
        CerrarMesa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CerrarMesa.setForeground(new java.awt.Color(255, 255, 255));
        CerrarMesa.setText("Cierre de Mesa");
        CerrarMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMesaMouseClicked(evt);
            }
        });
        CerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarMesaActionPerformed(evt);
            }
        });
        jPanel1.add(CerrarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 210, 30));

        GenerarActa.setBackground(new java.awt.Color(2, 54, 114));
        GenerarActa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        GenerarActa.setForeground(new java.awt.Color(255, 255, 255));
        GenerarActa.setText("Generar Acta");
        GenerarActa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerarActaMouseClicked(evt);
            }
        });
        GenerarActa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActaActionPerformed(evt);
            }
        });
        jPanel1.add(GenerarActa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 210, 30));

        CancelarMesa.setBackground(new java.awt.Color(2, 54, 114));
        CancelarMesa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CancelarMesa.setForeground(new java.awt.Color(255, 255, 255));
        CancelarMesa.setText("Cancelar Mesa");
        CancelarMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMesaMouseClicked(evt);
            }
        });
        CancelarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarMesaActionPerformed(evt);
            }
        });
        jPanel1.add(CancelarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 210, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Mesa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        ModificarMesa.setBackground(new java.awt.Color(2, 54, 114));
        ModificarMesa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ModificarMesa.setForeground(new java.awt.Color(255, 255, 255));
        ModificarMesa.setText("Modificar Mesa");
        ModificarMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMesaMouseClicked(evt);
            }
        });
        ModificarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarMesaActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 210, 30));

        Votos.setBackground(new java.awt.Color(2, 54, 114));
        Votos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Votos.setForeground(new java.awt.Color(255, 255, 255));
        Votos.setText("Votos");
        Votos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotosMouseClicked(evt);
            }
        });
        Votos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotosActionPerformed(evt);
            }
        });
        jPanel1.add(Votos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 210, 30));

        CrearMiembro.setBackground(new java.awt.Color(2, 54, 114));
        CrearMiembro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CrearMiembro.setForeground(new java.awt.Color(255, 255, 255));
        CrearMiembro.setText("Miembro Mesa");
        CrearMiembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMiembroMouseClicked(evt);
            }
        });
        CrearMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearMiembroActionPerformed(evt);
            }
        });
        jPanel1.add(CrearMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 210, 30));

        BtnInfo.setBackground(new java.awt.Color(2, 54, 114));
        BtnInfo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        BtnInfo.setText("Info");
        BtnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInfoMouseClicked(evt);
            }
        });
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 80, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Clave Presidente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        clavePresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavePresidenteActionPerformed(evt);
            }
        });
        jPanel1.add(clavePresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMesaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CrearMesaMouseClicked

    private void CrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearMesaActionPerformed
        // TODO add your handling code here:
        CrearMesa crearmesa = new CrearMesa(eleccionid);
        crearmesa.setVisible(true);
        this.setVisible(false);
        
    
    }//GEN-LAST:event_CrearMesaActionPerformed

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirMouseClicked

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

    private void CerrarMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMesaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMesaMouseClicked

    private void CerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarMesaActionPerformed
        // TODO add your handling code here:
        
        String clave = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numeroMesa).BuscarMiembro("Presidente").getClave();
        char[] claveIngresadaarray = this.clavePresidente.getPassword();
        String claveIngresada = new String(claveIngresadaarray);

        if (!claveIngresada.equalsIgnoreCase(clave) || claveIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Clave incorrecta o no hay clave de Presidente");
        } else {
            String estado = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).CerrarMesa(numeroMesa);
            JOptionPane.showMessageDialog(null, "Estado de mesa: " + estado);
        }
    }//GEN-LAST:event_CerrarMesaActionPerformed

    private void GenerarActaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarActaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarActaMouseClicked

    private void GenerarActaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActaActionPerformed
        // TODO add your handling code here:
        if (TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numeroMesa).getEstado().equalsIgnoreCase("Cerrada")) {
            RegistroActa registro = new RegistroActa(eleccionid, numeroMesa);
            registro.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Solo se puede generar acta de una mesa en estado Cerrada");
        }
    }//GEN-LAST:event_GenerarActaActionPerformed

    private void CancelarMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMesaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarMesaMouseClicked

    private void CancelarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarMesaActionPerformed
        // TODO add your handling code here:
        
        String clave = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numeroMesa).BuscarMiembro("Presidente").getClave();
        char[] claveIngresadaarray = this.clavePresidente.getPassword();
        String claveIngresada = new String(claveIngresadaarray);

        if (!claveIngresada.equalsIgnoreCase(clave) || claveIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Clave incorrecta o no hay clave de Presidente");
        } else {
            String estado = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).CancelarMesa(numeroMesa);
            JOptionPane.showMessageDialog(null, "Estado de mesa: " + estado);
        };
        
    }//GEN-LAST:event_CancelarMesaActionPerformed

    private void ModificarMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMesaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarMesaMouseClicked

    private void ModificarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMesaActionPerformed
        // TODO add your handling code here:
        ModificarMesa modificarmesa = new ModificarMesa(numeroMesa, eleccionid);
        modificarmesa.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ModificarMesaActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void VotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VotosMouseClicked

    private void VotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotosActionPerformed
        // TODO add your handling code here:
        Mesa mesa = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numeroMesa);
        if (mesa.BuscarMiembro("Presidente") != null || mesa.BuscarMiembro("Secretario") != null || mesa.BuscarMiembro("Vocal") !=null ) {
            Votos voto = new Votos(Integer.parseInt(eleccionid), numeroMesa);
            voto.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Aún no llegan los miembros de mesa", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_VotosActionPerformed

    private void CrearMiembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMiembroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearMiembroMouseClicked

    private void CrearMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearMiembroActionPerformed
        // TODO add your handling code here:
        MenuMiembro menu = new MenuMiembro(eleccionid, numeroMesa);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CrearMiembroActionPerformed

    private void BtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInfoMouseClicked

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        // TODO add your handling code here:
        MesaConteo conteo= new MesaConteo(Integer.parseInt(eleccionid),numeroMesa);
        conteo.setVisible(true);
        
        
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void clavePresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavePresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavePresidenteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton CancelarMesa;
    private javax.swing.JButton CerrarMesa;
    private javax.swing.JButton CrearMesa;
    private javax.swing.JButton CrearMiembro;
    private javax.swing.JButton GenerarActa;
    private javax.swing.JButton ModificarMesa;
    private javax.swing.JButton Votos;
    private javax.swing.JPasswordField clavePresidente;
    private javax.swing.JPanel header;
    private javax.swing.JLabel idEleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
