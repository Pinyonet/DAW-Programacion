/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.prog03.Principal;

import com.prog03.figuras.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author pinyonet
 */
public class Prog03_Ejerc2 {

    public static void main(String[] args) {
        
         Scanner teclado=new Scanner(System.in); //Creamos teclado para recoger datos por teclado
        
        
        
        Rectangulo rect = new Rectangulo(0, 0);  //Creamos objeto Rect
        
         System.out.println("Introduce un base:");   //Recogemos datos base
        rect.setBase(teclado.nextInt());
        
         System.out.println("Introduce un altura:");  //Recogemos datos altura
        rect.setAltura(teclado.nextInt());
        
        
        System.out.println("Rectángulo creado: \n" + rect); //Utilizamos método toString.
        System.out.println("Area: " + rect.getArea()); //Utilizamos método getArea
        System.out.println(rect.isCuadrado()? "Es cuadrado":"No es cuadrado"); //Utilizamos metodo cuadrado
    }
}
