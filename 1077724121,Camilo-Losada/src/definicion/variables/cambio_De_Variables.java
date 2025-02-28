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
public class cambio_De_Variables {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digita un Numero");
        
        int NumeroUno = scanner.nextInt();
        
        System.out.println("digita Otro Numero");
        
        int NumeroDos = scanner.nextInt();
        
        NumeroUno = NumeroUno + NumeroDos;
        
        NumeroDos = NumeroUno - NumeroDos;
        
        NumeroUno = NumeroUno - NumeroDos;
        
        System.out.println("Numero Uno = " +NumeroUno);
        System.out.println("Numero Dos = " +NumeroDos); 
        
    }
}
