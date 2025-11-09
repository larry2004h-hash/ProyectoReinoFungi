package LaboratorioFungi.Humano;

public class Recolector extends Persona {
    public Recolector(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    public Recolector(String nombre, String apellido) {
        super(nombre, apellido);
    }

    private int muestraRecolectada;
    private int muestrasRecolectadas;
    
    public void recolectarMuestra(String nombreHongo) {
        System.out.println("El recolector está recolectando una muestra de hongo...");
        muestraRecolectada++;
        System.out.println("Recolector " + getNombre() + " " + getApellido() + " ha recolectado una muestra. Total muestras: " + muestraRecolectada);
    }

    public void entregarMuestras() {
        System.out.println("El recolector está entregando las muestras recolectadas...");
        muestrasRecolectadas += muestraRecolectada;
        System.out.println("Recolector " + getNombre() + " " + getApellido() + " ha entregado " + muestraRecolectada + " muestras. Total entregadas: " + muestrasRecolectadas);
        muestraRecolectada = 0; // Reset the count after delivery
    }

    // Getters and Setters
    public int getMuestraRecolectada() {
        return muestraRecolectada;
    }

    public void setMuestraRecolectada(int muestraRecolectada) {
        this.muestraRecolectada = muestraRecolectada;
    }



}
