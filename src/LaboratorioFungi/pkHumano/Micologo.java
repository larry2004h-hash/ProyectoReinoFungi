package LaboratorioFungi.pkHumano;

public class Micologo extends Persona {
    public Micologo(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }
    public Micologo(String nombre, String apellido) {
        super(nombre, apellido);
    }

    private String login;
    private String password;

    public boolean setClave(String password) {
        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return false;
        }
        setPassword(password);
        System.out.println("Contraseña establecida correctamente.");
        return true;
    }

    public void cultivarHongos() {
        System.out.println("El micólogo está cultivando hongos.");
        System.out.println("Micólogo " + getNombre() + " " + getApellido() + " ha cultivado hongos exitosamente.");
    }

    // Getters and Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
