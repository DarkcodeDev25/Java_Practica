/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_java;

/**
 *
 * @author ylsac
 */
public class FuncionRecursiva {
    public static void main(String[] args) {
        cuentaRegresiva(10);
        System.out.println(factorial(5));
    }
    static int factorial(int numero){
        if(numero>1){
            numero=numero * factorial(numero-1);
        }
        return numero;
    }
    static void cuentaRegresiva(int numero){
        numero --;
        if(numero>0){
            System.out.println(numero);
            cuentaRegresiva(numero);
        }else{
            System.out.println("llego hasta 0");
        }
    }
    
}
