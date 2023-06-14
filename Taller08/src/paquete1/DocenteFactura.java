package paquete1;

public class DocenteFactura extends Docente{

    private double valorfactura;
    private double ivaDescuento = 0.12;
    private double valorCancelar;

    public void establecerValorfactura(double vF) {
        valorfactura = vF;
    }

    public void establecerIvaDescuento() {
        ivaDescuento = 0.12 * valorfactura;
    }

    public void calcularValorCancelar() {
        valorCancelar = valorfactura - ivaDescuento;
    }

    public double obtenerValorfactura() {
        return valorfactura;
    }

    public double obtenerIvaDescuento() {
        return ivaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString(){
    
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Factura:%.2f\n"
                + "Valor Descuento:%.2f\n"
                + "Valor Cancelar: %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerValorfactura(),
                obtenerIvaDescuento(),
                obtenerValorCancelar());
        
        return cadena;
    }
    
    
}
