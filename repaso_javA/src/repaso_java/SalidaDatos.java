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
public class SalidaDatos {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre :");
        String nombre=leer.nextLine();
        System.out.println("Ingrese edad :");
        int edad=leer.nextInt();
        System.out.println("Ingrese un caracter :");
        char c=leer.next().charAt(0);
        System.out.printf("Nombre : %s Edad : %d\n", nombre,edad);
        System.out.println("Caracter : " + c);
        System.out.println("Hola\tMundo");
    }
    
}
