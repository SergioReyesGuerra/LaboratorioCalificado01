package com.apellido.nombre.laboratoriocalificado01

class Ejercicio01Kotlin {

    // Función para verificar si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Verificamos si las dos palabras tienen la misma longitud
        if (palabra1.length != palabra2.length) return false

        // Convertimos las palabras a arreglos de caracteres y las ordenamos
        val palabra1Ordenada = palabra1.toCharArray().sorted()
        val palabra2Ordenada = palabra2.toCharArray().sorted()

        // Comparamos los arreglos de caracteres ordenados
        return palabra1Ordenada == palabra2Ordenada
    }

    // Función main para probar el algoritmo
    fun main() {
        // Ejemplos de uso de la función sonAnagramas
        println(sonAnagramas("listen", "silent"))  // Devuelve true
        println(sonAnagramas("hello", "world"))    // Devuelve false
    }
}
