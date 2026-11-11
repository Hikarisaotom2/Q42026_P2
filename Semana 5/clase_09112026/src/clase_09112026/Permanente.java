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
    
        @Override
    public void generarBoletaPago(){
        double ISR = this.sueldoMensual*0.15;
        double deducciones =  600 + 600 +ISR;
        double sueldoNeto = (this.sueldoMensual-deducciones);
        
        System.out.println("            BOLETA DE PAGO - NOV         ");
        System.out.println("DOCENTE: "+this.nombre +"            FACULTAD: "+this.facultad);
        System.out.println("sueldo mensual:            "+this.sueldoMensual);
        System.out.println("deducciones: ");
        System.out.println("IHSS: 600, RAP: 600, ISR: "+ISR);
        System.out.println("total deducciones:      "+deducciones);
        System.out.println("SUELDO NETO:            "+sueldoNeto);
    }
    
}
