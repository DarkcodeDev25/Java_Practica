 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpeta6_java;
import java.util.Scanner;
/**
 *
 * @author Kenshin Himura
 */
public class primalidad {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero :");
        int numero=leer.nextInt();
        if(primo(numero)){
            System.out.println("============");
            System.out.println("es primo");
        }else{
            System.out.println("==============");
            System.out.println("no es primo");
        }
    }
    static boolean primo(int numero){
        int contador=0;
        
        int []numeros=new int[numero];
        for(int i=0;i< numeros.length;i++){
            numeros[i]=i+1;
        }
        for(int i: numeros){
            if(i==1||i==numero){
                continue;
            }
            if (numero%i==0){
                contador++;
            }
        }
        return contador==0;
    }
}
