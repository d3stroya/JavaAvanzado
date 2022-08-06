public class PatineteElectrico implements Vehiculo, VehiculoElectrico{

    // ATRIBUTOS
    int velocidad = 0;
    int bateria = 0;

    // MÉTODOS
    @Override
    public int acelerar() {
        bateria--;
        return velocidad += 5;
    }

    @Override
    public int frenar() {
        return velocidad -= 5;
    }

    @Override
    public int getCargaBateria() {
        return bateria;
    }

    @Override
    public int cargarBateria() {
        return bateria = 100;
    }

    // TO STRING
    @Override
    public String toString() {
        return "PatineteElectrico{" +
                "velocidad=" + velocidad +
                ", bateria=" + bateria +
                '}';
    }
}
