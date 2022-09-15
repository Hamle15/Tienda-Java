/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hamle
 */
public class Form_Clientes extends javax.swing.JPanel {
    //crea una tabla y pone los datos de un txt  a la tabla
    DefaultTableModel modelo;
    private static Scanner sc;
    
    public Form_Clientes() {
        initComponents();
        tablaProm.fixTable(jScrollPane2);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre Usuario");
        modelo.addColumn("Apellido");
        modelo.addColumn("Correo");
        modelo.addColumn("Password");
        modelo.addColumn("Sexo");
        this.tablaProm.setModel(modelo);
        
        String filePath = "src/Archivos/Registro2.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)tablaProm.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Form_TablaPro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCol = new com.raven.swing.TextFild();
        imageAvatar1 = new com.raven.swing.ImageAvatar();
        agregar = new Botones.MiBoton();
        elimar = new Botones.MiBoton();
        password = new com.raven.swing.TextFild();
        btModificar = new Botones.MiBoton();
        btElimarT = new Botones.MiBoton();
        panelBorder3 = new com.raven.swing.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProm = new com.raven.swing.Table();
        jLabel1 = new javax.swing.JLabel();
        apellido = new com.raven.swing.TextFild();
        nombreUsuario = new com.raven.swing.TextFild();
        btGuardar = new Botones.MiBoton();
        txtNuev = new com.raven.swing.TextFild();
        correo = new com.raven.swing.TextFild();
        sexo1 = new com.raven.swing.TextFild();
        txtFil = new com.raven.swing.TextFild();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 127, 127));
        jLabel2.setText("Modificar");

        txtCol.setLabelText("Columna");
        txtCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColActionPerformed(evt);
            }
        });

        imageAvatar1.setGradientColor1(new java.awt.Color(33, 147, 176));
        imageAvatar1.setGradientColor2(new java.awt.Color(109, 213, 237));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/raven/image/arreglar.jpg"))); // NOI18N

        agregar.setBackground(new java.awt.Color(0, 204, 255));
        agregar.setText("Agregar");
        agregar.setBorderColor(new java.awt.Color(255, 255, 255));
        agregar.setColorClick(new java.awt.Color(51, 102, 255));
        agregar.setColorover(new java.awt.Color(204, 204, 204));
        agregar.setRadius(30);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        elimar.setBackground(new java.awt.Color(0, 204, 255));
        elimar.setText("Eliminar");
        elimar.setBorderColor(new java.awt.Color(255, 255, 255));
        elimar.setColorClick(new java.awt.Color(51, 102, 255));
        elimar.setColorover(new java.awt.Color(204, 204, 204));
        elimar.setRadius(30);
        elimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimarActionPerformed(evt);
            }
        });

        password.setLabelText("Password");

        btModificar.setBackground(new java.awt.Color(0, 204, 255));
        btModificar.setText("Modificar");
        btModificar.setBorderColor(new java.awt.Color(255, 255, 255));
        btModificar.setColorClick(new java.awt.Color(51, 102, 255));
        btModificar.setColorover(new java.awt.Color(204, 204, 204));
        btModificar.setRadius(30);
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btElimarT.setBackground(new java.awt.Color(0, 204, 255));
        btElimarT.setText("Elimiar Todo");
        btElimarT.setBorderColor(new java.awt.Color(255, 255, 255));
        btElimarT.setColorClick(new java.awt.Color(51, 102, 255));
        btElimarT.setColorover(new java.awt.Color(204, 204, 204));
        btElimarT.setRadius(30);
        btElimarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btElimarTActionPerformed(evt);
            }
        });

        panelBorder3.setBackground(new java.awt.Color(204, 204, 204));

        tablaProm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaProm);

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Clientes");

        apellido.setLabelText("Apellido");
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        nombreUsuario.setLabelText("Nombre Usuario");
        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        btGuardar.setBackground(new java.awt.Color(0, 204, 255));
        btGuardar.setText("Guardar");
        btGuardar.setBorderColor(new java.awt.Color(255, 255, 255));
        btGuardar.setColorClick(new java.awt.Color(51, 102, 255));
        btGuardar.setColorover(new java.awt.Color(204, 204, 204));
        btGuardar.setRadius(30);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        txtNuev.setLabelText("Nuevo Dato");
        txtNuev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevActionPerformed(evt);
            }
        });

        correo.setLabelText("Correo");
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        sexo1.setLabelText("Sexo");

        txtFil.setLabelText("Fila");
        txtFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sexo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elimar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btElimarT, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNuev, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elimar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNuev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btElimarT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColActionPerformed
    //Agrega lo que este en los textfild a la tabla
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String []info = new String[5];
        info[0] = nombreUsuario.getText(); 
        info[1] = apellido.getText();
        info[2] =correo.getText(); 
        info[3] = password.getText();
        info[4] = sexo1.getText();
        modelo.addRow(info);

        
        nombreUsuario.setText("");
        apellido.setText("");
        correo.setText("");
        password.setText("");
        sexo1.setText("");
    }//GEN-LAST:event_agregarActionPerformed
    //al seleccionar una fila la elimina
    private void elimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimarActionPerformed
        int fila= tablaProm.getSelectedRow();
        if (fila >= 0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_elimarActionPerformed

    private void txtFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilActionPerformed
    //al escojer fila, columna y poner el nuevo dato modfica el escojido
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        int fila= Integer.parseInt(txtFil.getText());
        int columna = Integer.parseInt(txtCol.getText());
        modelo.setValueAt(txtNuev.getText(), fila, columna);
    }//GEN-LAST:event_btModificarActionPerformed
    //elimina todo lo de la tabla
    private void btElimarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btElimarTActionPerformed
        int fila= tablaProm.getRowCount();
        for(int i = fila-1; i >=0; i--){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_btElimarTActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //guardaTabla();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void txtNuevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botones.MiBoton agregar;
    private com.raven.swing.TextFild apellido;
    private Botones.MiBoton btElimarT;
    private Botones.MiBoton btGuardar;
    private Botones.MiBoton btModificar;
    private com.raven.swing.TextFild correo;
    private Botones.MiBoton elimar;
    private com.raven.swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.raven.swing.TextFild nombreUsuario;
    private com.raven.swing.PanelBorder panelBorder3;
    private com.raven.swing.TextFild password;
    private com.raven.swing.TextFild sexo1;
    private com.raven.swing.Table tablaProm;
    private com.raven.swing.TextFild txtCol;
    private com.raven.swing.TextFild txtFil;
    private com.raven.swing.TextFild txtNuev;
    // End of variables declaration//GEN-END:variables
}
