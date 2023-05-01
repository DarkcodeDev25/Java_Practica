import clases.personaConstructores;
import clases.calculadora;
public class personaConst {
    
    public static void main(String[] args) {
        personaConstructores persona1 = new personaConstructores();
        personaConstructores persona2 = new personaConstructores("kenshin");
        personaConstructores persona3 = new personaConstructores();
        persona3.nombre="fiorelita";
        persona3.edad=25;
        persona3.mostrarDatos();
        //clase calculadora
        calculadora calcular = new calculadora();
        System.out.println(calcular.resta(50, 30));
        System.out.println(calcular.resta(50.5, 30));
    }
    
}
