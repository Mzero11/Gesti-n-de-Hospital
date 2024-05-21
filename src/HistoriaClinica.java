import java.util.List;
import java.util.ArrayList;

public class HistoriaClinica {
    private String id;
    private List<EntradaHistorial> entradas;

    public HistoriaClinica(String id) {
        this.id = id;
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(EntradaHistorial entrada) {
        entradas.add(entrada);
    }
}
