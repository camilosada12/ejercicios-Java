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
public class fibonaccion {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero de terminos de la serie Fibonacci que deseas ver:");
        int N = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Los primeros " + N + " terminos de la serie Fibonacci son:");

        if (N >= 1) {
            System.out.print(a);
        }

        if (N >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= N; i++) {
            int siguiente = a + b; 
            System.out.print(siguiente + " "); 

            a = b;
            b = siguiente;
        }

        System.out.println(); // Salto de línea al final
    }
}
