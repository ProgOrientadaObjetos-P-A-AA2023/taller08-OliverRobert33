package paquete1;

public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHExtra;
    private int numeroHExtra;
    private double sueldo;


    public void establecerValorSueldo(double vS) {
        valorSueldo = vS;
    }

    public void establecerValorHExtra(double vE) {
        valorHExtra = vE;
    }

    public void establecerNumeroHExtra(int hE) {
        numeroHExtra = hE;
    }

    public void calcularSueldo() {
        sueldo = valorHExtra + (valorHExtra * numeroHExtra);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHExtra() {
        return valorHExtra;
    }

    public int obtenerNumeroHExtra() {
        return numeroHExtra;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
    
    @Override
    public String toString(){
    String cadena = String.format("Nombre: %s\n"
            + "Cedula: %s\n"
            + "Valor Sueldo: %.2f\n"
            + "Valor Horas Extras %.2f\n"
            + "Numero Horas Extras: %d\n"
            + "Sueldo Total: %.2f",
            obtenerNombre(),
            obtenerCedula(),
            obtenerValorSueldo(), 
            obtenerValorHExtra(),
            obtenerNumeroHExtra(),
            obtenerSueldo());
    
    return cadena;
    }
    
    

}
