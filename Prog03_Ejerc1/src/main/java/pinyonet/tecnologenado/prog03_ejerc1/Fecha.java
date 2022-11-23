/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pinyonet.tecnologenado.prog03_ejerc1;

/**
 *
 * @author pinyonet
 */
public class Fecha {
        
        
        private int dia;
        String mes;
        private int anio;
        
       

       public Fecha(enumMes mes) {
           this.dia = 0;
           this.mes = mes.toString();
           this.anio = 0;
       } 
        
       public Fecha(int dia, enumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes.toString();
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
     enum enumMes {
          ENERO(1), FEBRERO(2), MARZO(3), ABRIL(4), MAYO(5), JUNIO(6), JULIO(7), AGOSTO(8), SEPTIEMBRE(9), OCTUBRE(10), NOVIEMBRE(11), DICIEMBRE(12);
    
      private final int indexMes;
    
    private enumMes(int index){ //Se crea un index para poder añadir un valor al enum
        this.indexMes = index;
    }

    public int getMes(){
        return this.indexMes;
    }
     }
       
    public boolean isSummer(){ 
      
        
        
        boolean estacion;
        estacion = (mes == "JUNIO" || mes == "JULIO" || mes == "AGOSTO");
            return estacion;
           
        
    }   
      
    }
    


