package LaboratorioFungi;

import LaboratorioFungi.pkHumano.Micologo;
import LaboratorioFungi.pkHumano.Recolector;
import LaboratorioFungi.DataFast;


public class AppLaboratorioFungi {

    // Atributos
    Micologo micologo1;
    Recolector recolector1;
    Recolector recolector2;
    DataFast dataFast;

    // Constructor
    public AppLaboratorioFungi() {
        System.out.println("Construyendo el Laboratorio Fungi...");
        micologo1 = new Micologo("1234567890", "Juan", "Perez");
        recolector1 = new Recolector("Carlos", "Ramirez");
        recolector2 = new Recolector("0987654321", "Ana", "Gomez");
        dataFast = new DataFast(  56.00,"efectivo");
    }

    // Método principal del sistema
    public void iniciarLaboratorio() {
        System.out.println("Iniciando el Laboratorio de Fungi...");
        micologo1.setLogin("micologo_jhoan");
        micologo1.setClave("micologia123");
        recolector2.recolectarMuestra("Cantharellus cibarius");
        micologo1.cultivarHongos();
        dataFast.procesarPago();
    }

}
