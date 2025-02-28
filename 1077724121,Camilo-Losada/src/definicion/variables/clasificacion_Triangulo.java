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
public class clasificacion_Triangulo {
     public static void main(String[] args){
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Lado Uno");
         
         int LadoUno = scanner.nextInt();
         
         System.out.println("Lado Dos");
         
         int LadoDos = scanner.nextInt();
         
          System.out.println("Lado Tres");
         
         int LadoTres = scanner.nextInt();
         
         if(LadoUno == LadoDos && LadoDos == LadoTres){
            System.out.println("Lado Uno = " + LadoUno);
            System.out.println("Lado Dos = " + LadoDos);
            System.out.println("Lado Tres = " + LadoTres);
            System.out.println("Es un Triangulo Equilatero");
         }else if(LadoUno == LadoDos || LadoDos == LadoTres || LadoUno == LadoTres){
            System.out.println("Lado Uno = " + LadoUno);
            System.out.println("Lado Dos = " + LadoDos);
            System.out.println("Lado Tres = " + LadoTres);
            System.out.println("Es un Triangulo Isosceles");
         } else{
            System.out.println("Lado Uno = " + LadoUno);
            System.out.println("Lado Dos = " + LadoDos);
            System.out.println("Lado Tres = " + LadoTres);
            System.out.println("Es un Triangulo Escaleno");
         }
     }
}
