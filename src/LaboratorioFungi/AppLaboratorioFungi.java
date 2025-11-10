package LaboratorioFungi;

import java.util.Scanner;

import LaboratorioFungi.pkHumano.Micologo;
import LaboratorioFungi.pkHumano.Recolector;
import LaboratorioFungi.pkSerViviente.pkReinoFungi.SaccharomycesCerevisiae;
import LaboratorioFungi.pkSerViviente.pkReinoFungi.ChampinonComun;
import LaboratorioFungi.pkSerViviente.pkReinoFungi.Moho;
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
    }

    public void registrarResultado() {
        System.out.println("Registrando resultados de los análisis ");
        System.out.println("_______________________________________________________________________________________________________________");
        System.out.println("Registro resultados Levadura");
        System.out.println("_______________________________________________________________________________________________________________");
        levadura1.fermentar();
        levadura1.producirEtanol();
        levadura1.reproducirsePorGemacion();
        levadura1.producirCO2();

        System.out.println("_______________________________________________________________________________________________________________");
        System.out.println("Registro resultados Seta");
        System.out.println("_______________________________________________________________________________________________________________");
        champinon.liberarEsporas();
        champinon.cosechar();
        if (champinon.isComestible()) {
            System.out.println("¿Es comestible? Sí, es comestible");
        } else {
            System.out.println("¿Es comestible? No, no es comestible");
        }
        System.out.println("_______________________________________________________________________________________________________________");
        System.out.println("Registro resultados Moho");
        System.out.println("_______________________________________________________________________________________________________________");
        penicillium.formarMicelio();
        penicillium.sintetizarPenicilina();

        Moho otroMoho = new Moho("Aspergillus", "Septada", 3.0f) {
            @Override
            public void formarMicelio() {
                System.out.println("El moho Aspergillus está formando micelio");
            }
        };
        penicillium.inhibirCrecimiento(otroMoho);
        if (penicillium.ProduceAntibiotico()) {
            System.out.println("Produce antibiótico: Sí");
        } else {
            System.out.println("Produce antibiótico: No");
        }
        System.out.println("_______________________________________________________________________________________________________________");
    }

    public void realizarPago() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== SISTEMA DE PAGO ===");
        System.out.print("Monto: ");
        double monto = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

    
        System.out.println("\nSeleccione el método de pago:");
        System.out.println("a) Efectivo");
        System.out.println("b) Transferencia");
        System.out.println("c) Tarjeta");
        System.out.print("Opción: ");
        char metodoChar = sc.next().charAt(0);
        sc.nextLine(); // limpiar buffer

        String metodoPago;
        switch (Character.toLowerCase(metodoChar)) {
            case 'a':
                metodoPago = "efectivo";
                break;
            case 'b':
                metodoPago = "transferencia";
                break;
            case 'c':
                metodoPago = "tarjeta";
                break;
            default:
                System.out.println("Método no válido.");
                return;
        }

        // Menú para plataforma
        System.out.println("\nSeleccione la plataforma:");
        System.out.println("1) DataFast");
        System.out.println("2) Banco");
        System.out.print("Opción: ");
        char plataformaChar = sc.next().charAt(0);

        if (plataformaChar == '1') {
            new DataFast(monto, metodoPago).procesarPago();
        } else if (plataformaChar == '2') {
            new Banco(monto, metodoPago).procesarPago();
        } else {
            System.out.println("Opción no válida.");
        }
    }
}