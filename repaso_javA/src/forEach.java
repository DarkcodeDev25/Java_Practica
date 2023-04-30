/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kenshin Himura
 */
public class forEach {
    public static void main(String[] args){
        String[]nombres={"kenshin","adriana","belytza","aqua"};
        int c=0;
        while(c<nombres.length){
            System.out.println(nombres[c]);
            c++;
        }
        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        for(String dato:nombres){
            System.out.println(dato);
        }
    }
    
}
