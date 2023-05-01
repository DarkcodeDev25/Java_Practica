/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpeta6_java;

/**
 *
 * @author Kenshin Himura
 */
public class GenerarContraseñas {
    public static void main(String[] args) {
        System.out.println(GenerarContra());
    }
    static String GenerarContra(){
        char[] may={'A','B','C','D','E','F','G','H','I'};
        char[] min={'a','b','c','d','e','f','g','h','i'};
        char[] num={'1','2','3','4','5','6','7','8','9','0'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(may);
        caracteres.append(min);
        caracteres.append(num);
        
        StringBuilder contra = new StringBuilder();
        for(int i=0;i<=15;i++){
            int cantCaracteres=caracteres.length();
            int numeroRandom=(int)(Math.random()*cantCaracteres);
            
            contra.append((caracteres.toString()).charAt(numeroRandom));
        }
        return contra.toString();
    }
}
