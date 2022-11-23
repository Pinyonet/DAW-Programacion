/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package om.prog03.Principal;

import com.prog03.figuras.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class Prog03_Ejerc2 {

    public static void main(String[] args) {
        
         Scanner teclado=new Scanner(System.in);
        
        
        
        Rectangulo rect1 = new Rectangulo(0, 0);
        
         System.out.println("Introduce un base:");
        rect1.setBase(teclado.nextInt());
        
         System.out.println("Introduce un altura:");
        rect1.setAltura(teclado.nextInt());
        
        
        System.out.println("Rectángulo creado: \n" + rect1); //Probando método toString.
        System.out.println("Area: " + rect1.getArea()); //Probando método getArea
        System.out.println(rect1.isCuadrado()?"Sí es cuadrado":"No es cuadrado"); //Probando método isCuadrado con operador ternario
    }
}
