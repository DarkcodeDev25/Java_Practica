/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_java;

/**
 *
 * @author Kenshin Himura
 */
public class variable {
    public static void main(String[]args){
        String nombre;
        int edad=25;
        int a,b,c;
        nombre="kenshin"; 
        a=1;
        b=2;
        c=3;
        System.out.println(nombre);
        System.out.println(edad);
        edad=23;
        System.out.println(edad);
        System.out.println(a+b+c);
        //nueva forma de definir variables
        var primernombre="kenshin ";
        var apellido="vega ";
        var misnombres=primernombre+apellido;
        System.out.println("mi nombre es :" + misnombres);
    } 
}
