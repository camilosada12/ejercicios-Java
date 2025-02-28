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
public class Area_Perimetro {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("por favor digita la base");
        
        double base = scanner.nextDouble();
        
        System.out.println("por favor digita la Altura");
        
        double Altura = scanner.nextDouble();
        
        int hipotenusa = 12;
        
        double area = base * Altura / 2;
        double perimetro = base + Altura + hipotenusa;
        
            System.out.println("Area = " + area);
            System.out.println("Perimetro = " +perimetro );
        }
}
