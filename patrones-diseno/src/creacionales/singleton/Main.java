package creacionales.singleton;

public class Main {
    public static void main(String[] args) {

        // 1.1. Contexto:
//        Singleton singleton1 = new Singleton();
//        singleton1.setContador(15);
//        System.out.println(singleton1.getContador());
//        // Posición en memoria
//        System.out.println(singleton1);
//
//        Singleton singleton2 = new Singleton();
//        singleton2.setContador(10);
//        System.out.println(singleton2.getContador());
//        // Posición en memoria
//        System.out.println(singleton2);

        // singleton2 está en otra posición de memoria distitna a singleton.
        // Esto es porque se crea una nueva instancia.
        // El patrón singleton evita que se creen nuevas instancias

        // En lugar de lo anterior...
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();

        singleton3.setContador(15);
        singleton4.setContador(10);

        // Ahora tienen la misma posición en memoria. El atributo contador toma el último valor declarado.
        System.out.println(singleton3.getContador());
        System.out.println(singleton3);
        System.out.println(singleton4.getContador());
        System.out.println(singleton4);

        // 1.3. Ejemplo
        Aplicacion app = Aplicacion.getInstance();
        System.out.println(app);

        Aplicacion app2 = Aplicacion.getInstance();
        System.out.println(app2);
        app.Run();
        app2.Run();
    }
}
