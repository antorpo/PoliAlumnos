package gui;
import clases.Alumno;
import javax.swing.JOptionPane;


public class frm_Agregar extends javax.swing.JInternalFrame {

public frm_Agregar() {
initComponents();
Programas();
}

public void limpiarCampos(){
txt_Nombre.setText("");
txt_Edad.setText("");
txt_Documento.setText("");
}

public boolean validarInfo(){
String programa = cb_Programas.getSelectedItem().toString();
if(txt_Nombre.getText().equals("") || txt_Documento.getText().equals("") || txt_Edad.getText().equals("") || programa.equals("")){
JOptionPane.showMessageDialog(null, "Rellene todos los campos!", "Advertencia:", JOptionPane.WARNING_MESSAGE);
return false;
}else{
return true;    
}
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

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Info = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Documento = new javax.swing.JTextField();
        cb_Programas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();

        setClosable(true);

        panel_Info.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");

        txt_Edad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EdadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Documento:");

        txt_Documento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DocumentoKeyTyped(evt);
            }
        });

        cb_Programas.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cb_Programas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Programa:");

        javax.swing.GroupLayout panel_InfoLayout = new javax.swing.GroupLayout(panel_Info);
        panel_Info.setLayout(panel_InfoLayout);
        panel_InfoLayout.setHorizontalGroup(
            panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Programas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_InfoLayout.createSequentialGroup()
                        .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_InfoLayout.createSequentialGroup()
                                    .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_Documento))))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_InfoLayout.setVerticalGroup(
            panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_InfoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_InfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_Programas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add2.png"))); // NOI18N
        jLabel1.setText("AGREGAR ESTUDIANTE:");

        btn_Guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/suma1.png"))); // NOI18N
        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

    if(validarInfo()){
    String programa = cb_Programas.getSelectedItem().toString();
    String nombre = txt_Nombre.getText();
    int edad = Integer.parseInt(txt_Edad.getText());
    int documento = Integer.parseInt(txt_Documento.getText());
    
    Alumno alumno = new Alumno(nombre, edad, documento, programa);
    frm_Principal.lista.agregarPersona(alumno);
    limpiarCampos(); 
    }else{
    JOptionPane.showMessageDialog(null, "Faltan datos por rellenar!", "Alerta:", JOptionPane.WARNING_MESSAGE);
    }
    
    }//GEN-LAST:event_btn_GuardarActionPerformed

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

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JComboBox<String> cb_Programas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panel_Info;
    private javax.swing.JTextField txt_Documento;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
