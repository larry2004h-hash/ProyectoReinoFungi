package LaboratorioFungi.pkSerViviente;

public abstract class SerVivo {

    private boolean estaVivo;

    public SerVivo(){
        this.setEstaVivo(true);
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    
}
