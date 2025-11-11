package LaboratorioFungi.pkInstitucionEconomica;

public class Banco extends EntidadFinanciera {
    private String nombreBanco = "Banco Pichincha";

    public Banco(double monto, String metodoPago) {
        super(monto, metodoPago);
    }

    @Override
    public boolean procesarPago() {
        if (getMonto() <= 0) {
            setEstadoTransaccion("Rechazada");
            System.out.println("Error: Monto inválido.");
            return false;
        }

        if (getMetodoPago().equalsIgnoreCase("tarjeta") || getMetodoPago().equalsIgnoreCase("transferencia")) {
            setEstadoTransaccion("Aprobada");
            System.out.println("Pago realizado exitosamente por " + getMetodoPago());
            mostrarRecibo();
            return true;
        } else {
            setEstadoTransaccion("Rechazada");
            System.out.println("Método de pago no válido.");
            return false;
        }
    }

    @Override
    public void mostrarRecibo() {
        System.out.println("------ RECIBO BANCO ------");
        System.out.println("Banco: " + nombreBanco);
        super.mostrarRecibo();
        System.out.println("--------------------------");
    }
}