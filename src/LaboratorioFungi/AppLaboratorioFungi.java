package LaboratorioFungi;

import LaboratorioFungi.pkHumano.Micologo;
import LaboratorioFungi.pkHumano.Recolector;
import LaboratorioFungi.pkSerViviente.pkReinoFungi.SaccharomycesCerevisiae;
import LaboratorioFungi.pkSerViviente.pkReinoFungi.ChampinonComun;
import LaboratorioFungi.pkSerViviente.pkReinoFungi.PenicilliumChrysogenum;

public class AppLaboratorioFungi {

    Micologo micologo1;
    Recolector recolector1;
    Recolector recolector2;

    SaccharomycesCerevisiae levadura1;
    ChampinonComun champinon;
    PenicilliumChrysogenum penicillium;

    public AppLaboratorioFungi() {
        System.out.println("Construyendo el Laboratorio Fungi...");
        micologo1 = new Micologo("1234567890", "Juan", "Perez");
        recolector1 = new Recolector("Carlos", "Ramirez");
        recolector2 = new Recolector("0987654321", "Ana", "Gomez");
        levadura1 = new SaccharomycesCerevisiae("Saccharomyces cerevisiae", 5.0f, "Fermentación alcohólica");
        champinon = new ChampinonComun("Agaricus bisporus", 7.5f, 4.0f);
        penicillium = new PenicilliumChrysogenum("Septada", 2.5f);
    }

    public void iniciarLaboratorio() {
        System.out.println("Iniciando el Laboratorio de Fungi...");
        micologo1.setLogin("micologo_jhoan");
        micologo1.setClave("micologia123");
        recolector2.recolectarMuestra("Cantharellus cibarius");
        micologo1.cultivarHongos();
        System.out.println("_______________________________________________________________________________________________________________");
        
        levadura1.fermentar();
        levadura1.producirEtanol();
        levadura1.reproducirsePorGemacion();
        levadura1.producirCO2();
    
        System.out.println("_______________________________________________________________________________________________________________");
        
        champinon.liberarEsporas();
        champinon.cosechar();
        if (champinon.isComestible()) {
            System.out.println("¿Es comestible? Sí, es comestible");
        } else {
            System.out.println("¿Es comestible? No, no es comestible");
        }
        System.out.println("_______________________________________________________________________________________________________________");
        
        penicillium.formarMicelio();
        penicillium.sintetizarPenicilina();

        if (penicillium.getProduceAntibiotico()) {
            System.out.println("Produce antibiótico:" + "Sí");
        } else {
            System.out.println("Produce antibiótico:" + "No");
        }
       
    }
}

