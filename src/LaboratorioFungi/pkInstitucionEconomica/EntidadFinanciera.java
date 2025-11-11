package LaboratorioFungi.pkInstitucionEconomica;

public abstract class EntidadFinanciera {
    private String metodoPago;
    private double monto;
    private String estadoTransaccion;


    public EntidadFinanciera(double monto, String metodoPago) {
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estadoTransaccion = "Pendiente";
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    
    public abstract boolean procesarPago();

    public void mostrarRecibo() {
        System.out.println("Método: " + metodoPago);
        System.out.println("Monto: $" + monto);
        System.out.println("Estado: " + estadoTransaccion);
    }
}