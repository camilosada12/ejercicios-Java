/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package definicion.variables;
import java.util.Scanner;
/**
 *
 * @author Camilo Andres Losada 
 */
public class Temperatura {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner celsiuss = new Scanner(System.in);
        
        // Solicitar la entrada de los grados Celsius
        System.out.println("Introduce los grados Celsius:");

        // Leer el valor de los grados Celsius
        double celsius_F = celsiuss.nextDouble();

        // Realizar las conversiones a Fahrenheit y Kelvin
        double resultado_C_F2 = (celsius_F * 9) / 5 + 32; // Conversión a Fahrenheit
        double resultado_C2_k = celsius_F + 273.15; // Conversión a Kelvin

        // Mostrar los resultados
        System.out.println("Celsius a Fahrenheit: " + resultado_C_F2);
        System.out.println("Celsius a Kelvin: " + resultado_C2_k);
    }
}
