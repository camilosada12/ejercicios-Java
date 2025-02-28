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
public class Operaciones_Basicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digita un Numero");
        
        double NumeroUno = scanner.nextInt();
        
        System.out.println("digita Otro Numero");
        
        double NumeroDos = scanner.nextInt();
        
        double suma = NumeroUno + NumeroDos;
        
        double resta = NumeroUno - NumeroDos;
        
        double Multiplicacion = NumeroUno * NumeroDos;
        
        double division = NumeroUno / NumeroDos;
        
        System.out.println("Resultado de la Suma = " +suma);
        System.out.println("Resultado de la Resta = " +resta);
        System.out.println("Resultado de la Multiplicacion = " +Multiplicacion);
        System.out.println("Resultado de la Division = " +division);   
        
    }
}
