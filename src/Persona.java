

public class Persona {

    private String nombre;
    private int edad;
    private Genero genero;

    public Persona(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public String consultarDatosPersonales() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }

}
