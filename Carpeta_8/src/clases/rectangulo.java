/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Kenshin Himura
 */
public class rectangulo {
    public int base;
    public int altura;
    
    public rectangulo(){
        System.out.println(base);
        System.out.println(altura);
    }
    public int area(int b, int a){
        this.base=b;
        this.altura=a;
        return this.base*this.altura;
    }
    public int perimetro(int b, int a){
        this.base=b;
        this.altura=a;
        return 2*(this.base+this.altura);
    }
}
