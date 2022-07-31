package ejercicios1518;


import java.io.*;

public class Main {
    public static void main(String[] args) {

        // 1.
        dividirEntreCero(10);

        // 2.
        System.out.println(accederArray(9));

        // 3.
        System.out.println(accederArchivo("C:\\Users\\Usuario\\package.json"));

    }

    // TODO: 1. Arithmetic exception tratando de hacer una división entre dos números, siendo el que divide 0.
    public static int dividirEntreCero(int dividendo)  {
        int resultado = 0;
        try {
            resultado = dividendo / 0;
            return resultado;
        } catch(ArithmeticException e) {
            System.out.println("División entre cero: " + e.getMessage());
        }
        return resultado;
    }

    // TODO: 2. ArrayIndexOutOfBounds con un array de 6 elementos, tratando de alcanzar el noveno elemento.
    public static int accederArray(int indice) {
        int resultado = 0;
        int aNumeros [] = new int [] {1, 2, 3, 4, 5};
        try {
            resultado = aNumeros[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Accediendo al elemento del array número " + indice + ": " + e.getMessage());
        }
        return resultado;
    }

    // TODO: 3. FileNotFound tratando de acceder a un fichero que no existe.
    public static boolean accederArchivo(String ruta) {
        try {
            InputStream f = new FileInputStream(ruta);
            byte [] datos = f.readAllBytes();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);

        } catch (FileNotFoundException e) {
            System.out.println("Tratando de acceder al archivo... " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
