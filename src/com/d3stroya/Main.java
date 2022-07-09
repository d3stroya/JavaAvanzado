package com.d3stroya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    // 1. FUNCIONES PUTAS
    private static int contador = 0;

    public static void main(String[] args) {

        // 1. FUNCIONES PUTAS
        int res1 = suma(1, 1);
        int res2 = suma(1, 1);
        System.out.println(res1);
        System.out.println(res2);

        // 2. FUNCIONES DE ALTO ORDEN
        Funcionales funcionales = new Funcionales();
        funcionales.llamada();

        // Las funciones de alto orden se usan mucho para encadenar la salida de una con la entrada de la siguiente.

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Franky");
        nombres.add("Bridget");
        nombres.add("Tess");

        // No funcional
        System.out.println("FOREACH ARRAYLIST NO FUNCIONAL");
        for(String nombre : nombres) {
            System.out.println(nombre);
        }

        // Funcional
        System.out.println("FOREACH ARRAYLIST FUNCIONAL");
        nombres.stream().forEach(x -> System.out.println(x));
        // Versión corta de una lambda
        nombres.stream().forEach(System.out::println);

        System.out.println("MAP FUNCIONAL");
        // Por cada resultado obtenido del ArrayList, map aplica otra función.
        // Los streams se consumen, es decir, una vez recorridos, no pueden recuperarse de nuevo.
        // Devuelve un Stream, por lo que para acceder o imprimirlo (reutilizarlo) hay que añadir Stream<String> valores (guardarlo en una variable).
        // 2.3. Recorrer el ArrayList y convertir todos los nombres a mayúsculas y filtrar los que empiezan por F:
        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("F"));

        valores.forEach(x -> System.out.println(x));

        // Convertir array a stream y consumirlo
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        var stNumeros = Arrays.stream(numeros);
        //stNumeros.forEach(x -> System.out.println(x));
        //var res3 = stNumeros.filter(x -> x % 2 != 0);
        // res.forEach(System.out::println);

        // Sumar todos los números impares
        // 1. Se sacan los pares con filter()
        // 2. Se suman consecutivamente con reduce():
            // Valor inicial (0 o ""), expresión de reducción
            // x = 0; y = 2
            // x = 2 y = 4
        var res4 = stNumeros.filter(x -> x % 2 == 0).reduce(0, (x, y) -> {
            System.out.println("x = " + x + ", y = " + y);
            return x + y;
        }
        );

        System.out.println("La suma de pares es: " + res4);

    }


    // 1. Función pura: dados unos mismos parámetros de entrada, siempre produzca el mismo resultado de salida.
    // No puede tener efectos colaterales (cambios que se realizan cuando invoco a una función), por ejemplo, modifica una variable de fuera de la función.
    // Tiene que hacer exactamente lo que dice. Si se llama suma, tiene que sumar y nada más.
    public static int suma(int a, int b) {
        // No cumple
        contador += 1;
        // No cumple
        multiplica(a, b);
        // Cumple
        return a + b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    // 2. Función de alto orden: función que puede llamar a otra función y devuelve otra función.
    // Tiene como parámetro una función.
    // Devuelve otra función.
    public static String toMayuscula(String nombre) {
        return nombre.toUpperCase();    // Hace lo mismo que la función lambda toMayus de la clase Funcionales. Esto es un método.
    }



}
