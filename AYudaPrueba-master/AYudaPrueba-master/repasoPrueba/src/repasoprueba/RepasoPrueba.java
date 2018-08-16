package repasoprueba;

import java.util.Scanner;

public class RepasoPrueba {
    
    //public class Rectangulo implements Figura (Interfaz Figura debe tener todas las funciones que la interfaz){
    //interfaz :  double calcularArea(double lado1, double lado2);
    //            double calcularPerimetro(double lado1, double lado2, double lado3);
    
    // para la herencia implements ///nombre de la calse que herad
    // implements serializable para los archivos en la clase que vamos a usar
    public static void main(String[] args) {
        
        //Figura = cmbFiguras.getSelectedItem().toString(); (Selecciona del comboBox el item) el nombre no el index
        //int cargosInt = cmbCargo.getSelectedIndex(); toma el valor del Cmb
        
        /*
        if (Figura.equals("Circulo")) {
            
            Figura f1 = new Circulo();
            
            double radio = Double.parseDouble(txtRadioCirculo.getText());
            
            double m = f1.calcularArea(radio, 0);
            double m2 = f1.calcularPerimetro(radio, 0,0);
            
            lblImprimirPerimetro.setText(String.valueOf(m2));
            lblImprimirArea.setText(String.valueOf(m));
            
            txtRadioCirculo.setText("");

        }else if (Figura.equals("Cuadrado")) {
            
            Figura f1 = new Cuadrado();
            
            double lado = Double.parseDouble(txtLadoCuadrado.getText());
            
            double m = f1.calcularArea(lado, 0);
            double m2 = f1.calcularPerimetro(lado, 0,0);
            
            lblImprimirPerimetro.setText(String.valueOf(m2));
            lblImprimirArea.setText(String.valueOf(m));

           
            txtLadoCuadrado.setText("");
            
        }else if (Figura.equals("Rectangulo")) {
            
            Figura f1 = new Rectangulo();
            
            double base = Double.parseDouble(txtAlturaRectangulo.getText());
            double altura = Double.parseDouble(txtBaseRectangulo.getText());
            
            double m = f1.calcularArea(base, altura);
            double m2 = f1.calcularPerimetro(base, altura,0);
            
            lblImprimirPerimetro.setText(String.valueOf(m2));
            lblImprimirArea.setText(String.valueOf(m));

            txtAlturaRectangulo.setText("");
            txtBaseRectangulo.setText("");
            
        }else if (Figura.equals("Triangulo")) {
            
            Figura f1 = new Triangulo();
            
            double base = Double.parseDouble(txtBaseTriangulo.getText());
            double altura = Double.parseDouble(txtAlturaTriangulo.getText());
            double lado1 = Double.parseDouble(txtLado1T.getText());
            double lado2 = Double.parseDouble(txtLado2T.getText());
            double lado3 = Double.parseDouble(txtLado3T.getText());
            
            double m = f1.calcularArea(base, altura);
            double m2 = f1.calcularPerimetro(lado1, lado2,lado3);
            
            lblImprimirPerimetro.setText(String.valueOf(m2));
            lblImprimirArea.setText(String.valueOf(m));
      

            txtAlturaTriangulo.setText("");
            txtBaseTriangulo.setText("");
            txtLado1T.setText("");
            txtLado2T.setText("");
            txtLado3T.setText("");
        }
        
        *************************************************************************
        ------Tabla------
         String[][] Empleado;
        DefaultTableModel tblModelEmpleado;
    
        
        ------Array List------puede ser <Object>
        List<EmpleadoClase> listaEmpleados = new ArrayList<EmpleadoClase>();
         
        ----***-**-*-*-*-*>
        
        List<Estudiante> listaEsMatriculados = new ArrayList<Estudiante>();
        DefaultComboBoxModel listaEsMatriModel = 
            new DefaultComboBoxModel(listaEsMatriculados.toArray());
    
    
        
        
        //Inicializo Tabla Empleado bajo inimt components
        
        Empleado = new String [][] {};
        
        String titulosEmpleados[] = new String [] {
            "Nombre",
            "Apellido",
            "Cargo"
        };
        
        tblModelEmpleado = new DefaultTableModel(Empleado, titulosEmpleados);
        tblEmpleado.setModel(tblModelEmpleado);
        
        //Fin Tabla Empleado
        
    }
        -----------llenar en la tabla----------
        tblModelEmpleado.addRow(new String[]{newEmpleado.getNombre(),newEmpleado.getApellido(),newEmpleado.getCargo()});
        listaEmpleados.add(newEmpleado); -------> agrega al array list al empleado
        
        
        -----for each------
        for(EmpleadoClase m: listaEmpleados){
        
           if(m.getCargo().equals("Bodega")){
            tblModelEmpleado.addRow(new String[]{m.getNombre(),m.getApellido(),m.getCargo()});
        
        }
        
        -------------Comprobacion de si existe algo en la list--------
        for (Profesor p : listaProfesores){
                    if (p.getMateria().equals(newProfesor.getMateria())){
                        profesorExiste =true;
                        break;
                    }
                }
                if (!profesorExiste){
                    listaProfesores.add(newProfesor);

                    tblModelProfesor.addRow(new String [] {newProfesor.getNombre(), newProfesor.getMateria()});
                    cmbListaMaterias.addItem(materia);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Materia ya registrada!!");

                }
                
                txtNombreProfesor.setText("");
                txtApellidoProfesor.setText("");
                txtEdadProfesor.setText("");
        
        ---------------Excepcoiones----------
        
        try {

            System.out.print("Ingrese el primer valor: ");
            int valor1 = scan.nextInt();

            System.out.print("Ingrese el segundo valor: ");
            int valor2 = scan.nextInt();
            
            int cociente = valor1/valor2;
            System.out.println("El valor del cociente es: "+ cociente);

        } catch (InputMismatchException  e) {
            System.out.println("No sea Pendejo eso es una letra no un numero ! :v");
            
        } catch (ArithmeticException m) {
            System.out.println("No sea gil no se divide para cero ! :v");
            
        }
        
        ------------------------------------------------------------------------
        ------------archivos importar clase igial 
        
        package ******nombrepaquete-****
        
        
        import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsControlador {
    
    private void crearFichero(String nombreFichero){
        ObjectOutputStream oos;

        try{
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));        
            oos.close();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
    
    public void escribirObjeto(String nombreFichero, ArrayList<Object> elementos){
        System.out.println("llega");
        try{
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            for(int i = 0; i < elementos.size() ; i++){
                Object elemento = new Object();
                elemento = elementos.get(i);
                oos.writeObject(elemento);
                System.out.println(elemento.toString());
            }
            oos.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex);
        }
    
    }
    
    public ArrayList<Object> extraerObjetos(String nombreFichero){
        ArrayList<Object> elementos = new ArrayList<>();
        
        try{
            ObjectInputStream ois;
            FileInputStream fi = new FileInputStream(nombreFichero);
            ois = new ObjectInputStream(fi);
            
            Object aux = ois.readObject();
            while(aux!= null){
                elementos.add(aux);
                aux = ois.readObject();
            }
            ois.close();
        
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no existe, lo voy a crear.");
            crearFichero(nombreFichero);
        }catch (EOFException e1)
        {
            //System.out.println ("Fin de fichero");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        return elementos;
    }
    
}
        ----------------------------------------------------------------   
        usar esto en la clase que creamos lo demas>>>>>
        ClsControlador controller = new ClsControlador();
        listaMaterias = controller.extraerObjetos("materias.dat");
        
        
        
        ****en caso de no cachar*****
        https://github.com/POO-2018A/Clase-29-Ejemplo-Archivos/blob/master/Matricula/src/matricula/Matricula.java
        
        
        --------------funciones importantes----------------
        public void limpiar(){
        txtnombre.setText(null);
        txtcedula.setText(null);
        btnregistrar.setEnabled(true);
    }
    
    public void llenarCombo(){
        if(estudiantes.size() > 0){
            cmbestudiantes.setEnabled(true);
            estudiantes = controller.extraerObjetos("estudiantes.dat");
            cmbestudiantes.setModel(new javax.swing.DefaultComboBoxModel(estudiantes.toArray()));
        }else{
            cmbestudiantes.setEnabled(false);
        }
    }
    
    public void llenarGrid(){
        if(estudiantes.size() > 0){
            ClsEstudiante est = new ClsEstudiante();
            DefaultTableModel model = (DefaultTableModel) jtbestudiantes.getModel();
            for(int i = 0; i < estudiantes.size(); i ++){
                est = (ClsEstudiante) estudiantes.get(i);
                Object estudiantesG [] = {est.getId(),est.getNombre(),est.getCedula(),est.getEstado()};
                model.insertRow(i, estudiantesG);
            }
        }
    }
        
        
        
        
        *******************ver CRUD******************
        ---agregar algo ---
        System.out.println("registra");
        cont++;
        ClsEstudiante estudiante = new ClsEstudiante(cont, txtnombre.getText(),txtcedula.getText());
        estudiantes.add(estudiante);
        controller.escribirObjeto("estudiantes.dat", estudiantes);
        estudiantes = controller.extraerObjetos("estudiantes.dat");
        limpiar();
        llenarCombo();
        Object estudiantesG [] = {estudiante.getId(),estudiante.getNombre(),estudiante.getCedula(),estudiante.getEstado()};
        DefaultTableModel model = (DefaultTableModel) jtbestudiantes.getModel();
        model.addRow(estudiantesG);
        
        
        
        */
        
        
       /* 
        ***** bajo el public static void main*****
        
        Integer numero =0;// tipo de varible
        
        Scanner.sc = new Scanner (System.in);
        System.out.println("Ingrese el numero ");
        numero = sc.nextInt();*/
       
       /*ARREGLOS DEFINIDOS*/
     /*  
       int arreglo []= {1,2,3,4};
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
       
        
     String dias[];
     dias = new String [7];//como desee declarar 
     String meses []=new String [12];
     meses [0]="enero";
     meses [1]="febr";
     meses [3]= "marzo";
       */
     /*******arreglos x teclado*******/
   /*  
     int cant=0;
     int arreglo[];
     
     Scanner sc = new Scanner (System.in);
        System.out.println("ingrese el tamaño de arreglo");
        cant = sc.nextInt();
        arreglo = new int [cant];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("valor["+i+"]");
            arreglo [i]=sc.nextInt();
                        
        }*/
   
        System.out.println("Hola");
        
        
        
    }
    
}
