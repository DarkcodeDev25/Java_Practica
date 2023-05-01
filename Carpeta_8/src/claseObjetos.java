
import clases.persona;

public class claseObjetos {
    //clase persona esta vinculada con la clase claseObjetos
    public static void main(String[] args) {
        persona persona1 = new persona();
        persona1.nombre="KenshinHimura";
        persona1.edad=23;
        persona1.mostrarDatos();
        persona persona2 = new persona();
        persona2.nombre="Fiorelita";
        persona2.edad=18;
        persona2.mostrarDatos();

    }
    
}
