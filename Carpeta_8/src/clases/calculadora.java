/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Kenshin Himura
 */
public class calculadora {
    public static final double PI=3.141592;
    
   public static int sumar(int a, int b){
       return a + b;
   }
   public static double sumar(double a, double b){
       return a + b;
   }
   //sobrecarga metodos
   public int resta(int a, int b){
       return a-b;
   }
   public double resta(double a, double b){
       return a-b;
   }
}
