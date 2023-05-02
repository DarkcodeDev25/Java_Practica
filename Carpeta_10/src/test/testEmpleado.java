
package test;
import herencia.*;
import java.util.Date;
public class testEmpleado {
    public static void main(String[] args) {
        //empleado1
        empleado empleado1 = new empleado(3000,"kenshin");
        System.out.println(empleado1);
        //empelado2
        empleado empleado2 = new empleado(4500,"fiorelita");
        System.out.println(empleado2);
        //empleado3
        empleado empleado3 = new empleado(5000,"la_egoista");
        System.out.println(empleado3);
        
        var fecha = new Date();
        //cliente1
        clientes cliente1 = new clientes(fecha,true,"kenshin",'M',0,"lima");
        System.out.println(cliente1);
        //cliente2
        clientes cliente2 = new clientes(fecha,true,"kaedehara",'M',0,"callao");
        System.out.println(cliente2);
        //cliente3
        clientes cliente3 = new clientes(fecha,true,"tilin",'M',0,"ate");
        System.out.println(cliente3);
    }
    
}
