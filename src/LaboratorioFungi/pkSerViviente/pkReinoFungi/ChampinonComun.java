package LaboratorioFungi.pkSerViviente.pkReinoFungi;

public class ChampinonComun extends Seta {

    private boolean comestible = true;

    public ChampinonComun(String nombreCientifico, Float diametroSombrero, Float longitudPie) {
        super(nombreCientifico, diametroSombrero, longitudPie);
    }

    public boolean isComestible() {
        return comestible;
    }

    public void cosechar() {
        System.out.println("El champiñón " + getNombreCientifico() + " ha sido cosechado.");
    }
}