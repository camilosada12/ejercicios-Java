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
public class Suma_De_Numeros {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Hasta que Numero");
         
         int Numero = scanner.nextInt();
         
         int sumaNumero = 0;
         for(int iteracion = 0; iteracion <= Numero; iteracion++){
             sumaNumero += iteracion;
             
             System.out.println("Suma de los Primeros Numeros hasta: " + iteracion + " es: " + sumaNumero);
         }
     }
}
