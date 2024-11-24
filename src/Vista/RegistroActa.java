/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Ejecucion.TRABAJOEDAGRUPAL;
import Modelo.ActaElectoral;
import Modelo.Candidato;
import Modelo.Mesa;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Eleccion;
import Modelo.Voto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author joaqu
 */
public class RegistroActa extends javax.swing.JFrame {

    /**
     * Creates new form RegistroActa
     */
    private DefaultTableModel modelo;
    
    private String eleccionid;
    private int numMesa;
    int totalvotos,votosnulos;
    
    public RegistroActa() {
        initComponents();
        modelo = new DefaultTableModel(); 
        modelo.addColumn("Candidato");
        modelo.addColumn("Partido");
        modelo.addColumn("Votos");
        this.TablaVotos.setModel(modelo);
    }
    
    
    public RegistroActa(String eleccionid, int numeroMesa) {
        initComponents();
        Mesa mesa = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numeroMesa);
        
        this.eleccionid = eleccionid;
        this.Ideleccion.setText(eleccionid);
        this.nummesatxt.setText(Integer.toString(numeroMesa));
        this.numeroactatxt.setText(Integer.toString(numeroMesa));
        this.ubicacionmesatxt.setText(mesa.getUbicacion());
        
        if(mesa.BuscarMiembro("Presidente")!=null){
            this.presidentetxt.setText(mesa.BuscarMiembro("Presidente").getNombre());
        }else{this.presidentetxt.setText("No registrado");}
        if(mesa.BuscarMiembro("Secretario")!=null){
            this.secretariotxt.setText(mesa.BuscarMiembro("Secretario").getNombre());
        }else{this.secretariotxt.setText("No registrado");}
        if(mesa.BuscarMiembro("Vocal")!=null){
           this.vocaltxt.setText(mesa.BuscarMiembro("Vocal").getNombre());
        }else{this.vocaltxt.setText("No registrado");}
        
