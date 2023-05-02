
package encapsulamiento;
public class persona {
    private String nombre;
    private int edad;
    private boolean eliminar;

    public persona(String nombre, int edad, boolean eliminar) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminar = eliminar;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //-------------------------------
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    //---------------------------------
    public boolean getEliminar(){
        return this.eliminar;
    }
    public void setEliminar(boolean eliminar){
        this.eliminar=eliminar;
    }
    //----------------------------------
    @Override
    public String toString(){
        return "persona :[nombre : %s,edad : %d, eliminar : %b]".formatted(this.nombre,this.edad,this.eliminar);
    }
}
