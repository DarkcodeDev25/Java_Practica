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
public class precioVenta {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese valor de venta :");
        double vv=leer.nextDouble();
        double igv=vv*0.18;
        double pv=vv+igv;
        System.out.println("Valor de venta : " + vv);
        System.out.println("IGV : " + igv);
        System.out.println("Precio de venta : " + pv);
    }
    
}
