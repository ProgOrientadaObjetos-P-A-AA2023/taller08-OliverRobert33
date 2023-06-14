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
                    docenteNombramiento();
                    break;
                case 2:
                    docenteFactura();
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

    public static void docente() {
        entrada.nextLine();
//        Docente d = new Docente();

        System.out.println("Ingrese el Nombre del Docente");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la Cedula del Docente");
        String cedula = entrada.nextLine();

//        d.establecerNombre(nombre);
//        d.establecerCedula(cedula);

    }

    public static void docenteNombramiento() {

        DocenteNombramiento docenteN = new DocenteNombramiento();
        entrada.nextLine();

        System.out.println("Ingrese el Nombre del Docente");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la Cedula del Docente");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese el Valor de Sueldo:");
        double valorSueldo = entrada.nextDouble();
        System.out.println("Ingrese el Valor hora Extra:");
        double valorHExtra = entrada.nextDouble();
        System.out.println("Ingrese el numero de horas Extras:");
        int horasExtra = entrada.nextInt();

        docenteN.establecerNombre(nombre);
        docenteN.establecerCedula(cedula);
        docenteN.establecerValorSueldo(valorSueldo);
        docenteN.establecerValorHExtra(valorHExtra);
        docenteN.establecerNumeroHExtra(horasExtra);
        docenteN.calcularSueldo();

        System.out.println(docenteN);
        System.out.println("-----------------------------");
    }

    public static void docenteFactura() {

        DocenteFactura docenteFactura = new DocenteFactura();

//        entrada.nextLine();
        docente();
//        System.out.println("Ingrese el Nombre del Docente");
        String nombre = entrada.nextLine();
//        System.out.println("Ingrese la Cedula del Docente");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese el valor de factura: ");
        double valorfactura = entrada.nextDouble();
        docenteFactura.establecerNombre(nombre);
        docenteFactura.establecerCedula(cedula);
        docenteFactura.establecerValorfactura(valorfactura);
        docenteFactura.establecerIvaDescuento();
        docenteFactura.calcularValorCancelar();
        System.out.println("\n" + docenteFactura);
        System.out.println("-----------------------------");

    }
}
