

public class Paciente extends Persona {
    private String historiaClinica;
    private Medico medicoAsignado;

    public Paciente(String nombre, int edad, Genero genero, String historiaClinica, Medico medicoAsignado) {
        super(nombre, edad, genero);
        this.historiaClinica = historiaClinica;
        this.medicoAsignado = medicoAsignado;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public String consultarHistoriaClinica() {
        return historiaClinica;
    }
}