        this.fechatxt.setText(LocalDate.now().toString());
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = now.format(formatter);
        this.horatxt.setText(formattedTime);
        this.votantesregistradostxt.setText(Integer.toString(mesa.getActa().getVotantesregistrados()));
        this.votosnulos = 0;
        this.totalvotos = 0;
        
        
        this.numMesa = numeroMesa;
        modelo = new DefaultTableModel(){@Override public boolean isCellEditable(int row, int column){return false;}};        
        modelo.addColumn("Tipo");
        modelo.addColumn("Partido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dni");
        this.TablaVotos.setModel(modelo);
        CargarTable();
        this.totalVotostxt.setText(Integer.toString(totalvotos));
        this.votosnulostxt.setText(Integer.toString(votosnulos));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numeroactatxt = new javax.swing.JTextField();
        nummesatxt = new javax.swing.JTextField();
        fechatxt = new javax.swing.JTextField();
        horatxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Ideleccion = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ubicacionmesatxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        presidentetxt = new javax.swing.JTextField();
        secretariotxt = new javax.swing.JTextField();
        vocaltxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalVotostxt = new javax.swing.JTextField();
        votosnulostxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        votantesregistradostxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVotos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Emitirbtn = new javax.swing.JButton();
        cancelabtn = new javax.swing.JButton();
        observacionestxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 54, 114));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Información del Acta");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de Acta:");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("N° Mesa Electoral:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora:");

        numeroactatxt.setEditable(false);
        numeroactatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        nummesatxt.setEditable(false);
        nummesatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        fechatxt.setEditable(false);
        fechatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        horatxt.setEditable(false);
        horatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        horatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horatxtActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Eleccion:");

        Ideleccion.setForeground(new java.awt.Color(255, 255, 255));
        Ideleccion.setText("ID");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ubicacion Mesa:");

        ubicacionmesatxt.setEditable(false);
        ubicacionmesatxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombres miembros:");

        presidentetxt.setEditable(false);

        secretariotxt.setEditable(false);

        vocaltxt.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Presidente");

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Secretario");

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Vocal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ideleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numeroactatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nummesatxt)
                            .addComponent(horatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubicacionmesatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(secretariotxt)
                            .addComponent(vocaltxt)
                            .addComponent(presidentetxt))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(92, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(Ideleccion)
                    .addComponent(jLabel15))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presidentetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secretariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vocaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(numeroactatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nummesatxt)
                                        .addComponent(jLabel12)
                                        .addComponent(ubicacionmesatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(horatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1020, 130));

        jPanel3.setBackground(new java.awt.Color(2, 54, 114));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro Votos");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setText("Total de votos emitidos:");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Votos nulos:");

        totalVotostxt.setEditable(false);
        totalVotostxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        votosnulostxt.setEditable(false);
        votosnulostxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel14.setText("Votantes registrados:");

        votantesregistradostxt.setEditable(false);
        votantesregistradostxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalVotostxt, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(votosnulostxt))
                .addGap(41, 41, 41)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(votantesregistradostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalVotostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(votantesregistradostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(votosnulostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TablaVotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaVotos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 400, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1020, 280));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("Observaciones:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        Emitirbtn.setBackground(new java.awt.Color(2, 54, 114));
        Emitirbtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Emitirbtn.setForeground(new java.awt.Color(255, 255, 255));
        Emitirbtn.setText("Emitir");
        Emitirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmitirbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Emitirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        cancelabtn.setBackground(new java.awt.Color(2, 54, 114));
        cancelabtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancelabtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelabtn.setText("Cancelar");
        cancelabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelabtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, -1, -1));

        observacionestxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        observacionestxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        observacionestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionestxtActionPerformed(evt);
            }
        });
        jPanel1.add(observacionestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 540, 110));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel11.setText("Registro Acta");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void observacionestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionestxtActionPerformed

    private void EmitirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmitirbtnActionPerformed
        // TODO add your handling code here:
        TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numMesa).getActa().setIdeleccion(Integer.parseInt(eleccionid));
        ActaElectoral acta1 = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numMesa).getActa();
        acta1.setCantvotosnulos(votosnulos);
        acta1.setFecha(fechatxt.getText());
        acta1.setHoraacta(horatxt.getText());
        acta1.setId(numMesa);
        acta1.setIdmesa(numMesa);
        acta1.setObservaciones(observacionestxt.getText());
        acta1.setVotantesnovoto(1200-totalvotos-votosnulos);
        acta1.setVotantessivoto(totalvotos+votosnulos);
        LinkedList<Candidato> candidatos =TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).getListaCandidatos();
        int tamaño=candidatos.size();
        String[][] votos = new String[tamaño][2];
        int i=0;
        Mesa mesa = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid)).BuscarMesa(numMesa);

        for (Candidato candidato : candidatos) {
            int cantvotos = 0; 
            for (Voto voto : mesa.getVotos()) {

                if ("valido".equals(voto.getTipo()) && voto.getDniCandidato().equals(candidato.getDni())) {
                    cantvotos++;
                }
            }
            votos[i][0] = candidato.getDni();
            votos[i][1] = Integer.toString(cantvotos);
            System.out.println("Candidato: " + candidato.getDni() + " - Votos válidos: " + cantvotos);
            i++;
        }

        acta1.setVotoscandidatos(votos);
        this.setVisible(false);
    }//GEN-LAST:event_EmitirbtnActionPerformed

    private void cancelabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelabtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelabtnActionPerformed

    private void horatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horatxtActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroActa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroActa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroActa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroActa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroActa().setVisible(true);
            }
        });
    }

    public void CargarTable() {
    int filas = this.TablaVotos.getRowCount();
    for (int i = 0; i < filas; i++) {
        modelo.removeRow(0);
    }

    Eleccion eleccion = TRABAJOEDAGRUPAL.buscarEleccionPorId(Integer.parseInt(eleccionid));

    for (Mesa mesa : eleccion.getListaMesas()) {
        if (mesa.getNumero() == this.numMesa) {
            for (Voto voto : mesa.getVotos()) {
                String[] datos = new String[5]; 
                if ("valido".equals(voto.getTipo())) {
                    datos[0] = voto.getTipo();
                    datos[1] = eleccion.BuscarCandidato(voto.getDniCandidato()).getPartido();
                    datos[2] = eleccion.BuscarCandidato(voto.getDniCandidato()).getNombre();
                    datos[3] = eleccion.BuscarCandidato(voto.getDniCandidato()).getApellidos();
                    datos[4] = voto.getDniCandidato();
                    this.totalvotos++;
                } else {
                    datos[0] = voto.getTipo();
                    datos[1] = " ";
                    datos[2] = " ";
                    datos[3] = " ";
                    datos[4] = " ";
                    this.votosnulos++;
                }
                modelo.addRow(datos);
            }
        }
    }
}
        
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Emitirbtn;
    private javax.swing.JLabel Ideleccion;
    private javax.swing.JTable TablaVotos;
    private javax.swing.JButton cancelabtn;
    private javax.swing.JTextField fechatxt;
    private javax.swing.JTextField horatxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numeroactatxt;
    private javax.swing.JTextField nummesatxt;
    private javax.swing.JTextField observacionestxt;
    private javax.swing.JTextField presidentetxt;
    private javax.swing.JTextField secretariotxt;
    private javax.swing.JTextField totalVotostxt;
    private javax.swing.JTextField ubicacionmesatxt;
    private javax.swing.JTextField vocaltxt;
    private javax.swing.JTextField votantesregistradostxt;
    private javax.swing.JTextField votosnulostxt;
    // End of variables declaration//GEN-END:variables
}
