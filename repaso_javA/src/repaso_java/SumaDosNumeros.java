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
public class SumaDosNumeros {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero :");
        var n1=leer.nextInt();
        System.out.println("Ingrese numero :");
        var n2=leer.nextInt();
        var r=n1+n2;
        System.out.printf("la suma %d + %d = %d" ,n1,n2,r);
        
    }
    
}
