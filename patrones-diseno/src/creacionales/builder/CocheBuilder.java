package creacionales.builder;

public class CocheBuilder {
    // 3.2. Crear variable que invoque a clase Vehiculo
    Vehiculo vehiculo;
    // 3.1. Constructor
    public CocheBuilder(String marca) {
        // 3.3. Instanciar vehiculo
        vehiculo = new Vehiculo();
        // 3.4. Configurar marca
        vehiculo.marca = marca;
    }

    // 3.3. Métodos
    public CocheBuilder setPuertas(int puertas) {
        // 3.7. Cambiar "return vehiculo.setPuertas(puertas) por vehiculo.puertas = puertas.
        vehiculo.puertas = puertas;
        return this;    // Esta función se devuelve a sí misma, devuelve su clase. Le da "fulidez"
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }
    // setPuertas y setMotor permiten la programación fluida (un método devuelve su propia instancia) --> 3.5 en Main

    public Vehiculo build() {
        return this.vehiculo;   // Devuelve la variable creada arriba (devuelve un objeto que hemos creado.
    }
}
