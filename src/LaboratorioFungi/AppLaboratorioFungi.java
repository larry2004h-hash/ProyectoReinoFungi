package LaboratorioFungi;
import LaboratorioFungi.Humano.Micologo;
import LaboratorioFungi.Humano.Recolector;
import LaboratorioFungi.Humano.Persona;


public class AppLaboratorioFungi {

AppLaboratorioFungi iniciaAppLaboratorioFungi = new AppLaboratorioFungi();
Micologo micologo1 = new Micologo("1234567890", "Juan", "Perez");
Micologo micologo2 = new Micologo("Maria", "Lopez");
Recolector recolector1 = new Recolector("0987654321", "Ana", "Gomez");
Recolector recolector2 = new Recolector("Carlos", "Ramirez");

public AppLaboratorioFungi() {
    micologo1.setClave("micologia123");
    micologo2.setClave("hongos456");

    recolector1.recolectarMuestra("Amanita muscaria");
    recolector1.recolectarMuestra("Boletus edulis");
    recolector1.entregarMuestras();

    recolector2.recolectarMuestra("Cantharellus cibarius");
    recolector2.entregarMuestras();

    micologo1.cultivarHongos();
    micologo2.cultivarHongos();

}}