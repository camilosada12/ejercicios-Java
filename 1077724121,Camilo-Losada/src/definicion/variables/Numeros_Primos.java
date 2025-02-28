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
public class Numeros_Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("numero limite para encontrar todos los numeros primos hasta ese numero:");
        int limite = scanner.nextInt();

        System.out.println("Los numeros primos hasta " + limite + " son:");

        for (int num = 2; num <= limite; num++) {
            if (esPrimo(num)) {
                System.out.print(num);
            }
        }
        System.out.println(); 
    }

    public static boolean esPrimo(int num) {
        
        if (num <= 1) {
            return false;
        }
        
        if (num == 2) {
            return true;
        }
        
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {  
            if (num % i == 0) {
                return false;  
            }
        }

        return true;  
    }
}
