package estructurales.decorator;
// DECORADOR: Añade funcionalidad a una clase ya existente sin modificarla. Es como una matrioska: unas clases dentro de otras.
// 1. Interfaz con método básico
// 2. Clase básica
// 3. Clases derivadas que añaden funcionalidades.
public class Main {
    public static void main(String[] args) {
        TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.crear();

        // Tiene las funcionalidades de TelefonoBasico más las de TelefonoInteligente
        TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());
        telefonoInteligente.crear();

        // Podemos crear todos los envoltorios que queramos
        TelefonoNextGen telefonoNextGen = new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBasico()
                )
        );
        telefonoNextGen.crear();
    }
}
