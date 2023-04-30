/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kenshin Himura
 */
public class marizMultidimensional {
    public static void main(String[] args){
        int[][][] x={
            {
                {1,2,3},
                {4,5,6},
            },
            {
                {-1,-2,-3},
                {-4,-5,-6},    
            },
        };
        for (int[][]matriz2d:x){
            for(int[]matriz1d: matriz2d){
                for(int dato:matriz1d){
                    System.out.println(dato);
                }
            }
        }
    }
    
}
