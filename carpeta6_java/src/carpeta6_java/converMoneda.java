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
public class converMoneda {
    public static void main(String[] args) {
        EXTERNA:
        while(true){
            System.out.println("conversor de monedas");
            System.out.println("1-------soles a dolares");
            System.out.println("2-------pesos mexicanos a dolares");
            System.out.println("3-------pesos colombiano a dolares");
            System.out.println("4-------salir");
            System.out.println("-------------------------------------");
            System.out.println("Ingrese una opcion :");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    convertir(3.58,"soles peruano");
                    break;
                case '2':
                    convertir(22.15,"pesos mexicanos");
                case '3':
                    convertir(3851.90,"peso colombiano");
                case '4':
                    System.out.println("CERRAR PROGRAMA");
                    break EXTERNA;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
    }
    static void convertir(double valorDolar,String pais){
        Scanner leer=new Scanner(System.in);
        System.out.printf("Ingrese cantidad de %s : ",pais);
        double cantMoneda=leer.nextDouble();
        double dolares=cantMoneda/valorDolar;
        dolares=(double) Math.round(dolares*100d)/100;
        System.out.println("-------------------------");
        System.out.println("|tienes $"+dolares+"Dolares|");
        System.out.println("-------------------------");
    }
}
