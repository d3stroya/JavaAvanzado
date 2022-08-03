/**
 * Interface segregetion: la clase perro no implementa el método volar() de la interfaz
 * Animal, por lo que no debe implementar dicha interfaz.
 * La interfaz Animal tiene un error, porque no todos los animales vuelan.
 */
public interface Animal {
    boolean beber();

    //Corrección del error de diseño
//    boolean volar();
}

public interface AnimalVolador() {
    boolean volar();
}

public class Pajaro implements Animal, AnimalVolador {
    @Override
    public boolean beber() {
        return false;
    }

    @Override
    public boolean volar() {
        return false;
    }
}

public class Perro implements Animal {
    @Override
    public boolean beber() {
        return false;
    }

}
