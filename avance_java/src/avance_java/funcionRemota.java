/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_java;

/**
 *
 * @author ylsac
 */
public class funcionRemota {
    public static void main(String[] args) {
        var suma=sumar(10,40);
        System.out.println("la suma es :" + suma);
        var nombre="kenshin";
        var edad = 23;
        System.out.println(saludar(nombre,edad));
    }
    static int sumar(int a,int b){
        return a+b;
    }
    static String saludar(String nombre, int edad){
        return "el nombre es " + nombre + " y su edad es " + edad;
    } 
    
}
