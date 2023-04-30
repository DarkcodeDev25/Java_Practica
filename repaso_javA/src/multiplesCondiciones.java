/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Kenshin Himura
 */
public class multiplesCondiciones {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una letra : ");
        String c=leer.nextLine();
        if(c=="a" || c=="A"){
            System.out.printf("%s es VOCAL\n",c);
        }else if(c=="e" || c=="E"){
            System.out.printf("%s es VOCAL\n",c);
        }else if(c=="i" || c=="I"){
            System.out.printf("%s es VOCAL\n",c);
        }else if(c=="o" || c=="O"){
            System.out.printf("%s es VOCAL\n",c);
        }else if(c=="u" || c=="U"){
            System.out.printf("%s es VOCAL\n",c);
        }else{
            System.out.printf("no es vocal\n",c);
        }
        
    }
    
}
