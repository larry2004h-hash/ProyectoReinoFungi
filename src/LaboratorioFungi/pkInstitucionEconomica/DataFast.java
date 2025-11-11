package LaboratorioFungi.pkInstitucionEconomica;

public class DataFast extends EntidadFinanciera {
    private String nombreEmpresa = "DataFast Ecuador";

    public DataFast(double monto, String metodoPago) {
        super(monto, metodoPago);
    }

    @Override
    public boolean procesarPago() {
        if (getMonto() <= 0) {
            setEstadoTransaccion("Rechazada");
            System.out.println("Error: Monto inválido para procesar el pago.");
            return false;
        }

        if (getMetodoPago().equalsIgnoreCase("efectivo") || getMetodoPago().equalsIgnoreCase("transferencia")) {
            setEstadoTransaccion("Aprobada");
            System.out.println("Pago realizado exitosamente por " + getMetodoPago() + ".");
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
        System.out.println("------ RECIBO DATAFAST ------");
        System.out.println("Empresa: " + nombreEmpresa);
        super.mostrarRecibo();
        System.out.println("-----------------------------");
    }
}
