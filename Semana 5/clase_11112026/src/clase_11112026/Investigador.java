/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_11112026;

/**
 *
 * @author claudiacortes
 */
public class Investigador extends Docente implements AccionesDocente{
    private double sueldoMensual;
    private int asesoriasMes;

    public Investigador(double sueldoMensual, int asesoriasMes, String nombre, String carrera, String fechaContratacion, String facultad) {
        super(nombre, carrera, fechaContratacion, facultad);
        this.sueldoMensual = sueldoMensual;
        this.asesoriasMes = asesoriasMes;
    }
    
        @Override
    public void generarBoletaPago(){
        
       double totalAsesorias= this.asesoriasMes*2000;
        double sueldoNeto = this.sueldoMensual+totalAsesorias;
        
        System.out.println("            BOLETA DE PAGO - NOV         ");
        System.out.println("DOCENTE: "+this.nombre +"            FACULTAD: "+this.facultad);
        System.out.println("sueldo base:            "+this.sueldoMensual);
        System.out.println("Asesorias: ");
        System.out.println("Cantidad de asesorias al mes: "+this.asesoriasMes);
        System.out.println("total asesorias:      "+totalAsesorias);
        System.out.println("SUELDO NETO:            "+sueldoNeto);
    }
}
