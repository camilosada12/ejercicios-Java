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
public class Digitos_Numero {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Digita Un Numero Entero");
         
         int numero = scanner.nextInt();
         
         if (numero < 0) {
            numero = -numero; 
         }

         int contador = 0;
         
         if (numero == 0) {
            contador = 1;
         } else {
            for (int temp = numero; temp > 0; temp /= 10) {
                contador++;  
           }
       }
        System.out.println("El numero tiene " + contador + " digitos.");
    }
}
