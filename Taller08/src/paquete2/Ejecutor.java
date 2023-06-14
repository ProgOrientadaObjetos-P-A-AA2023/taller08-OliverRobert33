package paquete2;

import java.util.Scanner;
//import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;
import paquete2.*;

public class Ejecutor {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        boolean bandera = true;
        String op1;
        while (bandera) {
            System.out.println("Ingrese la opcion:\n"
                    + "1) Docente Nombramiento\n"
                    + "2) Docente Factura\n");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    String [] datos = docente();
                    docenteNombramiento(datos);
                    break;
                case 2:
                    datos = docente();
                    docenteFactura(datos);
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
            entrada.nextLine();
            System.out.println("Ingrese 'SI' si desea salir del proceso: ");
            op1 = entrada.nextLine();

            if (op1.equals("SI")) {
                bandera = false;
            }
        }

    }

    public static String[] docente() {
        entrada.nextLine();

        String[] datos = new String[2];
        System.out.println("Ingrese el Nombre del Docente");
        datos[0] = entrada.nextLine();

        System.out.println("Ingrese la Cedula del Docente");
        datos[1] = entrada.nextLine();

        return datos;
    }

    public static void docenteNombramiento(String[] datos) {

        DocenteNombramiento docenteN = new DocenteNombramiento();

        System.out.println("Ingrese el Valor de Sueldo:");
        double valorSueldo = entrada.nextDouble();
        System.out.println("Ingrese el Valor hora Extra:");
        double valorHExtra = entrada.nextDouble();
        System.out.println("Ingrese el numero de horas Extras:");
        int horasExtra = entrada.nextInt();

        docenteN.establecerNombre(datos[0]);
        docenteN.establecerCedula(datos[1]);
        docenteN.establecerValorSueldo(valorSueldo);
        docenteN.establecerValorHExtra(valorHExtra);
        docenteN.establecerNumeroHExtra(horasExtra);
        docenteN.calcularSueldo();

        System.out.println(docenteN);
        System.out.println("-----------------------------");
    }

    public static void docenteFactura(String []datos) {

        DocenteFactura docenteFactura = new DocenteFactura();

        System.out.println("Ingrese el valor de factura: ");
        double valorfactura = entrada.nextDouble();
        docenteFactura.establecerNombre(datos[0]);
        docenteFactura.establecerCedula(datos[1]);
        docenteFactura.establecerValorfactura(valorfactura);
        docenteFactura.establecerIvaDescuento();
        docenteFactura.calcularValorCancelar();
        System.out.println("\n" + docenteFactura);
        System.out.println("-----------------------------");

    }
}
