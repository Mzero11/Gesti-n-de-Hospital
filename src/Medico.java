import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona {
    private String especialidad;
    private List<Paciente> pacientesAsignados;

    public Medico(String nombre, int edad, Genero genero, String especialidad) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
        this.pacientesAsignados = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public List<Paciente> consultarPacientesAsignados() {
        return pacientesAsignados;
    }

    public void asignarPaciente(Paciente paciente) {
        pacientesAsignados.add(paciente);
    }

    public void desasignarPaciente(Paciente paciente) {
        pacientesAsignados.remove(paciente);
    }
}
