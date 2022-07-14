package creacionales.prototype;
// 4. PROTOTYPE: se clona a sí mismo (estado, atributos, métodos,...). Es como un molde donde puedes hacer un mismo bizcocho pero de diferentes tipos/sabores.
public class Coche {
    public String marca;
    public String modelo;
    int puertas;

    public Coche() {

    }

    public Coche clonar() {
        Coche clon = new Coche();
        clon.marca = marca;
        clon.modelo = modelo;
        clon.puertas = puertas;

        return clon;
    }
}
