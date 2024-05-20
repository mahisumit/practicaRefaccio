public class Persona {
    private String nom;
    private String edat;
    private String pais;
    private String ciutat;
    private String carrer;
    private String casa;
    private String barri;

    public String obtenirAdrecaCompleta() {
        StringBuilder resultat = new StringBuilder();
        return resultat
                .append(pais)
                .append(", ")
                .append(ciutat)
                .append(", ")
                .append(carrer)
                .append(", ")
                .append(casa)
                .append(" ")
                .append(barri).toString();
    }
}
