/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pinyonet.tecnologenado.prog03_ejerc1;


import java.util.Scanner;

/**
 *
 * @author pinyonet
 */
public class Prog03_Ejerc1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        Fecha objFecha1 = new Fecha(Fecha.enumMes.JUNIO);
        //definimos el dia llamando al metodo setDIA
        System.out.println("Introduce un dia:");
        objFecha1.setDia(teclado.nextInt());
        
         System.out.println("Introduce un año:");
        objFecha1.setAnio(teclado.nextInt());
        
        
        System.out.println("Primera fecha, inicializada con el primer constructor");
        System.out.println(objFecha1.getDia() + " de " + objFecha1.mes + " del " + objFecha1.getAnio());
       /* System.out.println(objFecha1.mes);
        System.out.println(objFecha1.getAnio());        */
        System.out.println(objFecha1.isSummer()? "Es Verano" : "No es Verano");  
        
        
        
        Fecha objFecha2 = new Fecha(15,Fecha.enumMes.ABRIL, 2022);
        
        System.out.println("Segunda fecha, inicializada con el segundo constructor");
        System.out.println("La fecha 2 contiene el año " + objFecha2.getAnio());
        System.out.println(objFecha2.getDia() + " de " + objFecha2.mes + " del " + objFecha2.getAnio());

        System.out.println(objFecha2.isSummer()? "Es Verano" : "No es Verano"); 
     
        
     
    }
    
}
