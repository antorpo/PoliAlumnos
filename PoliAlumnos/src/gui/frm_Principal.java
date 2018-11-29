package gui;

import clases.Listar;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

public class frm_Principal extends javax.swing.JFrame {
// Declaracion de formularios:  
frm_Agregar agregar = new frm_Agregar();
frm_Modificar modificar = new frm_Modificar();
frm_Db db = new frm_Db();
frm_Estudiantes estudiantes = new frm_Estudiantes();

public static Listar lista = new Listar();


public frm_Principal() {
initComponents();
this.setResizable(false);
this.setLocationRelativeTo(null);
this.setTitle("POLI ALUMNOS 1.0");
desktop.setBackground(new Color(38, 38, 38));
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Admin = new javax.swing.JMenu();
        item_Agregar = new javax.swing.JMenuItem();
        item_Modificar = new javax.swing.JMenuItem();
        item_Estudiantes = new javax.swing.JMenuItem();
        menu_Db = new javax.swing.JMenu();
        item_Config = new javax.swing.JMenuItem();
        menu_Acerca = new javax.swing.JMenu();
        item_Info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        menu_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config1.png"))); // NOI18N
        menu_Admin.setText("ADMINISTRAR");

        item_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add1.png"))); // NOI18N
        item_Agregar.setText("AGREGAR");
        item_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_AgregarActionPerformed(evt);
            }
        });
        menu_Admin.add(item_Agregar);

        item_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod1.png"))); // NOI18N
        item_Modificar.setText("MODIFICAR");
        item_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ModificarActionPerformed(evt);
            }
        });
        menu_Admin.add(item_Modificar);

        item_Estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1.png"))); // NOI18N
        item_Estudiantes.setText("ESTUDIANTES");
        item_Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_EstudiantesActionPerformed(evt);
            }
        });
        menu_Admin.add(item_Estudiantes);

        jMenuBar1.add(menu_Admin);

        menu_Db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/db1.png"))); // NOI18N
        menu_Db.setText("BASE DE DATOS");
        menu_Db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_DbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_DbMousePressed(evt);
            }
        });
        menu_Db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DbActionPerformed(evt);
            }
        });

        item_Config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tool1.png"))); // NOI18N
        item_Config.setText("CONFIGURAR");
        item_Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ConfigActionPerformed(evt);
            }
        });
        menu_Db.add(item_Config);

        jMenuBar1.add(menu_Db);

        menu_Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about1.png"))); // NOI18N
        menu_Acerca.setText("ACERCA");
        menu_Acerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_AcercaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_AcercaMouseReleased(evt);
            }
        });
        menu_Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_AcercaActionPerformed(evt);
            }
        });

        item_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/face1.png"))); // NOI18N
        item_Info.setText("INFO");
        item_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_InfoActionPerformed(evt);
            }
        });
        menu_Acerca.add(item_Info);

        jMenuBar1.add(menu_Acerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_AgregarActionPerformed
    if(agregar.isVisible()){
    JOptionPane.showMessageDialog(null, "El formulario ya se encuentra visible!", "Alerta:", JOptionPane.WARNING_MESSAGE);
    }else{
    desktop.add(agregar);
    agregar.setVisible(true);    
    }
    }//GEN-LAST:event_item_AgregarActionPerformed

    private void item_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_ModificarActionPerformed
    if(modificar.isVisible()){
    JOptionPane.showMessageDialog(null, "El formulario ya se encuentra visible!", "Alerta:", JOptionPane.WARNING_MESSAGE);
    }else{
    desktop.add(modificar);
    modificar.setVisible(true);
    }
    }//GEN-LAST:event_item_ModificarActionPerformed

    private void menu_DbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DbActionPerformed

    }//GEN-LAST:event_menu_DbActionPerformed

    private void menu_DbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_DbMouseClicked

    }//GEN-LAST:event_menu_DbMouseClicked

    private void menu_AcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_AcercaMouseClicked

    }//GEN-LAST:event_menu_AcercaMouseClicked

    private void menu_DbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_DbMousePressed

    }//GEN-LAST:event_menu_DbMousePressed

    private void menu_AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_AcercaActionPerformed

    }//GEN-LAST:event_menu_AcercaActionPerformed

    private void menu_AcercaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_AcercaMouseReleased

    }//GEN-LAST:event_menu_AcercaMouseReleased

    private void item_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_InfoActionPerformed
    JOptionPane.showMessageDialog(null, "Autor: Antonio Gonzalez Restrepo"
    + "\nFecha: 27/11/2018", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_item_InfoActionPerformed

    private void item_ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_ConfigActionPerformed
    if(db.isVisible()){
    JOptionPane.showMessageDialog(null, "El formulario ya se encuentra visible!", "Alerta:", JOptionPane.WARNING_MESSAGE);
    }else{
    desktop.add(db);
    db.setVisible(true);
    }
    }//GEN-LAST:event_item_ConfigActionPerformed

    private void item_EstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_EstudiantesActionPerformed
    if(estudiantes.isVisible()){
    JOptionPane.showMessageDialog(null, "El formulario ya se encuentra visible!", "Alerta:", JOptionPane.WARNING_MESSAGE);
    }else{
    desktop.add(estudiantes);
    estudiantes.setVisible(true);
    }
    }//GEN-LAST:event_item_EstudiantesActionPerformed

//    public static void main(String args[]) {
//    try {
//    JFrame.setDefaultLookAndFeelDecorated(true);
//    //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteSkin");
//    SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
//    } catch (Exception e) {
//    JOptionPane.showMessageDialog(null, "La skin no se ha cargado!", "Error:", JOptionPane.ERROR_MESSAGE);
//    }
//
//    java.awt.EventQueue.invokeLater(new Runnable() {
//    public void run() {
//    new frm_Principal().setVisible(true);
//    }
//    });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem item_Agregar;
    private javax.swing.JMenuItem item_Config;
    private javax.swing.JMenuItem item_Estudiantes;
    private javax.swing.JMenuItem item_Info;
    private javax.swing.JMenuItem item_Modificar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_Acerca;
    private javax.swing.JMenu menu_Admin;
    private javax.swing.JMenu menu_Db;
    // End of variables declaration//GEN-END:variables
}
