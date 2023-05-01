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
public class Palindromo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cadena :");
        String cadena = leer.nextLine();
        if(esPalindromo(cadena)){
            System.out.println("====================");
            System.out.println("es palindromo");
        }else{
            System.out.println("====================");
            System.out.println("no es palindromo");
        }
    }
    static boolean esPalindromo(String cadena){
        cadena=cadena.replace(" ","");
        cadena=cadena.toLowerCase();
        
        StringBuilder cadenaInvertida=new StringBuilder();
        for(int i=cadena.length()-1;i>=0;i--){
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadena.equals(cadenaInvertida.toString());
    }
    
}
