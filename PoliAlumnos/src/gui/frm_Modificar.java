package gui;

import clases.Alumno;
import clases.Listar;
import javax.swing.JOptionPane;

public class frm_Modificar extends javax.swing.JInternalFrame {

private Listar lista;

public frm_Modificar() {
initComponents();
this.setSize(305, 150);
Programas();
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_Info = new javax.swing.JPanel();
        txt_Documento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Nuevodoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_Programas = new javax.swing.JComboBox<>();
        lbl_Programa = new javax.swing.JLabel();
        btn_Actualizar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod2.png"))); // NOI18N
        jLabel1.setText("MODIFICAR ESTUDIANTE:");

        panel_Info.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Documento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DocumentoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Documento:");

        btn_Buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search1.png"))); // NOI18N
        btn_Buscar.setText("BUSCAR");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_InfoLayout = new javax.swing.GroupLayout(panel_Info);
        panel_Info.setLayout(panel_InfoLayout);
        panel_InfoLayout.setHorizontalGroup(
            panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_InfoLayout.createSequentialGroup()
                        .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_InfoLayout.setVerticalGroup(
            panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txt_Documento))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Nombre:");

        txt_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        txt_Edad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EdadKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Edad:");

        txt_Nuevodoc.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Nuevodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NuevodocActionPerformed(evt);
            }
        });
        txt_Nuevodoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NuevodocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NuevodocKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Documento:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Programa:");

        cb_Programas.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cb_Programas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_Programa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbl_Programa.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Programas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Nombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 123, Short.MAX_VALUE))
                            .addComponent(txt_Nuevodoc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nuevodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_Programas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btn_Actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update1.png"))); // NOI18N
        btn_Actualizar.setText("ACTUALIZAR");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Actualizar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed

    if(txt_Documento.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Ingrese un documento!", "Error:", JOptionPane.ERROR_MESSAGE);
    }else{
    int documento = Integer.parseInt(txt_Documento.getText());
    Alumno alumno = frm_Principal.lista.buscarPersona(documento);  
    
    // En caso de no encontrar:
    if(alumno==null){
    JOptionPane.showMessageDialog(null, "Estudiante no encontrado!", "Error:", JOptionPane.ERROR_MESSAGE); 
    }else{
    txt_Documento.setEnabled(false);
    txt_Nombre.setText(alumno.obtenerNombre());
    txt_Edad.setText(String.valueOf(alumno.obtenerEdad()));
    lbl_Programa.setText(alumno.obtenerPrograma());
    this.setSize(302, 414);
    }
    
    }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void txt_NuevodocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NuevodocKeyReleased

    }//GEN-LAST:event_txt_NuevodocKeyReleased

    private void txt_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DocumentoKeyTyped
    int validar = (int)evt.getKeyChar(); // De char pasamos a int para tenenerlo en ASCII.
    
    if(validar>=48 && validar<=57 || validar==8){
       
    }else{
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo numeros!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    txt_Documento.setText("");
    } 
    }//GEN-LAST:event_txt_DocumentoKeyTyped

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
    
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EdadKeyTyped
    int validar = (int)evt.getKeyChar(); // De char pasamos a int para tenenerlo en ASCII.
    
    if(validar>=48 && validar<=57 || validar==8){
       
    }else{
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo numeros!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    txt_Edad.setText("");
    } 
    }//GEN-LAST:event_txt_EdadKeyTyped

    private void txt_NuevodocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NuevodocKeyTyped
    int validar = (int)evt.getKeyChar(); // De char pasamos a int para tenenerlo en ASCII.
    
    if(validar>=48 && validar<=57 || validar==8){
       
    }else{
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo numeros!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    txt_Nuevodoc.setText("");
    } 
    }//GEN-LAST:event_txt_NuevodocKeyTyped

    private void txt_NuevodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NuevodocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NuevodocActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
    int documento = Integer.parseInt(txt_Documento.getText()), edad = Integer.parseInt(txt_Edad.getText());
    int nuevo_doc = Integer.parseInt(txt_Nuevodoc.getText());
    String nombre = txt_Nombre.getText(), programa = cb_Programas.getSelectedItem().toString();
    
    if(txt_Nuevodoc.getText().equals("")){
    nuevo_doc = Integer.parseInt(txt_Documento.getText());
    }
    
    frm_Principal.lista.modificarPersona(documento, nombre, edad, nuevo_doc, programa);
    this.setSize(305, 150);
    limpiarCampos();
    this.dispose();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    
public void limpiarCampos(){
txt_Documento.setEnabled(true);
txt_Documento.setText("");
txt_Nombre.setText("");
txt_Edad.setText("");
txt_Nuevodoc.setText("");
lbl_Programa.setText("");
}    
    
    
public final void Programas(){
cb_Programas.removeAllItems();
cb_Programas.addItem("Contaduria Publica");
cb_Programas.addItem("Ingenieria Productividad");
cb_Programas.addItem("Administracion Empresas");
cb_Programas.addItem("Ingenieria Agropecuaria");
cb_Programas.addItem("Comunicacion Audiovisual");
cb_Programas.addItem("Profesional Deporte");
cb_Programas.addItem("Ingenieria Civil");
cb_Programas.addItem("Ingenieria Higiene");
cb_Programas.addItem("Ingenieria Control");
cb_Programas.addItem("Ingenieria Informatica");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JComboBox<String> cb_Programas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Programa;
    private javax.swing.JPanel panel_Info;
    private javax.swing.JTextField txt_Documento;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Nuevodoc;
    // End of variables declaration//GEN-END:variables
}
