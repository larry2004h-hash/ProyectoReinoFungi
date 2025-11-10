
package LaboratorioFungi;

public class DataFast {

    // Atributos
    private String nombreEmpresa = "DataFast Ecuador";
    private String metodoPago; // efectivo o transferencia
    private double monto;
    private String estadoTransaccion; // "Pendiente", "Aprobada", "Rechazada"

    // Constructor
   public DataFast(double monto, String metodoPago) {
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estadoTransaccion = "Pendiente";
    }

    // Métodos
    public boolean procesarPago() {
        if (monto <= 0) {
            estadoTransaccion = "Rechazada";
            System.out.println("Error: Monto inválido para procesar el pago.");
            return false;
        }


        if (metodoPago.equalsIgnoreCase("efectivo") || metodoPago.equalsIgnoreCase("transferencia")) {
            estadoTransaccion = "Aprobada";
            System.out.println("Pago realizado exitosamente por " + metodoPago + ".");
            mostrarRecibo();
            return true;
        } else {
            estadoTransaccion = "Rechazada";
            System.out.println("Método de pago no válido.");
            return false;
        }
    }

    public void mostrarRecibo() {
        
        System.out.println("------ RECIBO DATAFAST ------");
        System.out.println("Empresa: " + nombreEmpresa);
        System.out.println("Método de pago: " + metodoPago);
        System.out.println("Monto: $" + monto);
        System.out.println("Estado: " + estadoTransaccion);
        System.out.println("-----------------------------");
    }

    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }
}
