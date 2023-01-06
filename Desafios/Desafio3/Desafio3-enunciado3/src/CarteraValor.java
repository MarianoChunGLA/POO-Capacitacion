import java.util.List;

public class CarteraValor {
    private List<Valor> valores;

    public CarteraValor(List<Valor> valores) {
        this.valores = valores;
    }

    public void agregarValor(Valor valor) {
        valores.add(valor);
    }

    public void quitarValor(Valor valor) {
        valores.remove(valor);
    }

    public List<Valor> getValores() {
        return valores;
    }

}
