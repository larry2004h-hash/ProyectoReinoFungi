package LaboratorioFungi;

public class App {
    public static void main(String[] args) {
        System.out.println("\n\n==========================================");
        System.out.println("      Escuela Politécnica Nacional");
        System.out.println("      Proyecto: Reinos --Reino Fungi");
        System.out.println("Grupo: 4");
        System.out.println("Integrantes:");
        System.out.println("-Jhoan Patricio Sasnalema De La Cruz\nMateo Sebastian Rios Taco\nDeybid Leonardo Roman Marcillo");
        System.out.println("==========================================\n");

        AppLaboratorioFungi app = new AppLaboratorioFungi();
        app.iniciarLaboratorio();
        app.registrarResultado();
        app.realizarPago();
    }

}