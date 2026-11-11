/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_09112026;

/**
 *
 * @author claudiacortes
 */
public class JefeCarrera extends Docente{
    private double sueldoBase;
    private double bono;

    public JefeCarrera(double sueldoBase, double bono, String nombre, String carrera, String fechaContratacion, String facultad) {
        super(nombre, carrera, fechaContratacion, facultad);
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }

    /*
    Para crear el metodo polimorfico en el hijo , 
    1 debemos utilizar la palabra reservada override 
    2 debemos usar la misma estructura, nombre, tipo de retorno y parametros definidos en el padre 
    
    */
    @Override
    public void generarBoletaPago(){
        double ISR = this.sueldoBase*0.15;
        double deducciones =  600 + 600 +ISR;
        double sueldoNeto = (this.sueldoBase-deducciones)+this.bono;
        
        System.out.println("            BOLETA DE PAGO - NOV         ");
        System.out.println("DOCENTE: "+this.nombre +"            FACULTAD: "+this.facultad);
        System.out.println("sueldo base:            "+this.sueldoBase);
        System.out.println("deducciones: ");
        System.out.println("IHSS: 600, RAP: 600, ISR: "+ISR);
        System.out.println("total deducciones:      "+deducciones);
        System.out.println("SUELDO NETO:            "+sueldoNeto);
    }

    @Override
    public String toString() {
        return "JefeCarrera{" + "sueldoBase=" + sueldoBase + ", bono=" + bono + '}';
    }
    
}
