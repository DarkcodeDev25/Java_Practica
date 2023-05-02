
package test;
import encapsulamiento.*;
public class textPersona {
    public static void main(String[] args) {
        persona persona1 = new persona("kenshin",23,false);
        String estado=persona1.toString();
        System.out.println(estado);
        System.out.println(persona1.getNombre());
        ///modificar nombre
        persona1.setNombre("kenshinHimura");
        persona1.setEdad(24);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        
        System.out.println(persona1);
    }
    
}
