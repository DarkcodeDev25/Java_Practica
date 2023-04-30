/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Kenshin Himura
 */
public class condicionAnidada {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese numero :");
        int n=leer.nextInt();
        if(n!=0){
            if(n>0){
                if(n%2==0){
                    System.out.printf("el numero %d es par positivo\n",n);
                }else{
                    System.out.printf("el numero %d es impar positivo\n",n);
                }
            }else{
                if(n%2==0){
                    System.out.printf("el numero %d es par negativo\n",n);
                }else{
                    System.out.printf("el numero %d es impar negativo\n",n);
                }
            }
        }else{
            System.out.printf("el numero es neutro\n",n);
        }
        
    }
    
}
