package creacionales.singleton.ejemplo2;

public class Gobierno {
    // Atributo de clase
    private static Gobierno gobierno;

    // Atributo partido
    private String partido;

    // Constructor privado
    private Gobierno() {}

    // Getter y setter
    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    // Método que modifica la instancia única
    public static Gobierno getInstance() {
        if(gobierno == null) {
            gobierno = new Gobierno();
        }
        return gobierno;
    }
}
