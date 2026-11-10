/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_09112026;

/**
 *
 * @author claudiacortes
 */
public class HoraCatedra extends Docente{
    private double sueldoClase;
    private int cantClases;

    public HoraCatedra(double sueldoClase, int cantClases, String nombre, String carrera, String fechaContratacion, String facultad) {
        super(nombre, carrera, fechaContratacion, facultad);
        this.sueldoClase = sueldoClase;
        this.cantClases = cantClases;
    }
    
    
}
