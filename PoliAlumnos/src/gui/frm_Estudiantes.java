package gui;
import clases.Alumno;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;

public class frm_Estudiantes extends javax.swing.JInternalFrame {
DefaultTableModel tabla = new DefaultTableModel(){
 
@Override
public boolean isCellEditable(int rowIndex,int columnIndex){
return false;
}};
String titulos[] = {"Nombre","Edad", "Programa", "Documento"};


public frm_Estudiantes() {
initComponents();
tabla.setColumnIdentifiers(titulos);
tbl_Estudiantes.setModel(tabla);
}

public final void actualizarLista(){
    
if(tabla.getRowCount()==0){
ArrayList<Alumno> lista_nueva = frm_Principal.lista.mostrarLista();

for(Alumno alumno: lista_nueva){
Object usuario[] = {alumno.obtenerNombre(), alumno.obtenerEdad(), alumno.obtenerPrograma(),alumno.obtenerDocumento()};
tabla.addRow(usuario);
}    
}else{
while(tabla.getRowCount()!=0){
tbl_Estudiantes.selectAll();
tabla.removeRow(tbl_Estudiantes.getSelectedRow());
} 
actualizarLista();
}
   
}



@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Estudiantes = new javax.swing.JTable();
        btn_Actualizar = new javax.swing.JButton();
        btn_DB = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Pdf = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N
        jLabel1.setText("LISTADO DE ESTUDIANTES:");

        tbl_Estudiantes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbl_Estudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_Estudiantes);

        btn_Actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh1.png"))); // NOI18N
        btn_Actualizar.setText("REFRESH");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_DB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_DB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upload2.png"))); // NOI18N
        btn_DB.setText("DB");
        btn_DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DBActionPerformed(evt);
            }
        });

        btn_Borrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/del1.png"))); // NOI18N
        btn_Borrar.setText("DEL");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        btn_Pdf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf1.png"))); // NOI18N
        btn_Pdf.setText("PDF");
        btn_Pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_DB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pdf)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_DB)
                    .addComponent(btn_Borrar)
                    .addComponent(btn_Pdf))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
    actualizarLista();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DBActionPerformed
    if(tabla.getRowCount()==0){
    JOptionPane.showMessageDialog(null, "La lista esta vacia!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);   
    }else{
        
    if(frm_Db.base_datos == null){
    JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos!", "Error:", JOptionPane.ERROR_MESSAGE);    
    }else{
     
    if(frm_Db.base_datos.validarConexion()){
        
    try{
    String nombre, edad, documento, programa;    
    
    while(tabla.getRowCount()!=0){
    tbl_Estudiantes.selectAll();
    
    nombre = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 0));
    edad = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 1));
    programa = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 2));
    documento = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 3));
    
    PreparedStatement pst = frm_Db.base_datos.cn.prepareStatement("insert into " + frm_Db.base_datos.tabla + " values(?,?,?,?,?)");
    
    pst.setString(1, "0");
    pst.setString(2, nombre.trim());
    pst.setString(3, edad.trim()); 
    pst.setString(4, documento.trim());
    pst.setString(5, programa.trim());
    
    pst.executeUpdate();
    tabla.removeRow(tbl_Estudiantes.getSelectedRow());
    }
            
    JOptionPane.showMessageDialog(null, "Proceso finalizado correctamente!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    actualizarLista();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "No se ha podido subir los datos a la DB!", "Error:", JOptionPane.ERROR_MESSAGE);     
    }      
        
    }else{
    JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos!", "Error:", JOptionPane.ERROR_MESSAGE);       
    }      
     
    }         
    }
    }//GEN-LAST:event_btn_DBActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
    if(tabla.getRowCount()==0){
    JOptionPane.showMessageDialog(null, "La lista esta vacia!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    }else{
            
    try{
    int documento = (int)tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 3);
    frm_Principal.lista.eliminarPersona(documento);
    
    tabla.removeRow(tbl_Estudiantes.getSelectedRow()); 
    
    
    }catch(ArrayIndexOutOfBoundsException e){
    JOptionPane.showMessageDialog(null, "Seleccione un elemento de la lista!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    }
                 
    }
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void btn_PdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PdfActionPerformed
    if(tabla.getRowCount()==0){
    JOptionPane.showMessageDialog(null, "La lista esta vacia!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    }else{
    
    Document document = new Document();
        
    try{
    String ruta = "reporte.pdf";
    PdfWriter.getInstance(document, new FileOutputStream(ruta));
    document.open();
    
    PdfPTable pdf = new PdfPTable(4);
    pdf.addCell("Nombre");
    pdf.addCell("Edad");
    pdf.addCell("Programa");
    pdf.addCell("Documento");

    String nombre, edad, programa, documento;
    
    while(tabla.getRowCount()!=0){
    tbl_Estudiantes.selectAll();
    
    nombre = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 0));
    edad = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 1));
    programa = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 2));
    documento = String.valueOf(tabla.getValueAt(tbl_Estudiantes.getSelectedRow(), 3));
    
    pdf.addCell(nombre);
    pdf.addCell(edad);
    pdf.addCell(programa);
    pdf.addCell(documento);
    
    tabla.removeRow(tbl_Estudiantes.getSelectedRow());
    }
    
    document.add(pdf);
    JOptionPane.showMessageDialog(null, "Reporte creado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    actualizarLista();
        
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "Error creando el reporte!", "Error:", JOptionPane.ERROR_MESSAGE);
    }
    
    finally{
    document.close();
    }        
         
    }
    }//GEN-LAST:event_btn_PdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Borrar;
    public javax.swing.JButton btn_DB;
    private javax.swing.JButton btn_Pdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Estudiantes;
    // End of variables declaration//GEN-END:variables
}
