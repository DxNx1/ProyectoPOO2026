# 🔠 Proyecto POO 2026: Inventario de Letras

Este proyecto es una aplicación desarrollada en Java que implementa una estructura de datos personalizada para gestionar y manipular la frecuencia de letras del abecedario dentro de cadenas de texto. Además de la gestión de inventarios, incluye utilidades criptográficas basadas en el Cifrado César y operaciones matemáticas entre objetos.

## 🚀 Características Principales

El sistema está construido en torno a la clase `InventarioLetras`, la cual encapsula un array de enteros para contabilizar caracteres y expone los siguientes comportamientos:

*   **Gestión de Frecuencias:** Almacena y cuenta la cantidad de veces que aparece cada letra (ignorando mayúsculas y minúsculas).
*   **Operaciones entre Objetos:** 
    *   `add(InventarioLetras)`: Suma las frecuencias de dos inventarios.
    *   `subtract(InventarioLetras)`: Resta un inventario de otro (retorna `null` si el resultado contiene frecuencias negativas).
    *   `amplifies(int n)`: Multiplica la cantidad de cada letra por un factor `n`.
*   **Criptografía Básica:**
    *   Métodos `encriptarCesar` y `desencriptarCesar` para desplazar caracteres 3 posiciones.
    *   Métodos `encriptarPalabra` y `desencriptarPalabra` que permiten cifrar cadenas completas con un nivel de desplazamiento personalizable.

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje:** Java
*   **Paradigma:** Programación Orientada a Objetos (POO)
*   **Estructura central:** Arrays unidimensionales y manipulación de caracteres (ASCII/Casting).

## 💻 Ejemplo de Uso

El proyecto incluye una clase `Main` para testear el comportamiento de los objetos. Aquí tienes un ejemplo rápido de cómo instanciar y utilizar el inventario:

```java
// Crear un nuevo inventario a partir de un String
InventarioLetras inv = new InventarioLetras("Hola Mundo");

// Consultar el estado del inventario
System.out.println("Tamaño total de letras: " + inv.size()); // 9
System.out.println("¿Está vacío?: " + inv.isEmpty()); // false
System.out.println("Cantidad de letras 'o': " + inv.get('o')); // 2

// Probar el algoritmo de encriptación con desplazamiento de 4 casillas
String cifrado = inv.encriptarPalabra("zeroa", 4);
System.out.println("Palabra cifrada: " + cifrado); // divse

// Operar aritméticamente con dos objetos distintos
InventarioLetras inv1 = new InventarioLetras("Alan Turing");
InventarioLetras inv2 = new InventarioLetras("Ada Lovelace");
InventarioLetras suma = inv1.add(inv2);

// El método toString() devuelve el inventario ordenado alfabéticamente
System.out.println(suma); 
// Salida esperada: [aaaaaacdeee... etc]
