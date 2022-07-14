package creacionales.prototype;
// También se puede hacer con una interfaz de Java
public class Moto implements Cloneable {
    public String marca;
    public String modelo;
    int cc;

    public Moto() {}

    // Se simplifica esta parte
    public Moto clonar() throws CloneNotSupportedException {
        return (Moto)this.clone();
    }
}
