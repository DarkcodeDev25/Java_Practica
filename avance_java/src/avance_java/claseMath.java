/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_java;

/**
 *
 * @author ylsac
 */
public class claseMath {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(4,2));
        System.out.println(Math.random());
        int numeroRandom=(int)(Math.random()*101);
        System.out.println(numeroRandom);
        System.out.println((int)(Math.sqrt(64)));
        System.out.println(Math.max(7,9));
        System.out.println(Math.min(7,9));
        System.out.println(Math.round(5.8471));
        double moneda=(double)Math.round(3.429*100)/100;
        System.out.println(moneda);
    }
    
}
