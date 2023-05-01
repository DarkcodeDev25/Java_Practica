
package clases;

public class personaConstructores {
    public String nombre;
    public int edad;
     public personaConstructores(){
         System.out.println("construyendo objetos");
     }
     public personaConstructores(String nombre){
         System.out.println("hola " + nombre + "desde el constructor");
     }
     public void mostrarDatos(){
        System.out.println("nombre :" + nombre);
        System.out.println("edad : " + edad);
     }
}
