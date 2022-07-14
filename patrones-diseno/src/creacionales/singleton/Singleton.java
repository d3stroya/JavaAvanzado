package creacionales.singleton;
// Patrones creacionales: Simplifican el proceso de creación de instancias y objetos
// 1. SINGLETON: crea una instancia compartida. Evita la creación de varios objetos de la misma clase con métodos diferentes.
// Solo puede haber una instancia de una clase
public class Singleton {
    //1.2. Implementación:
    // 1.2.1. Crear una variable privada
    private static Singleton singleton;
    int contador;

    // 1.2.2. Crear método que devuelva instancia de clase Singleton
    public static Singleton getInstance() {
        // Permitiendo que cree una instancia solo si no existe ya una
        if(singleton == null) {
            singleton = new Singleton();
        }
        // Si ya está creada la instancia, la devuelve
        return singleton;
    }

    // 1.2.3. Esconder el constructor para evitar la creación de nuevas instancias (new Singleton();)
    // Al ser privado, no se puede acceder desde fuera.
    private Singleton() {}


    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
