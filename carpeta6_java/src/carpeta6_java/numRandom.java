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
public class numRandom {
    public static void main(String[] args) {
        OUTER:
        while(true){
            System.out.println("ADIVINAMELO EL NUMERO ");
            System.out.println("1--------------nivel facil");
            System.out.println("2--------------nivel normal");
            System.out.println("3--------------nivel superSaiyajin");
            System.out.println("4--------------salir");
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese tipo de opcion :");
            int opcion=leer.nextInt();
            
            switch(opcion){
                case '1':
                    jugar(10);
                    break;
                case '2':
                    jugar(7);
                    break;
                case '3':
                    jugar(5);
                    break;
                case '4':
                    System.out.println("CERRAR PROGRAMA");
                    break OUTER;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
    }
    static void jugar(int vidas){
        int numRandom=(int)(Math.random()*101);
        int numElegido=-1;
        Scanner leer=new Scanner(System.in);
        while(numElegido !=numRandom){
            System.out.print("Ingrese numero del 1 al 100 : ");
            numElegido=leer.nextInt();
            
            if(numRandom<numElegido){
                System.out.println("El numero mas pequeño");
                vidas--;
            }else if(numRandom>numElegido){
                System.out.println("El numero mas grande");
                vidas--;
            }
            if(vidas==0){
                System.out.println("GAME OVER");
            }
            System.out.printf("te quedan %d vidas \n", vidas);
        }
        if(numElegido==numRandom){
            System.out.println("-----------------------");
            System.out.println("FECIDADES GANASTE");
            System.out.println("-----------------------");
        }
    }
    
}
