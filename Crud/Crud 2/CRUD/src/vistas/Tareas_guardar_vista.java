/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelos.Tarea;
import servicios.Conexion;
import servicios.Tareas_servicio;

/**
 *
 * @author Fernando
 */
public class Tareas_guardar_vista extends javax.swing.JFrame {

    private final Tareas_servicio tareas_servicio = new Tareas_servicio();
    private final Tarea tarea;
    
    /**
     * Creates new form Guardar_tarea_vista
     */
    public Tareas_guardar_vista() {
        this.tarea = new Tarea();
        initComponents();
    }
    
    public Tareas_guardar_vista(Tarea p_tarea){
        this.tarea = p_tarea;
        initComponents();
        elemento_titulo.setText(this.tarea.getTitulo());
        elemento_descripcion.setText(this.tarea.getDescripcion());
        elemento_nivel_de_prioridad.setSelectedItem(this.tarea.getNivel_de_prioridad().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        elemento_titulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        elemento_descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        elemento_nivel_de_prioridad = new javax.swing.JComboBox();
        elemento_guardar = new javax.swing.JButton();
        elemento_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("TÃ­tulo:");

        jLabel2.setText("DescripciÃ³n:");

        elemento_descripcion.setColumns(20);
        elemento_descripcion.setRows(5);
        jScrollPane1.setViewportView(elemento_descripcion);

        jLabel3.setText("Nivel de prioridad:");

        elemento_nivel_de_prioridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3" }));
        elemento_nivel_de_prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento_nivel_de_prioridadActionPerformed(evt);
            }
        });

        elemento_guardar.setText("Guardar");
        elemento_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento_guardarActionPerformed(evt);
            }
        });

        elemento_cancelar.setText("Cancelar");
        elemento_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemento_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elemento_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)
                            .addComponent(elemento_nivel_de_prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(elemento_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(elemento_cancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(elemento_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(elemento_nivel_de_prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elemento_guardar)
                    .addComponent(elemento_cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void elemento_guardarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        if(this.validar()){
            this.guardar();
        }else{
            JOptionPane.showMessageDialog(this, "Hay campos incompletos.");
        }
    }                                                

    private void elemento_nivel_de_prioridadActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        // TODO add your handling code here:
    }                                                           

    private void elemento_cancelarActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        Tareas_guardar_vista.this.dispose();
        Tareas_listar_vista vista = new Tareas_listar_vista();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }                                                 

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        // TODO add your handling code here:
        try{
            Conexion.cerrar();
            System.out.println("ConexiÃ³n cerrada.");
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }                                  

    private boolean validar(){
        boolean validado = true;
        String titulo = elemento_titulo.getText();
        String descripcion = elemento_descripcion.getText();
        Integer nivel_de_prioridad;
        if(!titulo.trim().equals("") && !descripcion.trim().equals("")){
            try{
                nivel_de_prioridad = Integer.parseInt(elemento_nivel_de_prioridad.getSelectedItem().toString());
            }catch(Exception ex){
                validado = false;
            }
        }else{
            validado = false;
        }
        return validado;
    }
    
    private void guardar(){
        String titulo = elemento_titulo.getText();
        String descripcion = elemento_descripcion.getText();
        Integer nivel_de_prioridad = Integer.parseInt(elemento_nivel_de_prioridad.getSelectedItem().toString());
        this.tarea.setTitulo(titulo);
        this.tarea.setDescripcion(descripcion);
        this.tarea.setNivel_de_prioridad(nivel_de_prioridad);
        
        try{
            this.tareas_servicio.guardar(Conexion.obtener(), this.tarea);
            Tareas_guardar_vista.this.dispose();
            Tareas_listar_vista vista = new Tareas_listar_vista();
            vista.setVisible(true);
            vista.setLocationRelativeTo(null);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido guardar el registro.");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido guardar el registro.");
        }
    }
    
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
            java.util.logging.Logger.getLogger(Tareas_guardar_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tareas_guardar_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tareas_guardar_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tareas_guardar_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tareas_guardar_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton elemento_cancelar;
    private javax.swing.JTextArea elemento_descripcion;
    private javax.swing.JButton elemento_guardar;
    private javax.swing.JComboBox elemento_nivel_de_prioridad;
    private javax.swing.JTextField elemento_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}