/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_04112026;

/**
 *
 * @author claudiacortes
 */
public class Clase_04112026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String nombre, int edad, double peso, double estatura, String tipoSangre, boolean embarazo, String ultPeridoMenstrual
        Femenino claudia = new Femenino("Claudia", 28, 190, 1.70, "0+", false, "9/9/2026");
        Masculino pedro = new Masculino( "9/9/2026", "Pedro", 28, 190, 1.70, "0+");
        
        System.out.println(claudia);
        System.out.println(pedro);
        
    }
    
}
