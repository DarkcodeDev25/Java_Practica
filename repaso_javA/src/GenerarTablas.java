/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Kenshin Himura
 */
public class GenerarTablas {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero :");
        int n=leer.nextInt();
        int c=0;
        while(c<=10){
            System.out.printf("|%d x %d = %d\n", n,c,(n*c));
            c++;
        }
    }
    
}
