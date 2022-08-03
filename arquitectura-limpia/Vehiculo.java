/**
 * Single responsability: 1 clase, 1 función
 *  Vehículo gestiona vehículos
 *  VehículoDB gestiona acceso a base de datos
 *
 */
abstract class Vehiculo {

    // SINGLE RESPONSABILITY
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    // OPEN-CLOSE
    abstract int obtenerPotencia();

}

// OPEN-CLOSE
class Coche extends Vehiculo {
    @Override
    int obtenerPotencia() {
        return 1000;
    }
}

class Moto extends Vehiculo {
    @Override
    int obtenerPotencia() {
        return 500;
    }
}


