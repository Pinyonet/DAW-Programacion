/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog03.figuras;

/**
 *
 * @author pinyonet
 */
public class Rectangulo {
    
    
    private int base;
private int altura;

public Rectangulo(int base, int altura) {
this.base = base;
this.altura = altura;
}

public double getBase() {
return base;
}

public double getAltura() {
return altura;
}


public void setBase(int base) {
this.base = base;
}

public void setAltura(int altura) {
this.altura = altura;
}

public float getArea(){
float area=(base*altura);
return area;
}

@Override
public String toString() {
return "La base del rectangulo = " + getBase() + "\nLa altura del rectangulo = " + getAltura() ;
}

public boolean isCuadrado(){
return(base == altura);
}
}
