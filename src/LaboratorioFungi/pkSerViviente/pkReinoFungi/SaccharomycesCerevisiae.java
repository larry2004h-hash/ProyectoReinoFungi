package LaboratorioFungi.pkSerViviente.pkReinoFungi;

public class SaccharomycesCerevisiae extends Levadura {

    private String usoIndustrial = "Panadería y fermentación";
   private String tipoReporduccion = "Gemación";
    public SaccharomycesCerevisiae(String nombreCientifico, Float tamanoCelular, String metabolismo) {
        super(nombreCientifico, tamanoCelular, metabolismo);
    }

    public String getUsoIndustrial() {
        return usoIndustrial;
    }

    public void setUsoIndustrial(String usoIndustrial) {
        this.usoIndustrial = usoIndustrial;
    }

    public void producirEtanol() {
        System.out.println("La levadura " + getNombreCientifico() +
                " está produciendo etanol para " + usoIndustrial);
    }
    public void producirCO2() {
        System.out.println("La levadura " + getNombreCientifico() +
                "está produciendo CO2 esencial para la panificación.");
    }
    public void reproducirsePorGemacion() {
        System.out.println("La levadura " + getNombreCientifico() +
                "se está reproduciendose por "+tipoReporduccion);
    }
}