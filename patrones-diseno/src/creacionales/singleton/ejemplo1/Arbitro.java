package creacionales.singleton.ejemplo1;

public class Arbitro {
    // 1. Crear un atributo de la clase que tomará el valor del objeto
    private static Arbitro arbitro;

    // Atributo nombre
    private String nombre;

    // 2. Constructor privado que evita nuevas instanciaciones
    private Arbitro() {}

    // 3. Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 4. Método para crear una única instancia
    public static Arbitro getInstance() {
        if(arbitro == null) {
            arbitro = new Arbitro();
        }
        return arbitro;
    }
}
