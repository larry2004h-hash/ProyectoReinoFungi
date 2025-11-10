package LaboratorioFungi.pkSerViviente.pkReinoFungi;

import LaboratorioFungi.pkSerViviente.serVivo;

public abstract class Fungi extends serVivo {

    private String nombreCientifico;
    private Boolean esEucariota = true;
    private String nutricion = "heterotrofo absortivo";
    private String reproduccion = "esporas";
    private String habitat;
    private Float nivelHumedad;
    private Float temperaturaIdeal;

    public Fungi(String nombreCientifico) {
        super();
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Float getNivelHumedad() {
        return nivelHumedad;
    }

    public void setNivelHumedad(Float nivelHumedad) {
        this.nivelHumedad = nivelHumedad;
    }

    public Float getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(Float temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public String getNutricion() {
        return nutricion;
    }

    public Boolean getEsEucariota() {
        return esEucariota;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void reproducir() {
        System.out.println("El hongo se está reproduciendo");
    }

    public void absorberNutrientes() {
        System.out.println("El hongo se está nutriendo");
    }

    public void descomponer() {
        System.out.println("El hongo está descomponiendo");
    }

    public void intercambiarNutriente(Fungi otro) {
        System.out.println("El hongo " + getNombreCientifico() +
                " está intercambiando nutrientes con " +
                otro.getNombreCientifico());
    }
}
