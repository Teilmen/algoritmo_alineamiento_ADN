
package Modelo;

import Control.Algoritmo;
import Control.GestionarArchivo;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    
    ArrayList<Integer> ar1 = new ArrayList();
    ArrayList<Integer> ar2 = new ArrayList();
    ArrayList<Integer> ali1 = new ArrayList();
    ArrayList<Integer> ali2 = new ArrayList();
    ArrayList<String>  con_uno = new ArrayList();
    ArrayList<String>  con_dos = new ArrayList();
    
    
    int [][]mp; // Matriz Principal
    int [][]mt; // Matriz Score
    
    Algoritmo matrizPrin = new Algoritmo();
    GestionarArchivo arch = new GestionarArchivo();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsecuenciaUno = new javax.swing.JTextField();
        txtsecuenciaDos = new javax.swing.JTextField();
        txtConvertidaUno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtConvertidaDos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtfilasTabla = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcolumnasTabla = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaValores = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultante = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BotonResultado = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonAbrir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaAlineada = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALGORITMO NEEDLEMAN WUNSCH");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/ADN.png"))); // NOI18N
        jLabel1.setText("ALGORITMO NEEDLEMAN WUNSCH ");

        jLabel2.setText("Secuencia uno : ");

        jLabel3.setText("Secuencia dos :");

        txtsecuenciaUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsecuenciaUnoKeyTyped(evt);
            }
        });

        txtsecuenciaDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsecuenciaDosKeyTyped(evt);
            }
        });

        jLabel4.setText("Secuencia uno convertida : ");

        jLabel5.setText("Secuencia dos convertida :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("CONVERSIÓN DE SECUENCIAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(433, 433, 433))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsecuenciaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsecuenciaDos, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConvertidaUno, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                                    .addComponent(txtConvertidaDos))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsecuenciaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsecuenciaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConvertidaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConvertidaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(89, 89, 89))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("No. Filas: ");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("No. Columnas :");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Valor Total :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfilasTabla)
                    .addComponent(txtcolumnasTabla)
                    .addComponent(txtTotal))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfilasTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcolumnasTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tablaValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaValores);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("TABLA VALORES");

        tablaResultante.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaResultante.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tablaResultante);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TABLA SCORE");

        BotonResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Tabla.png"))); // NOI18N
        BotonResultado.setText("GENERAR TABLAS");
        BotonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResultadoActionPerformed(evt);
            }
        });

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Salir.png"))); // NOI18N
        BotonSalir.setText("SALIR");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Abrir archivo.png"))); // NOI18N
        BotonAbrir.setText("ABRIR ARCHIVO");
        BotonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirActionPerformed(evt);
            }
        });

        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Guardar archivo.png"))); // NOI18N
        BotonGuardar.setText("GUARDAR ALINEAMIENTO");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(BotonResultado)
                .addGap(18, 18, 18)
                .addComponent(BotonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 28, Short.MAX_VALUE)
                .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        areaAlineada.setColumns(20);
        areaAlineada.setRows(5);
        jScrollPane4.setViewportView(areaAlineada);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("INGRESO DE SECUENCIAS");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("SECUENCIAS ALINEADAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(556, 556, 556)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(473, 473, 473)
                                        .addComponent(jLabel6)
                                        .addGap(305, 305, 305))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1))
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed
    
       
    private void BotonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResultadoActionPerformed
       
            String sec_uno, sec_dos;
            
            sec_uno = txtsecuenciaUno.getText();
            sec_dos = txtsecuenciaDos.getText();
           
            ar1 = matrizPrin.cambiarSecuencia(sec_uno);
            ar2 = matrizPrin.cambiarSecuencia(sec_dos);
            
            mp  = matrizPrin.crearMatrizPrincipal();
            matrizPrin.mostrarMatrizValores(mp, tablaValores);
            
            txtConvertidaUno.setText(String.valueOf(ar1));
            txtConvertidaDos.setText(String.valueOf(ar2));
            
            mt = new  int[ar2.size()+2][ar1.size()+2];
            llenarMatriz(mt);
            mostrarMatriz(mt);
           
    }//GEN-LAST:event_BotonResultadoActionPerformed
    
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    GestionarArchivo gestion = new GestionarArchivo(); 
    String linea, linea_dos;
    
    private void BotonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirActionPerformed
        
        if(seleccionado.showDialog(this, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
          archivo = seleccionado.getSelectedFile();
          if(archivo.canRead()){
              
              if(archivo.getName().endsWith("txt")){
                  
                  String contenido = gestion.AbrirTexto(archivo);
                  
                  try {
                      
                  BufferedReader reader = new BufferedReader(new FileReader(archivo));
                    
                  linea = reader.readLine();
                  linea_dos = reader.readLine();
                  
                  String[] arreglo_datos = linea.split(":");
                  String[] arreglo_datos_dos = linea_dos.split(":");
                  
               
                  for (int i=1; i<arreglo_datos.length; i++){
                     
                     txtsecuenciaUno.setText(arreglo_datos[1]);
                     txtsecuenciaDos.setText(arreglo_datos_dos[1]);
                  }
               
                  } catch (Exception e) {
                      
                      JOptionPane.showMessageDialog(null, " Error al cargar archivo ", " Error ", JOptionPane.WARNING_MESSAGE);
                  }
                 
              }else{
                 JOptionPane.showMessageDialog(null, " El archivo debe ser de formato .txt ", " Error ", JOptionPane.ERROR_MESSAGE);
            }
         
          }
         
        }
        
    }//GEN-LAST:event_BotonAbrirActionPerformed

    private void txtsecuenciaUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecuenciaUnoKeyTyped

        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

            evt.consume();

        }
    }//GEN-LAST:event_txtsecuenciaUnoKeyTyped

    private void txtsecuenciaDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecuenciaDosKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

            evt.consume();

        }
    }//GEN-LAST:event_txtsecuenciaDosKeyTyped
 
    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if(seleccionado.showDialog(this, "GUARDAR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
               
                String contenido = areaAlineada.getText();
               
                String respuesta = arch.GuardarTexto(archivo, contenido);
                if(respuesta !=null){
                     JOptionPane.showMessageDialog(null, respuesta);
                }else{
                     JOptionPane.showMessageDialog(null, " Error al guardar archivo ", " Error ", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                 JOptionPane.showMessageDialog(null, " El archivo se debe guardar en un formato de texto ", " Error ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    public int calcularValor(int i, int j) {
        int valor = mp[i][j];
        return valor;
    }

    public int calcularMaximo(int i, int j) {
        int valor, opA, opB, opC;
        opA = mt[i - 1][j - 1] + calcularValor(mt[i][0], mt[0][j]);
        opB = mt[i][j - 1] - 5;
        opC = mt[i - 1][j] - 5;

        if (opA >= opB) {
            if (opA >= opC) {
                valor = opA;
            } else {
                valor = opC;
            }
        } else if (opB >= opC) {
            valor = opB;
        } else {
            valor = opC;
        }
        return valor;
    }

    public int[][] llenarMatriz(int mt[][]) {

        mt[0][0] = 5;
        mt[0][1] = 5;
        mt[1][0] = 5;

        for (int i = 0, j = 2, k = 0; j < (ar1.size() + 2); j++, k++) {
            mt[i][j] = ar1.get(k);
        }
        for (int i = 2, j = 0, k = 0; i < (ar2.size() + 2); i++, k++) {
            mt[i][j] = ar2.get(k);
        }
        for (int i = 1, j = 1, h = 0; j < (ar1.size() + 2); j++) {
            mt[i][j] = h;
            h = h - 5;
        }
        for (int i = 1, j = 1, h = 0; i < (ar2.size() + 2); i++) {
            mt[i][j] = h;
            h = h - 5;
        }

        for (int i = 2; i < (ar2.size() + 2); i++) {
            for (int j = 2; j < (ar1.size() + 2); j++) {
                mt[i][j] = calcularMaximo(i, j);
            }
        }
        alinearSec();
        return mt;
    }
    
     public void alinearSec() {

        int opA, opB, opC;
        int x = ar2.size() + 1, y = ar1.size() + 1;
        int cont1 = ar1.size(), cont2 = ar2.size();

        while (cont1 > 0 & cont2 > 0) {
            //JOptionPane.showMessageDialog(null, "Posicion : "+mt[x][y]+" Opcion A: "+(mt[x-1][y-1] + calcularValor(mt[x][0], mt[0][y]))+" Opcion B: "+(mt[x][y-1] + 5)+" Opcion C: "+(mt[x-1][y] + 5));
            opA = mt[x - 1][y - 1] + calcularValor(mt[x][0], mt[0][y]);
            opB = mt[x][y - 1] - 5;
            opC = mt[x - 1][y] - 5;

            if (opA == mt[x][y]) {
                ali1.add(ar1.get(cont1 - 1));
                ali2.add(ar2.get(cont2 - 1));//alinear una arriba una abajo
                //JOptionPane.showMessageDialog(null, "Secuencia 1: "+ali1.toString()+"\nSecuencia 2: "+ali2.toString());
                x--;
                y--;
                cont1--;
                cont2--;
            } else {
                if (opB == mt[x][y]) {
                    ali1.add(ar1.get(cont1 - 1));
                    ali2.add(0);//alinear una arriba espacion abajo
                    //JOptionPane.showMessageDialog(null, "Secuencia 1: "+ali1.toString()+"\nSecuencia 2: "+ali2.toString());
                    y--;
                    cont1--;
                } else {
                    if (opC == mt[x][y]) {
                        ali1.add(0);
                        ali2.add(ar2.get(cont2 - 1));//alinear espacion arriba una abajo
                        //JOptionPane.showMessageDialog(null, "Secuencia 1: "+ali1.toString()+"\nSecuencia 2: "+ali2.toString());
                        x--;
                        cont2--;
                    }
                }
            }

        }
        while (cont1 > 0) {
            ali1.add(ar1.get(cont1 - 1));
            ali2.add(0);
            cont1--;
        }
        while (cont2 > 0) {
            ali1.add(0);
            ali2.add(ar2.get(cont2 - 1));
            cont2--;
        }
        //JOptionPane.showMessageDialog(null, "Secuencia 1: "+ali1.toString()+"\nSecuencia 2: "+ali2.toString());
    }
     

     public void mostrarMatriz(int mt[][] ) {

        DefaultTableModel modelo = (DefaultTableModel) tablaResultante.getModel();
        modelo.setRowCount(ar2.size() + 2);
        modelo.setColumnCount(ar1.size() + 2);
        
        int total =0;
        
        for (int i = 0; i < ar2.size() + 2; i++) {
            for (int j = 0; j < ar1.size() + 2; j++) {
                
                 total = mt[i][j];
                 tablaResultante.setValueAt(mt[i][j], i, j);
             
            }
   
        }
        
        con_uno = matrizPrin.convertirLetra(String.valueOf(ali1));
        con_dos = matrizPrin.convertirLetra(String.valueOf(ali2));
        
         
        System.out.println(con_uno);
        System.out.println(con_dos);
        areaAlineada.setText("Sec_uno: "+con_uno+"\n"+"Sec_dos: "+con_dos);
        //areaAlineada.setForeground(Color.GREEN);
        
        txtfilasTabla.setText(String.valueOf(ar2.size()+2));
        txtcolumnasTabla.setText(String.valueOf(ar1.size()+2));
        txtTotal.setText(String.valueOf(total));

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbrir;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonResultado;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextArea areaAlineada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaResultante;
    private javax.swing.JTable tablaValores;
    private javax.swing.JTextField txtConvertidaDos;
    private javax.swing.JTextField txtConvertidaUno;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcolumnasTabla;
    private javax.swing.JTextField txtfilasTabla;
    private javax.swing.JTextField txtsecuenciaDos;
    private javax.swing.JTextField txtsecuenciaUno;
    // End of variables declaration//GEN-END:variables
}
