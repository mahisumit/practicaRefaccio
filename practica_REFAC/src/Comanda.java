import java.util.List;

public class Comanda {
    private List<LiniaComanda> liniesComanda;
    private double taxaImpost;

    public Comanda(List<LiniaComanda> liniesComanda, double taxaImpost) {
        this.liniesComanda = liniesComanda;
        this.taxaImpost = taxaImpost;
    }

    public double calcularPreuTotal() {
        double subtotal = 0.0;
        for (LiniaComanda linia : liniesComanda) {
            subtotal += linia.getPreu();
        }
        double impost = subtotal * taxaImpost;
        return subtotal + impost;
    }
}
