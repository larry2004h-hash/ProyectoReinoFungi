package LaboratorioFungi.pkSerViviente.pkReinoFungi;

public abstract class Levadura extends Fungi {

    private Float tamanoCelular;
    private String metabolismo;

    public Levadura(String nombreCientifico, Float tamanoCelular, String metabolismo) {
        super(nombreCientifico);
        this.tamanoCelular = tamanoCelular;
        this.metabolismo = metabolismo;
    }

    public Float getTamanoCelular() {
        return tamanoCelular;
    }

    public void setTamanoCelular(Float tamanoCelular) {
        this.tamanoCelular = tamanoCelular;
    }

    public String getMetabolismo() {
        return metabolismo;
    }

    public void setMetabolismo(String metabolismo) {
        this.metabolismo = metabolismo;
    }

    public void fermentar() {
        System.out.println("La levadura " + getNombreCientifico() + " está fermentando");
    }
}

