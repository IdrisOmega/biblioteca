import java.util.ArrayList;

public class Usuarios {
    String nombre;
String apellido;
int telefono;
String email;
ArrayList<Usuarios> libros_a_devolver;


    public Usuarios(String nombre, String apellido, int telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Usuarios> getLibros_a_devolver() {
        return libros_a_devolver;
    }

    public void setLibros_a_devolver(ArrayList<Usuarios> libros_a_devolver) {
        this.libros_a_devolver = libros_a_devolver;
    }
}
