package com.d3stroya;

import java.util.function.Function;

public class Funcionales {
    // 2. FUNCIONES DE ALTO ORDEN
    // Función Lambda
    // visibilidad Function <TipoDatoAceptado, TipoDatoDevuelto> nombre = { Implementación de la función }
    // Implementación: parátro de entrada (x) -> el valor de salida que queremos (x.toUpperCase)
    private Function<String, String> toMayus = x -> x.toUpperCase();

    // 2.1. Llamar a la función toMayus
    public void llamada() {
        // 2.2. Función dentro de función con parámetro función
        Saluda(toMayus, "Ana");

        // 2.1
        System.out.println(toMayus.apply("Ana"));
    }

    // 2.2. Función con parámetro función
    public void Saluda(Function<String, String> miFuncion, String nombre) {
        miFuncion.apply(nombre);
    }


}
