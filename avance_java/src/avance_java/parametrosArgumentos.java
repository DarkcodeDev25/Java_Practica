/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_java;

/**
 *
 * @author ylsac
 */
public class parametrosArgumentos {
    public static void main(String[] args) {
        sumar(10,40);
        var nombre="kenshin";
        var edad = 23;
        saludar(nombre,edad);
    }
    static void sumar(int a, int b){
        int suma=a+b;
        System.out.println("la suma es : " + suma);
    }
    static void saludar(String nombre, int edad){
        System.out.printf("Hola %s tu edad es %d \n", nombre, edad);
    }
}
