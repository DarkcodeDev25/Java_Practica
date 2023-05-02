
package herencia;

public class empleado extends clasePadrePersona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public empleado( double sueldo, String nombre) {
        super(nombre);
        this.idEmpleado =++empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
