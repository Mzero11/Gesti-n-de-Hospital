import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Hospital
        Hospital hospital = new Hospital("Hospital XYZ", "Dirección 123", "123-456-789");

        // Crear médicos
        Medico medico1 = new Medico("Dr. Juan", 35, Genero.MASCULINO, "Cardiología");
        Medico medico2 = new Medico("Dra. María", 40, Genero.FEMENINO, "Pediatría");

        // Agregar médicos al hospital
        hospital.agregarMedico(medico1);
        hospital.agregarMedico(medico2);

        // Crear pacientes
        Paciente paciente1 = new Paciente("Hector", 25, Genero.MASCULINO, "Historia clínica de Hector", medico1);
        Paciente paciente2 = new Paciente("Luisa", 30, Genero.FEMENINO, "Historia clínica de Luisa", medico2);
        Paciente paciente3 = new Paciente("Erica", 40, Genero.FEMENINO, "Historia clínica de Ana", medico2);

        // Agregar pacientes al hospital
        hospital.agregarPaciente(paciente1);
        hospital.agregarPaciente(paciente2);
        hospital.agregarPaciente(paciente3);

        // Consultar los pacientes asignados a cada médico
        System.out.println("Pacientes asignados al Dr. Juan:");
        List<Paciente> pacientesAsignadosMedico1 = medico1.consultarPacientesAsignados();
        for (Paciente paciente : pacientesAsignadosMedico1) {
            System.out.println("Paciente " + paciente.getNombre());
        }

        System.out.println("\nPacientes asignados a la Dra. María:");
        List<Paciente> pacientesAsignadosMedico2 = medico2.consultarPacientesAsignados();
        for (Paciente paciente : pacientesAsignadosMedico2) {
            System.out.println("Paciente " + paciente.getNombre());
        }

        // Consultar información de la historia clínica de cada paciente
        System.out.println("\nInformación de la historia clínica de cada paciente:");
        for (Paciente paciente : hospital.getPacientes()) {
            String historiaClinica = paciente.consultarHistoriaClinica();
            System.out.println("Historia clínica de " + paciente.getNombre() + ": " + historiaClinica);
        }
    }
}

