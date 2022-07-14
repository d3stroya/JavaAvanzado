package creacionales.prototype.ejemplo1;

public class Cohete implements Cloneable {
    // ATRIBUTOS
    String colorTecho;
    String colorCuerpo;
    int alto;
    int diametro;
    boolean motor;

    // CONSTRUCTOR
    public Cohete() {}

    // MÉTODO
    public Cohete clonar() throws CloneNotSupportedException {
        return (Cohete)this.clone();
    }
}
