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
public class año_Bisiesto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Pedimos el año al usuario
        System.out.print("Introduce un año: ");
        int año = scanner.nextInt();

        // Verificamos si es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
    
}
