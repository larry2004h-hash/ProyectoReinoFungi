package LaboratorioFungi.pkSerViviente.pkReinoFungi;

public class ChampinonComun extends Seta {

    private Boolean comestible = true;

    public ChampinonComun(String nombreCientifico, Float diametroSombrero, Float longitudPie) {
        super(nombreCientifico, diametroSombrero, longitudPie);
    }

    public Boolean isComestible() {
        return comestible;
    }

    public void cosechar() {
        System.out.println("El champiñón " + getNombreCientifico() + " ha sido cosechado.");
    }
}