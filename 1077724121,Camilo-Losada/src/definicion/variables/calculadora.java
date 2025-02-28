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
public class calculadora {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digita Un Numero");
        int NumeroUno = scanner.nextInt();
        
        System.out.println("Digita Un Segundo Numero");
        int NumeroDos = scanner.nextInt();
        
            System.out.println("""
                Selecciona un Signo :
                1 = +
                2 = -
                3 = *
                4 = /""");
        
        int Seleccion = scanner.nextInt();
        
        switch (Seleccion) {
            case 1:
                int Suma = NumeroUno + NumeroDos;
                System.out.println("La suma de los Dos Numeros es : " + Suma);
                break;
                
            case 2:
                int Resta = NumeroUno - NumeroDos;
                System.out.println("La Resta de los Dos Numero es : " + Resta);
                break;
                
            case 3:
                int Multiplicacion = NumeroUno * NumeroDos;
                System.out.println("La Multiplicacion de los Dos Numeros es : " + Multiplicacion);
                break;
                
            case 4:
                if (NumeroDos == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    int Division = NumeroUno / NumeroDos;
                    System.out.println("La Division De Los Dos Numeros es : " + Division);
                }
                break;
                
        }
    }
}