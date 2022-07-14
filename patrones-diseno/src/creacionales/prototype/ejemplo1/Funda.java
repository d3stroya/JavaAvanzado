package creacionales.prototype.ejemplo1;

public class Funda implements Cloneable {
    // ATRIBUTOS
    int alto;
    int ancho;
    String color;

    // CONSTRUCTOR
    public Funda() {}

    // MÉTODO
    public Funda clonar() throws CloneNotSupportedException {
        return (Funda)this.clone();
    }
}
