/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_progra2_evasalgado_12241235;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author evaja
 */
public class Tarea1_Progra2_EvaSalgado_12241235 {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static ArrayList<celular> listacelular = new ArrayList<>();
    static int contcelu = 1; //contador de celulares, el limite son 500

    public static void main(String[] args) throws ParseException {
        int opcion = 0;
        //menu y bienvenida
        System.out.println();
        while (opcion != 5) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(("Bienvenido\n\n---Menu---\n\n1. Agregar un celular\n2. Modificar celular\n3. Listar un celular\n4. Eliminar un celular\n5. Salir")));//ingrese el numero de la opcion del menu
            switch (opcion) {
                case 1: //agregar un celular
                    AgregarCelular();
                    break;
                case 2://modificar los datos de un celular 
                    ModificarCelular();
                    break;
                case 3://listar celulares
                    System.out.println("Lista de celulares: \n");
                    ListarCelulares();
                    break;
                case 4://eliminar celular de la lista
                    EliminarCelular();
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    System.out.println("Numero Invalido");

            }

        }
    }

    public static void AgregarCelular() throws ParseException {

        if (contcelu <= 500) {

            String marca = JOptionPane.showInputDialog("Ingrese la marca del celular: ");//marca de su celular (samsung, huaweii, apple, etc.)
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del celular: "); //color del modelo
            long precio = Long.parseLong(JOptionPane.showInputDialog("Ingrese el precio del celular: "));//precio del celular
            Color color = JColorChooser.showDialog(null, "Ingrese el color del celular", Color.DARK_GRAY);//color del celular
            //fecha de creacion del articulo
            Date fechacreacion = new Date();
            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");//formato necesitado para la fecha
            fechacreacion = formato.parse(JOptionPane.showInputDialog("Ingrese la fecha de creacion del celular [dd/MM/yyyy]"));
            //fecha de venta de articulo o primer lanzamiento
            Date fechaVenta = new Date();
            DateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");//formato necesitado para la fecha
            fechaVenta = formato2.parse(JOptionPane.showInputDialog("Ingrese fecha de primera venta hecha[dd/MM/yyyy]: "));
            //operador de gsm que utiliza (tigo, claro, verizon, etc.)
            String operador = JOptionPane.showInputDialog("Ingrese la compañia operadora de servicio (tigo,claro,etc.): ");

            celular celagregado = new celular(contcelu, marca, modelo, color, precio, fechacreacion, fechaVenta, operador); //formato necesario para poder añadir el celular a la lista
            listacelular.add(celagregado);
            contcelu++;
        } else {
            System.out.println("Lista llena, elimine un elemento");
        }
    }

    public static void ModificarCelular() throws ParseException {
        if (listacelular.isEmpty()) {
            System.out.println("Lista vacia, debe ingresar un celular");
        } else {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del celular que quiere modificar"));
            for (int i = 0; i < listacelular.size(); i++) {
                if (listacelular.get(i).indicecel == indice) {
                   int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Que aspecto le gustaria cambiar del celular: \n1. Marca\n2. Modelo\n3. Precio\n4. Color\n5. Fecha de creacion\n6. Fecha de venta\n7. Operador"));
                   switch (opcion2){
                       case 1: 
                           String newmarca = JOptionPane.showInputDialog("Ingrese la marca del celular: ");
                           listacelular.get(i).marca = newmarca;
                           System.out.println("Actualizacion completa");
                           break; 
                       case 2:
                           String newmodelo= JOptionPane.showInputDialog("Ingrese el modelo del celular: ");
                           listacelular.get(i).modelo = newmodelo;
                           System.out.println("Actualizacion completa");
                           break; 
                       case 3: 
                           long newPrecio= Long.parseLong(JOptionPane.showInputDialog("Ingrese el precio del celular: "));
                           listacelular.get(i).precio = newPrecio;
                           System.out.println("Actualizacion completa");
                           break; 
                       case 4: 
                           Color newColor= JColorChooser.showDialog(null, "Ingrese el color de su celular", Color.DARK_GRAY);
                           listacelular.get(i).color = newColor;
                           System.out.println("Actualizacion completa");
                           break;
                       case 5: 
                           Date newFechaCreacion = new Date();
                           DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                           newFechaCreacion = formato.parse(JOptionPane.showInputDialog("Ingrese la fecha de creacion[dd/MM/yyyy]:"));
                           listacelular.get(i).fechacreacion = newFechaCreacion;
                           System.out.println("Actualizacion Completada");
                           break; 
                       case 6: 
                           Date newFechaVenta = new Date();
                           DateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
                           newFechaVenta = formato2.parse(JOptionPane.showInputDialog("Ingrese la fecha de Venta[dd/MM/yyyy]:"));
                           listacelular.get(i).fechaVenta = newFechaVenta;
                           System.out.println("Actualizacion Completada");
                           break; 
                       case 7: 
                           String newOperador = JOptionPane.showInputDialog("Ingrese el Operador del celular (tigo,claro,etc.): ");
                           listacelular.get(i).operador = newOperador;
                           System.out.println("Actualizacion completa");
                           break; 
                       default: 
                           System.out.println("Numero invalido");
                           break;
                           
                   }
                }
            }
        }
    }

    public static void ListarCelulares() {
        if (listacelular.isEmpty()) {
            System.out.println("Ingrese celulares primero");
        } else {
            for (int i = 0; i < listacelular.size(); i++) {
                System.out.println(listacelular.get(i));
            }
        }
    }

    public static void EliminarCelular() {
        //para este ocupara especificar el indice del celular en su lista
        if (listacelular.isEmpty()) {
            System.out.println("Lista vacia, ingrese algo");
        } else {
            int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del celular que quiere eliminar"));
            for (int i = 0; i < listacelular.size(); i++) {
                if (listacelular.get(i).indicecel == indice) {
                    listacelular.remove(i);
                    System.out.println("celular removido de la lista correctamente");
                }
            }
        }
    }

}
