package creacionales.prototype.ejemplo1;

public class Corazon implements Cloneable {
    // ATRIBUTOS
    public String color;
    int alto;
    int grosor;
    boolean cara;

    // CONSTRUCTOR
    public Corazon() {}

    // MÉTODO
    public Corazon clonar() throws CloneNotSupportedException {
        return (Corazon)this.clone();
    }
}
