/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package definicion.variables;
import java.util.Scanner;
/**
 *
 * @author EDITH
 */
public class tabla_Multi_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digita un Numero para ver su tabla de Multiplicacion");
        
        int Numero = scanner.nextInt();
        
        for(int iteracion = 0; iteracion<=10; iteracion++){
            int Multiplcacion = Numero * iteracion;
            System.out.println("Multiplicacion de " + Numero + " = " + Numero + " * " +iteracion+ " = " +Multiplcacion);
        }
    }
}
