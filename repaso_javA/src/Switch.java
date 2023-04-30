/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Kenshin Himura
 */
public class Switch {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero :" );
        int dia=leer.nextInt();
        String nombreDia=null;
        switch(dia){
            case 1:
                nombreDia="domingo";
                break;
            case 2:
                nombreDia="lunes";
                break;
            case 3:
                nombreDia="martes";
                break;
            case 4:
                nombreDia="miercoles";
                break;
            case 5:
                nombreDia="jueves";
                break;
            case 6:
                nombreDia="viernes";
                break;
            case 7:
                nombreDia="sabado";
                break;
            default:
                System.out.println("no existe el dia");      
        }
        System.out.println("el dia es :" + nombreDia);
    }
    
}
