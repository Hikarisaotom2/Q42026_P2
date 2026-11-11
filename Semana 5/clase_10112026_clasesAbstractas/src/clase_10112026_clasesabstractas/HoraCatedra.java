/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10112026_clasesabstractas;

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
    
    
    @Override 
    public void generarBoletaPago(){
         double totalClases= this.sueldoClase* this.cantClases;
        
        System.out.println("            BOLETA DE PAGO - NOV         ");
        System.out.println("DOCENTE: "+this.nombre +"            FACULTAD: "+this.facultad);
        System.out.println("sueldo basepor clase :            "+this.sueldoClase);
        System.out.println("Cantidad de clases: "+this.cantClases);
        System.out.println("SUELDO NETO:            "+totalClases);
    }
    
}
