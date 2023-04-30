/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_java;

/**
 *
 * @author ylsac
 */
public class claseString {
    public static void main(String[] args) {
        String nombre="oregoom";
        System.out.println(nombre.charAt(6));
        System.out.println(nombre.length());
        for(int i=0; i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }
        System.out.println(nombre.substring(0,4));
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        
        nombre=" O r e g o o m ";
        System.out.println(nombre.replace(" ",""));
        System.out.println("hola".equals("hola"));
        
    }
    
}
