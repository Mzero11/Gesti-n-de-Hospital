
import java.util.Date;


public class EntradaHistorial {
    private Date fecha;
    private String motivo;
    private String diagnostico;
    private String tratamiento;

    public EntradaHistorial(Date fecha, String motivo, String diagnostico, String tratamiento) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
}
