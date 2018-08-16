
package Almacen;

import Almacen.Categorias.Accesorio;
import Almacen.Categorias.Componente;
import Almacen.Categorias.Computador;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author 729-Producciones
 */
public class RegistroProductos extends javax.swing.JFrame {
    Cls_Controlador controlador = new Cls_Controlador();
    static String fichero_Producto = "producto";
    static ArrayList<Object> listaProductosArray = new ArrayList<>();
    static DefaultListModel lista_productoList = new DefaultListModel();
    
    public RegistroProductos() {
        initComponents();
        this.setTitle("Registro de Producto GEO - S.A.");
        this.setLocationRelativeTo(null);
        txt_tipo.setEnabled(false);
        //pnl_tipo.setVisible(true);
        pnl_accesorio.setVisible(false);
        pnl_componente.setVisible(false);
        pnl_computador.setVisible(false);
        
        if (controlador.extraerFichero(fichero_Producto).isEmpty()) {
            controlador.crearFichero(fichero_Producto);
        }
        listaProductosArray = controlador.extraerFichero(fichero_Producto);
        lst_ProductosRegistrados.setModel(lista_productoList);
        llenarList();
        
        
        
        
    }
    
    public void llenarList(){
        if (listaProductosArray.size() > 0) {
            lista_productoList.clear();
            for (int i = 0; i < listaProductosArray.size(); i++) {
                lista_productoList.addElement(listaProductosArray.get(i));
            }
        }
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_categoria = new javax.swing.JComboBox<>();
        txt_nombreP = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        pnl_contieneAtributos = new javax.swing.JPanel();
        pnl_computador = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_almacenamientoCmptador = new javax.swing.JTextField();
        txt_ramCmptador = new javax.swing.JTextField();
        txt_procesadorCmptador = new javax.swing.JTextField();
        pnl_accesorio = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_colorAcc = new javax.swing.JTextField();
        pnl_tipo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        pnl_componente = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_capacidadCmpnt = new javax.swing.JTextField();
        txt_velocidadCmpnt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_ProductosRegistrados = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btn_registrarProducto = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Registro de Producto:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Categoría;");

        cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Accesorio", "Componente", "Computador" }));
        cmb_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(cmb_categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreP))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_contieneAtributos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Almacenamiento:");

        jLabel8.setText("RAM:");

        jLabel9.setText("Procesador:");

