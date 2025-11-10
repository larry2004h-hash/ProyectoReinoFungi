package LaboratorioFungi.pkSerViviente.pkReinoFungi;

public class PenicilliumChrysogenum extends Moho {

    private Boolean produceAntibiotico = true;

    public PenicilliumChrysogenum(String tipoHifa, Float velocidadCrecimiento) {
        super("Penicillium chrysogenum", tipoHifa, velocidadCrecimiento);
    }

    public Boolean getProduceAntibiotico() {
        return produceAntibiotico;
    }

    public void sintetizarPenicilina() {
        System.out.println("El Penicillium chrysogenum está sintetizando penicilina");
    }

    public void inhibirCrecimiento(Moho otro) {
        System.out.println("El Penicillium chrysogenum inhibe el crecimiento del moho " + otro.getNombreCientifico());
    }
}