/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_java;

/**
 *
 * @author ylsac
 */
public class DefFuncion {
    public static void main(String[] args){
        saludar("kenshin");
        
        DefFuncion s = new DefFuncion();
        s.myMetodo("hola mundo");
    }
    static void saludar(String nombre){
        System.out.println("hola " + nombre + "desde la funcion");
    }
    public void myMetodo(String saludo){
        System.out.println(saludo);
     }   
}
//segundo metodo para definir y convocar una funcionn
//public class defFuncion{
    //public static void main(String[] args) {
        //saludar();
    //}
    //static void saludar(){
        //System.out.println("hola oni-chan");
    //}
//}
