/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_09112026;

/**
 *
 * @author claudiacortes
 */
public class Permanente extends Docente{
    private double sueldoMensual;

    public Permanente(double sueldoMensual, String nombre, String carrera, String fechaContratacion, String facultad) {
        super(nombre, carrera, fechaContratacion, facultad);
        this.sueldoMensual = sueldoMensual;
    }
    
}
