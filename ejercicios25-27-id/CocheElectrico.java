/**
 * TODO: Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno híbrido y aplica el principio de substitución de Liskov (L), las subclases deben ser sustituibles por la superclase coche.
 */

public class CocheElectrico implements Vehiculo, VehiculoElectrico {
    // ATRIBUTOS
    private String motor = "eléctrico";
    private int cargaBateria;
    private String marca;
    private String color;
    int velocidad = 0;
    int puertas;
    int potencia;
    boolean sport;

    // MÉTODOS

    @Override
    public int acelerar() {
        return velocidad +=30;
    }

    @Override
    public int frenar() {
        return velocidad -= 30;
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    public int cargarBateria() {
        return cargaBateria = 100;
    }

    // TO STRING
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motor='" + motor + '\'' +
                ", cargaBateria=" + cargaBateria +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                ", puertas=" + puertas +
                ", potencia=" + potencia +
                ", sport=" + sport +
                '}';
    }
}
