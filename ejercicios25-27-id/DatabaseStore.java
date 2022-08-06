/**
 * TODO: Deberás crear una conexión a base de datos aplicando el último principio de la inversión de dependencias (D).
 * Creo la interfaz DatabaseStore
 * e implemento las clases DatabaseMySQL y DatabasePostgreSQL
 * Cada una gestionará una base de datos
 * Se accederá a una u otra dependiendo del parámetro que se pase a una misma función en Main.
 */
public interface DatabaseStore {
    void guardarVehiculo(Vehiculo vehiculo);
}
