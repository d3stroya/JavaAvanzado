public class DatabaseMySQL implements DatabaseStore {
    @Override
    public void guardarVehiculo(Vehiculo vehiculo) {
        System.out.println("Vehículo guardado con MySQL");
    }
}
