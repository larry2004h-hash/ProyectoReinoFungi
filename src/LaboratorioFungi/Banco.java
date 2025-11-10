package LaboratorioFungi;

public class Banco {
    private String nombreBanco = "Banco Pichincha";
    private String metodoPago;
    private Double monto;
    private String estadoTransaccion;

    public Banco(double monto, String metodoPago) {
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estadoTransaccion = "Pendiente";
    }

    public boolean procesarPago() {
        if (monto <= 0) {
            estadoTransaccion = "Rechazada";
            System.out.println("Error: Monto inválido.");
            return false;
        }
        if (metodoPago.equalsIgnoreCase("tarjeta") || metodoPago.equalsIgnoreCase("transferencia")) {
            estadoTransaccion = "Aprobada";
            System.out.println("Pago realizado exitosamente por " + metodoPago);
            mostrarRecibo();
            return true;
        } else {
            estadoTransaccion = "Rechazada";
            System.out.println("Método de pago no válido.");
            return false;
        }
    }

    public void mostrarRecibo() {
        System.out.println("------ RECIBO BANCO ------");
        System.out.println("Banco: " + nombreBanco);
        System.out.println("Método: " + metodoPago);
        System.out.println("Monto: $" + monto);
        System.out.println("Estado: " + estadoTransaccion);
        System.out.println("--------------------------");
    }
}
