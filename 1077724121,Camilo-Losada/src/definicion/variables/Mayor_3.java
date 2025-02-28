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
public class Mayor_3 {
     public static void main(String[] args){
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Digita el Numero Uno ");
         
         int NumeroUno = scanner.nextInt();
         
         System.out.println("Digita el Numero Dos ");
         
         int  NumeroDos = scanner.nextInt();
         
         System.out.println("Digita el Numero Tres ");
         
         int NumeroTres = scanner.nextInt();
         
         if (NumeroUno > NumeroDos && NumeroUno > NumeroTres) {
            System.out.println("El Numero Uno = " + NumeroUno);
            System.out.println("El Numero Dos = " + NumeroDos);
            System.out.println("El Numero Tres = " + NumeroTres);
            System.out.println("El Numero Uno es el Numero Mayor: " + NumeroUno);
         }else if (NumeroDos > NumeroUno && NumeroDos > NumeroTres) {
            System.out.println("El Numero Uno = " + NumeroUno);
            System.out.println("El Numero Dos = " + NumeroDos);
            System.out.println("El Numero Tres = " + NumeroTres);
            System.out.println("El Numero Dos es el Numero Mayor: " + NumeroDos);
         }else {
            System.out.println("El Numero Uno = " + NumeroUno);
            System.out.println("El Numero Dos = " + NumeroDos);
            System.out.println("El Numero Tres = " + NumeroTres);
            System.out.println("El Numero Tres es el Numero Mayor: " + NumeroTres);
        }
     }
}
