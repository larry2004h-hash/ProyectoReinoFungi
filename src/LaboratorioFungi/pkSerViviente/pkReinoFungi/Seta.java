package LaboratorioFungi.pkSerViviente.pkReinoFungi;

public abstract class Seta extends Fungi {

    private Float diametroSombrero;
    private Float longitudPie;

    public Seta(String nombreCientifico, Float diametroSombrero, Float longitudPie) {
        super(nombreCientifico);
        this.diametroSombrero = diametroSombrero;
        this.longitudPie = longitudPie;
    }

    public Float getDiametroSombrero() {
        return diametroSombrero;
    }

    public void setDiametroSombrero(Float diametroSombrero) {
        this.diametroSombrero = diametroSombrero;
    }

    public Float getLongitudPie() {
        return longitudPie;
    }

    public void setLongitudPie(Float longitudPie) {
        this.longitudPie = longitudPie;
    }

    public void liberarEsporas() {
        System.out.println("La seta " + getNombreCientifico() + " está liberando esporas.");
    }
}

