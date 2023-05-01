import clases.rectangulo;
public class mainRectangulo {
    public static void main(String[] args) {
        rectangulo r1 = new rectangulo();
        
        System.out.println(r1.area(8, 4));
        //muestra de la memoria heap
        System.out.println(r1);
    }
}
