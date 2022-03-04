/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class Tabla_Pal_Reservadas extends javax.swing.JFrame {
    
    String[] palabrasReservadas = {
        "catch",
        "class",
        "def",
        "default",
        "downArm",
        "downLeg",
        "else",
        "exact",
        "exception",
        "flag",
        "for",
        "getAngle",
        "getPosition",
        "if",
        "ing",
        "interruption",
        "imp",
        "main",
        "motor",
        "move",
        "option",
        "part",
        "rotate",
        "setAngle",
        "setMotor",
        "setPosition",
        "speed",
        "stop",
        "try",
        "turnLeft",
        "turnRight",
        "switch",
        "upArm",
        "upLeg",
        "void",
        "while",
        "word"
    };
    
    String[] Op_aritmeticos = {"+","-","*","/","%"};
    String[] Op_relacionales = {"<",">","==",">=","<=","!=" };
    String[] Op_agrupacion = {"(",")","{","}","[","]" };
    String[] Op_incrementales = {"++","--" };
    String[] Op_logicos = {"&&","||","!"};

    /**
     * Creates new form Tabla_Pal_Reservadas
     */
    public Tabla_Pal_Reservadas() {
        initComponents();
         m = (DefaultTableModel) tabla_Pal_Reservadas.getModel();
         m.setRowCount(0);
            m.setColumnCount(0);
            
            m.addColumn("Palabras reservadas");
            for (int i=0;i < palabrasReservadas.length;i++) {
                m.addRow(new Object[]{palabrasReservadas[i]});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Pal_Reservadas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        bntNuevo = new javax.swing.JMenuItem();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        bntGuardarComo = new javax.swing.JMenuItem();
        bntGuardarComo1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(308, 374));

        tabla_Pal_Reservadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_Pal_Reservadas);

        jMenuBar1.setBackground(new java.awt.Color(50, 71, 102));
        jMenuBar1.setForeground(new java.awt.Color(250, 242, 246));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnArchivo.setBackground(new java.awt.Color(241, 250, 238));
        btnArchivo.setForeground(new java.awt.Color(241, 250, 238));
        btnArchivo.setText("Archivo");
        btnArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnArchivo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        bntNuevo.setText("Palabras Reservadas");
        bntNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/nuevo_press.png"))); // NOI18N
        bntNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/nuevo_press.png"))); // NOI18N
        bntNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNuevoActionPerformed(evt);
            }
        });
        btnArchivo.add(bntNuevo);

        btnAbrir.setText("Operadores Aritmeticos");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        btnArchivo.add(btnAbrir);

        btnGuardar.setText("Operadores Relacionales");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnArchivo.add(btnGuardar);

        bntGuardarComo.setText("Operadores de agrupacion");
        bntGuardarComo.setIconTextGap(5);
        bntGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarComoActionPerformed(evt);
            }
        });
        btnArchivo.add(bntGuardarComo);

        bntGuardarComo1.setText("Operadores Logicos");
        bntGuardarComo1.setIconTextGap(5);
        bntGuardarComo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarComo1ActionPerformed(evt);
            }
        });
        btnArchivo.add(bntGuardarComo1);

        jMenuBar1.add(btnArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNuevoActionPerformed
            m.setRowCount(0);
            m.setColumnCount(0);
            
            m.addColumn("Palabras reservadas");
            for (int i=0;i < palabrasReservadas.length;i++) {
                m.addRow(new Object[]{palabrasReservadas[i]});
            }
    }//GEN-LAST:event_bntNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
            m.setRowCount(0);
            m.setColumnCount(0);
            m.addColumn("Operadores aritmeticos");
            for (int i=0;i < Op_aritmeticos.length;i++) {
                m.addRow(new Object[]{Op_aritmeticos[i]});
            }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            m.setRowCount(0);
            m.setColumnCount(0);
            m.addColumn("Operadores relacionales");
            for (int i=0;i < Op_relacionales.length;i++) {
                m.addRow(new Object[]{Op_relacionales[i]});
            }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void bntGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarComoActionPerformed
        m.setRowCount(0);
        m.setColumnCount(0);
        m.addColumn("Operadores agrupacion");
        for (int i=0;i < Op_agrupacion.length;i++) {
            m.addRow(new Object[]{Op_agrupacion[i]});
        }
    }//GEN-LAST:event_bntGuardarComoActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void bntGuardarComo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarComo1ActionPerformed
        m.setRowCount(0);
        m.setColumnCount(0);
        m.addColumn("Operadores Logicos");
        for (int i=0;i < Op_logicos.length;i++) {
            m.addRow(new Object[]{Op_logicos[i]});
        }
    }//GEN-LAST:event_bntGuardarComo1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla_Pal_Reservadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_Pal_Reservadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_Pal_Reservadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_Pal_Reservadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_Pal_Reservadas().setVisible(true);
            }
        });
    }
    
    private DefaultTableModel m = new DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bntGuardarComo;
    private javax.swing.JMenuItem bntGuardarComo1;
    private javax.swing.JMenuItem bntNuevo;
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_Pal_Reservadas;
    // End of variables declaration//GEN-END:variables
}