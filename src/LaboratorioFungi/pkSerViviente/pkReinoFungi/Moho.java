package LaboratorioFungi.pkSerViviente.pkReinoFungi;

public abstract class Moho extends Fungi {

    private String tipoHifa;
    private Float velocidadCrecimiento;

    public Moho(String nombreCientifico, String tipoHifa, Float velocidadCrecimiento) {
        super(nombreCientifico);
        this.tipoHifa = tipoHifa;
        this.velocidadCrecimiento = velocidadCrecimiento;
    }

    public String getTipoHifa() {
        return tipoHifa;
    }

    public void setTipoHifa(String tipoHifa) {
        this.tipoHifa = tipoHifa;
    }

    public Float getVelocidadCrecimiento() {
        return velocidadCrecimiento;
    }

    public void setVelocidadCrecimiento(Float velocidadCrecimiento) {
        this.velocidadCrecimiento = velocidadCrecimiento;
    }

    public void formarMicelio() {
        System.out.println("El moho " + getNombreCientifico() + " está formando micelio.");
    }
}

