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
public class condicional_IF_Negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digita un Numero");
        
        double Numero = scanner.nextDouble();
        
        if(Numero > 0){
            System.out.println("Tu numero es Positivo");
        }else if(Numero == 0){
            System.out.println("Tu numero es 0");
        }else{
            System.out.println("Tu Numero es Negativo");
        }
    }
}
