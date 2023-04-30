/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_java;

/**
 *
 * @author ylsac
 */
public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sumar("kenshin",4,8,9,6,78,56));
        
    }
    static int sumar(String nombre,int... numero){
        System.out.println("la suma de :" + nombre);
        int suma=0;
        for(int num : numero){
            suma =num;
        }
        return suma;
    }
    static double sumar(double... numero){
        double suma=0;
        for(double num:numero){
            suma+=num;
        }
        return suma;
    }

}  
