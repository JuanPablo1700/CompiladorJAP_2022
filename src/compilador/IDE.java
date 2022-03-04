/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arlet
 */
public class IDE extends javax.swing.JFrame {

    NumeroLinea numeroLinea;
    Directorio dir;
    String errores = "";

    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
        inicializar();
        this.setLocationRelativeTo(null);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCod = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSimb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        bntNuevo = new javax.swing.JMenuItem();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnEjecutar = new javax.swing.JMenu();
        btnAnalizadorLexico = new javax.swing.JMenuItem();
        bntCompilar = new javax.swing.JMenuItem();
        btnTablas = new javax.swing.JMenu();
        bntTablaPalReserv = new javax.swing.JMenuItem();
        btnTablaIdentificadores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1305, 690));

        jPanel1.setBackground(new java.awt.Color(29, 53, 87));

        txtConsola.setEditable(false);
        txtConsola.setColumns(20);
        txtConsola.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConsola.setForeground(new java.awt.Color(255, 0, 0));
        txtConsola.setRows(5);
        jScrollPane2.setViewportView(txtConsola);

        txtAreaCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAreaCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaCodKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaCod);

        tblSimb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Línea", "Columna", "Lexema", "Componente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSimb);
        if (tblSimb.getColumnModel().getColumnCount() > 0) {
            tblSimb.getColumnModel().getColumn(0).setMinWidth(50);
            tblSimb.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblSimb.getColumnModel().getColumn(0).setMaxWidth(50);
            tblSimb.getColumnModel().getColumn(1).setMinWidth(50);
            tblSimb.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblSimb.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/protesis-3d (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        bntNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bntNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/nuevo.png"))); // NOI18N
        bntNuevo.setText("Nuevo archivo");
        bntNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/nuevo_press.png"))); // NOI18N
        bntNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/nuevo_press.png"))); // NOI18N
        bntNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNuevoActionPerformed(evt);
            }
        });
        btnArchivo.add(bntNuevo);

        btnAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/icono_abrir.png"))); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        btnArchivo.add(btnAbrir);

        btnGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/icono_guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnArchivo.add(btnGuardar);

        jMenuBar1.add(btnArchivo);

        btnEjecutar.setForeground(new java.awt.Color(241, 250, 238));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEjecutar.setMargin(new java.awt.Insets(2, 2, 2, 2));

        btnAnalizadorLexico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnAnalizadorLexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/lexico.png"))); // NOI18N
        btnAnalizadorLexico.setText("Analizador Lexico");
        btnAnalizadorLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizadorLexicoActionPerformed(evt);
            }
        });
        btnEjecutar.add(btnAnalizadorLexico);

        bntCompilar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_DOWN_MASK));
        bntCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/compilar.png"))); // NOI18N
        bntCompilar.setText("Compilar");
        bntCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCompilarActionPerformed(evt);
            }
        });
        btnEjecutar.add(bntCompilar);

        jMenuBar1.add(btnEjecutar);

        btnTablas.setForeground(new java.awt.Color(241, 250, 238));
        btnTablas.setText("Tablas");
        btnTablas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTablas.setMargin(new java.awt.Insets(2, 2, 2, 2));

        bntTablaPalReserv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bntTablaPalReserv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/reservadas.png"))); // NOI18N
        bntTablaPalReserv.setText("Tablas fijas");
        bntTablaPalReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTablaPalReservActionPerformed(evt);
            }
        });
        btnTablas.add(bntTablaPalReserv);

        btnTablaIdentificadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnTablaIdentificadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/img/identificador.png"))); // NOI18N
        btnTablaIdentificadores.setText("Tabla de Identificadores");
        btnTablaIdentificadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaIdentificadoresActionPerformed(evt);
            }
        });
        btnTablas.add(btnTablaIdentificadores);

        jMenuBar1.add(btnTablas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializar() {
        setTitle("JAP");

        dir = new Directorio();

        String[] options = new String[]{
            "Guardar y continuar",
            "Descartar"
        };

        //Para mostrar el número de linea
        numeroLinea = new NumeroLinea(txtAreaCod);
        jScrollPane1.setRowHeaderView(numeroLinea);
    }
    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        dir.Abrir(this);
        limpiarTerminal();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        dir.Guardar(this);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAnalizadorLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizadorLexicoActionPerformed
        analizadorLexico();
    }//GEN-LAST:event_btnAnalizadorLexicoActionPerformed

    public void analizadorLexico(){
        //limpiar tabla

        DefaultTableModel m = (DefaultTableModel) tblSimb.getModel();
        txtConsola.setText("");
        errores = "";
        int a = 0;
        id.clear();

        int cont = 0;
        if (m.getRowCount() > 0) {
            int p = m.getRowCount() - 1, t = m.getRowCount();
            for (int i = 0; i < t; i++) {
                m.removeRow(p);
                p--;
            }
        }

        File archivo = new File("archivo.jap");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtAreaCod.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader lector = new BufferedReader(new FileReader("archivo.jap"));
            Lexer lexer = new Lexer(lector);
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    txtConsola.setText(errores);
                    return;
                }
                switch (tokens) {
                    case Simbolo_Especial:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, tokens});
                        break;
                    case Identificador:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, tokens});

                        if (id.size() == 0) {
                            id.add(lexer.lexeme);
                        } else {
                            for (int i = 0; i < id.size(); i++) {
                                if (id.get(i).equals(lexer.lexeme)) {
                                    a = 1;
                                    break;
                                } else {
                                    a = 0;
                                }
                            }//fin for
                            if (a == 0) {
                                id.add(lexer.lexeme);
                            }
                        }
                        break;
                    case ERROR1:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, "Número invalido, no se puede tener más de un símbolo "});
                        errores += "Error léxico 1: Línea " + (lexer.yyline + 1) + " Columna " + (lexer.yycolumn + 1) + " Número invalido, no se puede tener más de un símbolo <" + lexer.lexeme + ">\n";
                        break;
                    case ERROR2:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, "Número invalido, se esperaba un dígito despues del punto. "});
                        errores += "Error léxico 2: Línea " + (lexer.yyline + 1) + " Columna " + (lexer.yycolumn + 1) + " Número invalido, se esperaba un dígito despues del punto <" + lexer.lexeme + ">\n";
                        break;
                    case ERROR3:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, "Número invalido, no es posible tener más de un punto en un número"});
                        errores += "Error léxico 3: Línea " + (lexer.yyline + 1) + " Columna " + (lexer.yycolumn + 1) + " Número invalido, no es posible tener más de un punto en un número <" + lexer.lexeme + ">\n";
                        break;
                    case ERROR4:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, "Número invalido, solo es posible tener una e"});
                        errores += "Error léxico 4: Línea " + (lexer.yyline + 1) + " Columna " + (lexer.yycolumn + 1) + " Número invalido, solo es posible tener una e <" + lexer.lexeme + ">\n";
                        break;
                    case ERROR5:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, "Identificador inválido, no se puede tener un número al inicio"});
                        errores += "Error léxico 5: Línea " + (lexer.yyline + 1) + " Columna " + (lexer.yycolumn + 1) + " Identificador inválido, no se puede tener un número al inicio <" + lexer.lexeme + ">\n";
                        break;
                    default:
                        m.addRow(new Object[]{lexer.yyline + 1, lexer.yycolumn + 1, lexer.lexeme, tokens});
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtConsola.setText(errores);
    }
    private void bntTablaPalReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTablaPalReservActionPerformed
        Tabla_Pal_Reservadas t = new Tabla_Pal_Reservadas();
        t.setVisible(true);
    }//GEN-LAST:event_bntTablaPalReservActionPerformed

    private void btnTablaIdentificadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaIdentificadoresActionPerformed
        Tabla_Identificadores t = new Tabla_Identificadores();
        t.setVisible(true);
    }//GEN-LAST:event_btnTablaIdentificadoresActionPerformed

    private void bntNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNuevoActionPerformed
        txtAreaCod.setText("");
        txtConsola.setText("");
        dir.Nuevo(this);
    }//GEN-LAST:event_bntNuevoActionPerformed

    private void txtAreaCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaCodKeyReleased
        //Cada que se presione una tecla aparece un asterisco que indica que se tiene que guardar
        int keyCode = evt.getKeyCode();
        if ((keyCode >= 65 && keyCode <= 90) || (keyCode >= 48 && keyCode <= 57)
                || (keyCode >= 97 && keyCode <= 122)
                || (keyCode != 27 && !(keyCode >= 37
                && keyCode <= 40) && !(keyCode >= 16
                && keyCode <= 18) && keyCode != 524
                && keyCode != 20)) {
            if (!getTitle().contains("*")) {
                setTitle(getTitle() + "*");
            }
        }
    }//GEN-LAST:event_txtAreaCodKeyReleased

    private void bntCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCompilarActionPerformed
        analizadorLexico();
        analizadorSint();
        todosErrores = errores + erroresSint;
        if (!todosErrores.equals("")){
            txtConsola.setText(todosErrores);
            txtConsola.setForeground(new Color(255,0,0));
        }else{
            txtConsola.setText("Analisis Sintatico realizado correctamente \n");
            txtConsola.setForeground(new Color(25, 111, 61));
        }
    }//GEN-LAST:event_bntCompilarActionPerformed

    public void analizadorSint(){
        
        String ST = txtAreaCod.getText();
        Sintax s = new Sintax(new LexerCup(new StringReader(ST)));
        
        s.rstError();
        try {
            s.parse();
            erroresSint = s.getError();
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    /**
     * Limpiar el area de consola
     */
    public void limpiarTerminal() {
        //txtAreaCod.setText("");
        txtConsola.setText("");

    }

    public static String[] ident;
    public static ArrayList<String> id = new ArrayList<>();
    public static String erroresSint = "";
    public static String todosErrores = "";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bntCompilar;
    private javax.swing.JMenuItem bntNuevo;
    private javax.swing.JMenuItem bntTablaPalReserv;
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenuItem btnAnalizadorLexico;
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnEjecutar;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnTablaIdentificadores;
    private javax.swing.JMenu btnTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblSimb;
    public javax.swing.JTextPane txtAreaCod;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables
}
