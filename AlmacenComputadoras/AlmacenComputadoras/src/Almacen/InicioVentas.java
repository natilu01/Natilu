
package Almacen;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class InicioVentas extends javax.swing.JFrame {
    
    String fichero_registroVenta = "venta";
    Cls_Controlador controlador = new Cls_Controlador();
    DefaultListModel listaCompra2 = new DefaultListModel();
    ArrayList<Object> listaRegistroVenta = new ArrayList<>();
    ArrayList<Cls_Producto> pedidoProducto = new ArrayList<>();
    double total, totalVentas;
  
    public InicioVentas() {
        initComponents();
        this.setTitle("Artículos de Computadora GEO - S.A.");
        cmb_clienteVenta.setEnabled(false);
        this.setLocationRelativeTo(null);
        if (controlador.extraerFichero(fichero_registroVenta).isEmpty()) {
            controlador.crearFichero(fichero_registroVenta);
        }
        listaRegistroVenta = controlador.extraerFichero(fichero_registroVenta);
        
        llenarCombo();
        lst_producto.setModel(RegistroProductos.lista_productoList);
        lst_productoCompra.setModel(listaCompra2);
        llenarLista();
        
        
        
    }
    
    public void llenarCombo(){
        //Llena combo clientes registrados
        if (controlador.extraerFichero(RegistroCliente.fichero_Cliente).isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Existe Cliente Registrado", "Atencion..!!", JOptionPane.WARNING_MESSAGE);
        }else{
            cmb_cliente.removeAllItems();
            RegistroCliente.listaClienteArray = controlador.extraerFichero(RegistroCliente.fichero_Cliente);
            DefaultComboBoxModel modelC = new DefaultComboBoxModel(RegistroCliente.listaClienteArray.toArray());
            if (RegistroCliente.listaClienteArray.size() > 0) {
                cmb_cliente.setModel(modelC);
            }
            cmb_cliente.setSelectedIndex(-1);
        }
        
        //Llena combo de registro de ventas
        if (listaRegistroVenta.size() > 0) {
            cmb_clienteVenta.removeAllItems();
            DefaultComboBoxModel modelV = new DefaultComboBoxModel(listaRegistroVenta.toArray());
            cmb_clienteVenta.setModel(modelV);
            cmb_clienteVenta.setEnabled(true);
        }
        cmb_clienteVenta.setSelectedIndex(-1);
    }

    public void llenarLista(){
        
        if (!controlador.extraerFichero(RegistroProductos.fichero_Producto).isEmpty()){
            RegistroProductos.listaProductosArray = controlador.extraerFichero(RegistroProductos.fichero_Producto);
            
            if (RegistroProductos.listaProductosArray.size() > 0) {
                RegistroProductos.lista_productoList.clear();
                for (int i = 0; i < RegistroProductos.listaProductosArray.size(); i++) {
                    RegistroProductos.lista_productoList.addElement(RegistroProductos.listaProductosArray.get(i));
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "No Existe Productos Registrados", "Atención..!!", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_producto = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_nuevoProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst_productoCompra = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btn_nevoCliente = new javax.swing.JButton();
        cmb_cliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_historialVentas = new javax.swing.JTextArea();
        cmb_clienteVenta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btn_mostrarVenta = new javax.swing.JButton();
        lbl_nombre = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_totalVenta = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txt_total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_registrarCompra = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane2.setViewportView(lst_producto);

        btn_add.setText("Add>>");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_remove.setText("<<Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_nuevoProducto.setText("Nuevo");
        btn_nuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_nuevoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_add)
                .addGap(18, 18, 18)
                .addComponent(btn_remove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nuevoProducto)
                .addGap(28, 28, 28))
        );

        jScrollPane3.setViewportView(lst_productoCompra);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setText("Nombre:");

        jLabel3.setText("Cédula:");

        jLabel4.setText("Teléfono:");

        txt_nombre.setEditable(false);

        txt_cedula.setEditable(false);

        txt_telefono.setEditable(false);

        btn_nevoCliente.setText("Nuevo Cliente");
        btn_nevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nevoClienteActionPerformed(evt);
            }
        });

        cmb_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciones--" }));
        cmb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_clienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione Cliente:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_cliente, 0, 148, Short.MAX_VALUE)
                            .addComponent(txt_nombre)
                            .addComponent(txt_cedula)
                            .addComponent(txt_telefono))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_nevoCliente)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_nevoCliente)
                .addGap(42, 42, 42))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Ventas:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txta_historialVentas.setEditable(false);
        txta_historialVentas.setColumns(20);
        txta_historialVentas.setRows(5);
        jScrollPane1.setViewportView(txta_historialVentas);

        cmb_clienteVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        cmb_clienteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_clienteVentaActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente:");

        btn_mostrarVenta.setText("Mostrar Venta");
        btn_mostrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarVentaActionPerformed(evt);
            }
        });

        lbl_nombre.setText("Nombre:");

        lbl_cedula.setText("Cédula:");

        lbl_telefono.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Total Venta:");

        txt_totalVenta.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_clienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_mostrarVenta))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(lbl_cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txt_totalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_clienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btn_mostrarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_totalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Valor Actual:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txt_total.setEditable(false);

        jLabel10.setText("Total:   $ ");

        btn_registrarCompra.setText("Registrar compra");
        btn_registrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarCompraActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_total)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_registrarCompra)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(46, 46, 46))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addComponent(btn_registrarCompra)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Almacen/Categorias/PC_blk_100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btn_nevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nevoClienteActionPerformed
        RegistroCliente c =new RegistroCliente();
        c.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_nevoClienteActionPerformed

    private void btn_nuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoProductoActionPerformed
        RegistroProductos p = new RegistroProductos();
        p.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_nuevoProductoActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        limpiarHistorial();
        int indice[] = lst_producto.getSelectedIndices();//selecciona varios indices
        
        for (int i = 0; i < indice.length; i++) {
            listaCompra2.addElement(RegistroProductos.lista_productoList.get(indice [i]));//Agrega items seleccionados
            Cls_Producto pro = (Cls_Producto) RegistroProductos.lista_productoList.get(indice [i]);
            total += pro.getPrecio();
            txt_total.setText(String.valueOf(total));
            pedidoProducto.add(pro);
            
        }
        lst_producto.clearSelection();
    }//GEN-LAST:event_btn_addActionPerformed

    
    
    
    
    private void cmb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_clienteActionPerformed
        
        if (cmb_cliente.getSelectedIndex() == -1) {
            limpiar();
        }else{
            
            Cls_Cliente selectedCombo = (Cls_Cliente) cmb_cliente.getSelectedItem();
            for (int i = 0; i < RegistroCliente.listaClienteArray.size(); i++) {
                Cls_Cliente datos = (Cls_Cliente) RegistroCliente.listaClienteArray.get(i);
                if (selectedCombo.getNombre().equals(datos.getNombre())) {
                    txt_nombre.setText(datos.getNombre());
                    txt_cedula.setText(datos.getCedula());
                    txt_telefono.setText(datos.getTelefono());
                    break;
                }
            }
        }
        
    }//GEN-LAST:event_cmb_clienteActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        limpiarHistorial();
        int indice[] = lst_productoCompra.getSelectedIndices();//selecciona varios indices
        for (int i = indice.length-1; i >= 0; i--) {//Se remueve desde la ultima seleccion
            Cls_Producto pro = (Cls_Producto) listaCompra2.get(indice[i]);//Primero se resta luego se elimina para que no de erro
            total -= pro.getPrecio();
            txt_total.setText(String.valueOf(total));
            pedidoProducto.remove(pro);
            listaCompra2.remove(indice[i]);//Remueve items seleccionados
            if (total == 0) {
                txt_total.setText(null);
            }
        }
        lst_productoCompra.clearSelection();
        
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_registrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarCompraActionPerformed
        limpiarHistorial();
        if (txt_nombre.getText().equals("") || txt_cedula.getText().equals("") || txt_telefono.getText().equals("") || txt_total.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione Cliente o Producto", "Atención..!!", JOptionPane.WARNING_MESSAGE);
        }else {
            registarCompra();
            listaCompra2.clear();
            total = 0;
        }
        
        
    }//GEN-LAST:event_btn_registrarCompraActionPerformed

    public void registarCompra() {

        Cls_Cliente cliente = (Cls_Cliente) cmb_cliente.getSelectedItem();
        Cls_Cliente c = new Cls_Cliente(cliente.getNombre(), cliente.getCedula(), cliente.getTelefono(), pedidoProducto);
        listaRegistroVenta.add(c);
        controlador.escribirFichero(fichero_registroVenta, listaRegistroVenta);
        listaRegistroVenta = controlador.extraerFichero(fichero_registroVenta);
        llenarCombo();
        limpiar();
    }
    
    
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpiar();
        listaCompra2.clear();
        cmb_cliente.setSelectedIndex(-1);
        limpiarHistorial();
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    public void limpiarHistorial(){
        cmb_clienteVenta.setSelectedIndex(-1);
        txt_totalVenta.setText(null);
        txta_historialVentas.setText(null);
        btn_mostrarVenta.setEnabled(true);
    }
    
    private void btn_mostrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarVentaActionPerformed
        
        if (cmb_clienteVenta.getSelectedIndex() != -1) {
            Cls_Cliente clienteCombo = (Cls_Cliente) cmb_clienteVenta.getSelectedItem();
            for (int i = 0; i < listaRegistroVenta.size(); i++) {
                Cls_Cliente clienteArray = (Cls_Cliente) listaRegistroVenta.get(i);
                if (clienteCombo.getNombre().equals(clienteArray.getNombre())) {
                    for (int j = 0; j < clienteArray.getListaCompras().size(); j++) {//busca items y suma precios
                        Cls_Producto p = (Cls_Producto) clienteArray.getListaCompras().get(j);
                        txta_historialVentas.append("Producto "+(j+1)+":  "+p.getNombre()+"  / Precio: "+"$"+p.getPrecio()+"  / Marca: "+p.getMarca()+"\n");
                        totalVentas += p.getPrecio();
                        btn_mostrarVenta.setEnabled(false);
                    }//Fin FOR (j)
                    break;
                }//IF
            }//Fin FOR (i)
            
            txt_totalVenta.setText(String.valueOf(totalVentas));
            totalVentas = 0;
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione Cliente", "Atención..!!", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_mostrarVentaActionPerformed

    private void cmb_clienteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_clienteVentaActionPerformed
        
        Cls_Cliente clienteCombo = (Cls_Cliente) cmb_clienteVenta.getSelectedItem();
        if (cmb_clienteVenta.getSelectedIndex() !=-1) {
            lbl_nombre.setText("Nombre: "+clienteCombo.getNombre());
            lbl_cedula.setText("Nombre: "+clienteCombo.getCedula());
            lbl_telefono.setText("Nombre: "+clienteCombo.getTelefono());
            txta_historialVentas.setText(null);
            btn_mostrarVenta.setEnabled(true);
            txt_totalVenta.setText(null);
        }else {
            lbl_nombre.setText("Nombre:");
            lbl_cedula.setText("Nombre:");
            lbl_telefono.setText("Nombre:");
        }
        
        
        
    }//GEN-LAST:event_cmb_clienteVentaActionPerformed

    
    
    
    
    public void limpiar(){
        txt_nombre.setText(null);
        txt_cedula.setText(null);
        txt_telefono.setText(null);
        txt_total.setText(null);
        
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
            java.util.logging.Logger.getLogger(InicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_mostrarVenta;
    private javax.swing.JButton btn_nevoCliente;
    private javax.swing.JButton btn_nuevoProducto;
    private javax.swing.JButton btn_registrarCompra;
    private javax.swing.JButton btn_remove;
    private javax.swing.JComboBox<String> cmb_cliente;
    private javax.swing.JComboBox<String> cmb_clienteVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JList<String> lst_producto;
    private javax.swing.JList<String> lst_productoCompra;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_totalVenta;
    private javax.swing.JTextArea txta_historialVentas;
    // End of variables declaration//GEN-END:variables
}
