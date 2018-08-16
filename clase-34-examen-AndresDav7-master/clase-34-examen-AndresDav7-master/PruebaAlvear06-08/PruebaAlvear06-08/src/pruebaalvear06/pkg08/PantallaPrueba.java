package pruebaalvear06.pkg08;

import javax.swing.JOptionPane;

public class PantallaPrueba extends javax.swing.JFrame {
    

    public boolean Verificacion(double a,double b,double c, boolean bool){
        
        if(bool){
           if(a+b>c && b+c>a && a+c>b){
              System.out.println("Cumple");   
              return true; 
          }else{
              System.out.println("No cumple");
              return false;   
          } 
        }else{
             if(a>0){
              System.out.println("Cumple");   
              return true; 
             }else{
              System.out.println("No cumple");
              return false;   
          }   
        }
        
    }
    
    public PantallaPrueba() {
        initComponents();
        btnCalcular.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbTriangulos = new javax.swing.JComboBox<>();
        lblLadA = new javax.swing.JLabel();
        txtLadoA = new javax.swing.JTextField();
        lblLadB = new javax.swing.JLabel();
        txtLadoB = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblImprimirArea = new javax.swing.JLabel();
        lblImprimirPerimetro = new javax.swing.JLabel();
        lblImprimirAltura = new javax.swing.JLabel();
        lblLadC = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JTextField();
        lblLadoRepetido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Triángulos");

        jLabel1.setText("Tipo de triángulo");

        cmbTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectángulo", "Isósceles", "Escaleno", "Equilátero" }));
        cmbTriangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTriangulosActionPerformed(evt);
            }
        });

        lblLadA.setText("Lado A");

        lblLadB.setText("Lado B");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultados");

        jLabel5.setText("Area");

        jLabel6.setText("Perimetro");

        jLabel7.setText("Altura");

        lblImprimirArea.setText("...");

        lblImprimirPerimetro.setText("...");

        lblImprimirAltura.setText("...");

        lblLadC.setText("Lado C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(cmbTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLadB)
                                            .addComponent(lblLadC))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLadoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLadoC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLadA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblImprimirArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblImprimirPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblImprimirAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(lblLadoRepetido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(66, 66, 66))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnCalcular)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadA)
                    .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lblLadoRepetido))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLadB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblImprimirArea)
                        .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblImprimirPerimetro)
                    .addComponent(lblLadC)
                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblImprimirAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTriangulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTriangulosActionPerformed
        int tipoTriangulo = cmbTriangulos.getSelectedIndex();
        btnCalcular.setEnabled(true);
        txtLadoA.setText("");
        txtLadoB.setText("");
        txtLadoC.setText("");
        
        if(tipoTriangulo == 0){
          //Rectangulo
          txtLadoB.setEnabled(true);
          txtLadoC.setEnabled(false);
          lblLadA.setText("Lado A");
          lblLadB.setText("Lado B");
          
        }else if(tipoTriangulo == 1){
          //Isosceles 
          txtLadoC.setEnabled(false);
          txtLadoB.setEnabled(true);
          lblLadA.setText("Lado Repetido");
          lblLadB.setText("Base");
        }else if(tipoTriangulo == 2){
          //Escaleno 
          txtLadoC.setEnabled(true);
          txtLadoB.setEnabled(true);
          lblLadA.setText("Lado A");
          lblLadB.setText("Lado B");
          lblLadC.setText("Lado C");
        }else if(tipoTriangulo == 3){
          //Equilatero 
          txtLadoB.setEnabled(false);
          txtLadoC.setEnabled(false);
          lblLadA.setText("Lado A");
          lblLadB.setText("Lado B");
          
        }
        
        
    }//GEN-LAST:event_cmbTriangulosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        int tipoTriangulo = cmbTriangulos.getSelectedIndex();
        boolean verificar;
        double area, perimetro, altura;
        
        if(tipoTriangulo == 0){
            
          //Rectangulo
          Triangulo triangulo = new Triangulo(Double.parseDouble(txtLadoA.getText()), 
                  Double.parseDouble(txtLadoB.getText()), 0);

          double aCuadrado = Math.pow(triangulo.getLadoA(), 2);
          double bCuadrado = Math.pow(triangulo.getLadoB(), 2);
          double cCuadrado = aCuadrado + bCuadrado;
          double c = Math.sqrt(cCuadrado);
          
          area = ((triangulo.getLadoB()*triangulo.getLadoA())/2);
          perimetro = triangulo.getLadoA()+triangulo.getLadoB()+c;
          altura = ((triangulo.getLadoA()*triangulo.getLadoB())/c);
          
          verificar = Verificacion(triangulo.getLadoA(),triangulo.getLadoB(),c,true);
                    
          if(verificar){
            
            lblImprimirAltura.setText( String.valueOf(altura)); 
            lblImprimirArea.setText( String.valueOf(area));
            lblImprimirPerimetro.setText( String.valueOf(perimetro));
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "No es un Triangulo", "Lados Erroneos", HEIGHT);
            txtLadoA.setText("");
            txtLadoB.setText("");
            lblImprimirAltura.setText("..."); 
            lblImprimirArea.setText("...");
            lblImprimirPerimetro.setText("...");
        }
          
          
        }else if(tipoTriangulo == 1){
          //Isosceles
          Triangulo triangulo = new Triangulo(Double.parseDouble(txtLadoA.getText()), 
                  Double.parseDouble(txtLadoB.getText()), 0);
              
          double aCuadrado = Math.pow(triangulo.getLadoA(), 2);
          double bCuadrado = Math.pow(triangulo.getLadoB(), 2);
          
          area = (triangulo.getLadoB()*(Math.sqrt((aCuadrado)-(bCuadrado/4))))/2;
          perimetro = 2*triangulo.getLadoA()+triangulo.getLadoB();
          altura = Math.sqrt((aCuadrado)-(bCuadrado/4));
          
          verificar = Verificacion(triangulo.getLadoA(),triangulo.getLadoA(),triangulo.getLadoB(),true);
          
        if(verificar){
            
            lblImprimirAltura.setText( String.valueOf(altura)); 
            lblImprimirArea.setText( String.valueOf(area));
            lblImprimirPerimetro.setText( String.valueOf(perimetro));
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "No es un Triangulo", "Lados Erroneos", HEIGHT);
            txtLadoA.setText("");
            txtLadoB.setText("");
            lblImprimirAltura.setText("..."); 
            lblImprimirArea.setText("...");
            lblImprimirPerimetro.setText("...");
        }
     
          
        }else if(tipoTriangulo == 2){
          //Escaleno 
          double a = Double.parseDouble(txtLadoA.getText());
          double b = Double.parseDouble(txtLadoB.getText());
          double c = Double.parseDouble(txtLadoC.getText());
          
          double aCuadrado = Math.pow(a, 2);
          double bCuadrado = Math.pow(b, 2);
          double cCuadrado = aCuadrado + bCuadrado;
          
          double s = ((a+b+c)/2);
          area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
          perimetro = a+b+c;
          altura = ((2/a)*(Math.sqrt((s*(s-a)*(s-b)*(s-c)))));
          
          verificar = Verificacion(a,b,c,true);
          
          if(a==b || a==c || b==c){
            verificar = false;  
          }
          
        if(verificar){
            
            lblImprimirAltura.setText( String.valueOf(altura)); 
            lblImprimirArea.setText( String.valueOf(area));
            lblImprimirPerimetro.setText( String.valueOf(perimetro));
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Triangulo Erroneo", "Lados Erroneos", HEIGHT);
            txtLadoA.setText("");
            txtLadoB.setText("");
            txtLadoC.setText("");
            lblImprimirAltura.setText("..."); 
            lblImprimirArea.setText("...");
            lblImprimirPerimetro.setText("...");
        }
          
          
        }else if(tipoTriangulo == 3){
          //Equilatero 
          double a = Double.parseDouble(txtLadoA.getText());
                    
          double aCuadrado = Math.pow(a, 2);
       
          area = ((((Math.sqrt(3))*a)/2)*(aCuadrado));
          perimetro = 3*a;
          altura = ((Math.sqrt(3))*a)/2;
          
          verificar = Verificacion(a,0,0,false);
          
        if(verificar){
            lblImprimirAltura.setText( String.valueOf(altura)); 
            lblImprimirArea.setText( String.valueOf(area));
            lblImprimirPerimetro.setText( String.valueOf(perimetro));
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "No es un Triangulo", "Lados Erroneos", HEIGHT);
            txtLadoA.setText("");
            lblImprimirAltura.setText("..."); 
            lblImprimirArea.setText("...");
            lblImprimirPerimetro.setText("...");

        }
          
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbTriangulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblImprimirAltura;
    private javax.swing.JLabel lblImprimirArea;
    private javax.swing.JLabel lblImprimirPerimetro;
    private javax.swing.JLabel lblLadA;
    private javax.swing.JLabel lblLadB;
    private javax.swing.JLabel lblLadC;
    private javax.swing.JLabel lblLadoRepetido;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLadoA;
    private javax.swing.JTextField txtLadoB;
    private javax.swing.JTextField txtLadoC;
    // End of variables declaration//GEN-END:variables
}
