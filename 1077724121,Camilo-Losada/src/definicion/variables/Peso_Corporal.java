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
public class Peso_Corporal {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digitame el peso");
        double peso_P = scanner.nextDouble();

        
        System.out.println("Digitame tu altura");
        double altura_p = scanner.nextDouble();

        
        double alturaMetro = altura_p / 100  ;
        
        double imc = peso_P / (alturaMetro * alturaMetro);
        
        System.out.println("el imc tuyo es de " +imc);
       
    }
}
