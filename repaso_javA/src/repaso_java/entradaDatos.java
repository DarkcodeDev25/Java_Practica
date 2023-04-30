/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_java;
import java.util.Scanner;
/**
 *
 * @author Kenshin Himura
 */
public class entradaDatos {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese su nombre : ");
        String nombre=leer.nextLine();
        System.out.println("Ingrese su edad :");
        int edad=leer.nextInt();
        System.out.println("Ingrese un caracter :");
        char c=leer.next().charAt(0);
        System.out.println("Nombre : " + nombre);
        System.out.println("edad : " + edad);
        System.out.println("Caracter : " + c);
        
        
        
    }
    
}
