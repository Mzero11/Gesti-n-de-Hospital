import java.util.List;
import java.util.ArrayList;

import java.util.List;

public class Hospital {
    private final String nombre;
    private String direccion;
    private String telefono;
    private List<Paciente> pacientes;
    private List<Medico> medicos;

    public Hospital(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pacientes = new ArrayList<>(); // Importa java.util.ArrayList y java.util.List
        this.medicos = new ArrayList<>();
    }

    // Otros métodos de la clase Hospital...

    // Método para obtener la lista de pacientes del hospital
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void eliminarMedico(Medico medico) {
        medicos.remove(medico);
    }
}








