/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Kenshin Himura
 */
public class BreakContinue {
    public static void main(String[] args){
        for(int i=0; i<=10;i++){
            System.out.println("valor de i" + i);
            if(i==5){
                System.out.println("saltar siguiente ejecucion");
                //break;
                continue;
            }
            System.out.println("no ejecutar el numero 5");
        }
    }
    
}
