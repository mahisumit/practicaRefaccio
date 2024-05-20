public class Client {
    private String nom;
    private String cognom;

    public Client(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
    }

    public String obtenirNomComplet() {
        return nom + " " + cognom;
    }
}