        txt_almacenamientoCmptador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_almacenamientoCmptadorKeyTyped(evt);
            }
        });

        txt_ramCmptador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ramCmptadorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_computadorLayout = new javax.swing.GroupLayout(pnl_computador);
        pnl_computador.setLayout(pnl_computadorLayout);
        pnl_computadorLayout.setHorizontalGroup(
            pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_computadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ramCmptador)
                    .addComponent(txt_procesadorCmptador)
                    .addComponent(txt_almacenamientoCmptador))
                .addGap(29, 29, 29))
        );
        pnl_computadorLayout.setVerticalGroup(
            pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_computadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_almacenamientoCmptador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ramCmptador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_procesadorCmptador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("color:");

        javax.swing.GroupLayout pnl_accesorioLayout = new javax.swing.GroupLayout(pnl_accesorio);
        pnl_accesorio.setLayout(pnl_accesorioLayout);
        pnl_accesorioLayout.setHorizontalGroup(
            pnl_accesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accesorioLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addComponent(txt_colorAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_accesorioLayout.setVerticalGroup(
            pnl_accesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accesorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_accesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_colorAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Tipo:");

        javax.swing.GroupLayout pnl_tipoLayout = new javax.swing.GroupLayout(pnl_tipo);
        pnl_tipo.setLayout(pnl_tipoLayout);
        pnl_tipoLayout.setHorizontalGroup(
            pnl_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tipoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel12)
                .addGap(20, 20, 20)
                .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnl_tipoLayout.setVerticalGroup(
            pnl_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Capacidad:");

        jLabel13.setText("Velocidad:");

        txt_capacidadCmpnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_capacidadCmpntKeyTyped(evt);
            }
        });

        txt_velocidadCmpnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_velocidadCmpntKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_componenteLayout = new javax.swing.GroupLayout(pnl_componente);
        pnl_componente.setLayout(pnl_componenteLayout);
        pnl_componenteLayout.setHorizontalGroup(
            pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_componenteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_capacidadCmpnt)
                    .addComponent(txt_velocidadCmpnt))
                .addGap(29, 29, 29))
        );
        pnl_componenteLayout.setVerticalGroup(
            pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_componenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txt_capacidadCmpnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_velocidadCmpnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_contieneAtributosLayout = new javax.swing.GroupLayout(pnl_contieneAtributos);
        pnl_contieneAtributos.setLayout(pnl_contieneAtributosLayout);
        pnl_contieneAtributosLayout.setHorizontalGroup(
            pnl_contieneAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_computador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_accesorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_componente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_contieneAtributosLayout.setVerticalGroup(
            pnl_contieneAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contieneAtributosLayout.createSequentialGroup()
                .addComponent(pnl_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_computador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnl_componente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(lst_ProductosRegistrados);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Lista de Productos:");

        btn_registrarProducto.setText("Registrar Producto");
        btn_registrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarProductoActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn_registrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(btn_registrarProducto)
                .addGap(11, 11, 11)
                .addComponent(btn_regresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_contieneAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_contieneAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        InicioVentas i = new InicioVentas();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void cmb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriaActionPerformed
        
        if (cmb_categoria.getSelectedIndex() == 1) {
            txt_tipo.setEnabled(true);
            pnl_accesorio.setVisible(true);//Accesorio
            pnl_componente.setVisible(false);
            pnl_computador.setVisible(false);
            
        }else if (cmb_categoria.getSelectedIndex() == 2) {
            txt_tipo.setEnabled(true);
            pnl_accesorio.setVisible(false);
            pnl_componente.setVisible(true);//Componente
            pnl_computador.setVisible(false);
            
        }else if (cmb_categoria.getSelectedIndex() == 3) {
            txt_tipo.setEnabled(true);
            pnl_accesorio.setVisible(false);
            pnl_componente.setVisible(false);
            pnl_computador.setVisible(true);//Computador
            
        }else {//bloquea todo
            txt_tipo.setEnabled(false);
            pnl_accesorio.setVisible(false);
            pnl_componente.setVisible(false);
            pnl_computador.setVisible(false);
        }
        
        
    }//GEN-LAST:event_cmb_categoriaActionPerformed

    private void btn_registrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarProductoActionPerformed
        
        if (txt_nombreP.getText().equals("") || txt_precio.getText().equals("") || txt_marca.getText().equals("") ||
                cmb_categoria.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese o Seleccione Datos", "Atención..!!", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                accesorioComponenteComputador(cmb_categoria.getSelectedIndex());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio Incorrecto / Campo Numérico", "Error..!!", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
    }//GEN-LAST:event_btn_registrarProductoActionPerformed

    private void txt_almacenamientoCmptadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_almacenamientoCmptadorKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();//Solo permite numeros
        }
        int numero_caracteres = 10;
        if (txt_almacenamientoCmptador.getText().length() >= numero_caracteres) {//Permite solo 10 digitos
            evt.consume();
        }
    }//GEN-LAST:event_txt_almacenamientoCmptadorKeyTyped

    private void txt_ramCmptadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ramCmptadorKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();//Solo permite numeros
        }
        int numero_caracteres = 10;
        if (txt_ramCmptador.getText().length() >= numero_caracteres) {//Permite solo 10 digitos
            evt.consume();
        }
    }//GEN-LAST:event_txt_ramCmptadorKeyTyped

    private void txt_capacidadCmpntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_capacidadCmpntKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();//Solo permite numeros
        }
        int numero_caracteres = 10;
        if (txt_capacidadCmpnt.getText().length() >= numero_caracteres) {//Permite solo 10 digitos
            evt.consume();
        }
    }//GEN-LAST:event_txt_capacidadCmpntKeyTyped

    private void txt_velocidadCmpntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_velocidadCmpntKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();//Solo permite numeros
        }
        int numero_caracteres = 10;
        if (txt_velocidadCmpnt.getText().length() >= numero_caracteres) {//Permite solo 10 digitos
            evt.consume();
        }
    }//GEN-LAST:event_txt_velocidadCmpntKeyTyped

    public void accesorioComponenteComputador(int index){
        Cls_Producto p;
        
        if (index == 1) {
            if (txt_tipo.getText().equals("") || txt_colorAcc.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese o Seleccione Datos", "Atención..!!", JOptionPane.WARNING_MESSAGE);
            }else{
                p = new Accesorio(txt_nombreP.getText(), Double.parseDouble(txt_precio.getText()), txt_marca.getText(), txt_tipo.getText(), txt_colorAcc.getText());
                listaProductosArray.add(p);
                controlador.escribirFichero(fichero_Producto, listaProductosArray);
                listaProductosArray = controlador.extraerFichero(fichero_Producto);
                llenarList();
                limpiar();
            }
            
        }else if (index == 2) {
            if (txt_tipo.getText().equals("") || txt_capacidadCmpnt.getText().equals("") || txt_velocidadCmpnt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese o Seleccione Datos", "Atención..!!", JOptionPane.WARNING_MESSAGE);
            }else{
                p = new Componente(txt_nombreP.getText(), Double.parseDouble(txt_precio.getText()), txt_marca.getText(), txt_tipo.getText(), Integer.parseInt(txt_capacidadCmpnt.getText()), Integer.parseInt(txt_velocidadCmpnt.getText()));
                listaProductosArray.add(p);
                controlador.escribirFichero(fichero_Producto, listaProductosArray);
                listaProductosArray = controlador.extraerFichero(fichero_Producto);
                llenarList();
                limpiar();
            }
            
        }else if (index == 3) {
            if (txt_tipo.getText().equals("") || txt_almacenamientoCmptador.getText().equals("") || txt_ramCmptador.getText().equals("") || txt_procesadorCmptador.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese o Seleccione Datos", "Atención..!!", JOptionPane.WARNING_MESSAGE);
            } else {
                p = new Computador(txt_nombreP.getText(), Double.parseDouble(txt_precio.getText()), txt_marca.getText(), txt_tipo.getText(), Integer.parseInt(txt_almacenamientoCmptador.getText()), Integer.parseInt(txt_ramCmptador.getText()), txt_procesadorCmptador.getText());
                listaProductosArray.add(p);
                controlador.escribirFichero(fichero_Producto, listaProductosArray);
                listaProductosArray = controlador.extraerFichero(fichero_Producto);
                llenarList();
                limpiar();
            }
            
        }
        
        
    }
    
    public void limpiar(){
        txt_nombreP.setText(null);
        txt_precio.setText(null);
        txt_marca.setText(null);
        cmb_categoria.setSelectedIndex(0);
        txt_tipo.setText(null);
        txt_almacenamientoCmptador.setText(null);
        txt_ramCmptador.setText(null);
        txt_procesadorCmptador.setText(null);
        txt_colorAcc.setText(null);
        txt_capacidadCmpnt.setText(null);
        txt_velocidadCmpnt.setText(null);
        
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
            java.util.logging.Logger.getLogger(RegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrarProducto;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> cmb_categoria;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_ProductosRegistrados;
    private javax.swing.JPanel pnl_accesorio;
    private javax.swing.JPanel pnl_componente;
    private javax.swing.JPanel pnl_computador;
    private javax.swing.JPanel pnl_contieneAtributos;
    private javax.swing.JPanel pnl_tipo;
    private javax.swing.JTextField txt_almacenamientoCmptador;
    private javax.swing.JTextField txt_capacidadCmpnt;
    private javax.swing.JTextField txt_colorAcc;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_nombreP;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_procesadorCmptador;
    private javax.swing.JTextField txt_ramCmptador;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_velocidadCmpnt;
    // End of variables declaration//GEN-END:variables
}
