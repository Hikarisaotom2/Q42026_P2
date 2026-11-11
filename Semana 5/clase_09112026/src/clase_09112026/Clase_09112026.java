/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_09112026;

/**
 *
 * @author claudiacortes
 */
public class Clase_09112026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        Universidad: 
            Existen diferentes tipos de maestro: 
                
            1 maestro permanente: generarBoletaPago();  
                -> sueldo base 
                -> aplican a deducciones: 
                    -> IHSS, RAP, ISR 
                -> sueldo neto: sueldo base - total Deducciones 
        
            2 maestro hora catedra: generarBoletaPago();
                -> Sueldo por clase (todas las clases tendran el mismo sueldo_
                -> Cantidad de clases que este enseñando ese periodo 
                -> IHSS 
                -> sUELDO NETO: (sueldoClase*CantidadClases) -  deducciones
        
            3 jefe de carrera:generarBoletaPago();
                -> sueldo base 
               -> aplican a deducciones: 
                    -> IHSS, RAP, ISR 
               -> bonificaciones 
                -> sueldo neto: (sueldo base - total Deducciones) +bonos 
        
            4 docente investigador :generarBoletaPago();
                -> sueldo mensual 
                -> cantidad de asesorias o publicaciones 
                -> Bono fijo de 2000 
                -> sueldo neto: sueldo mensual + (asesorias*2000)
        
        
        1 poder registrar docentes ( de cualquier tipo )
        2 generar boleta de pago del mes actual 
        
        POO 
            -> Polimorfismo : 
                NOTA: el polimorfismo es una propiedad que no necesariamente esta relacionada a la herencia 
        
                1) Polimorfismo por sobreescritura simple: 
                    -> Nota: ya lo hemos hecho.... 
        
                    Ventajas: 
                    1) es el mas sencillo de implementar 
                    2) es comptabible y funciona con herencia 
                    3 )Los hijos no estan obligados a crear su propia version del metodo poliformico 
        
                    Desventajas:
                    1) metodo inseguro 
        
                2)
                3)
                
        */
        
        //double sueldoBase, double bono, String nombre, String carrera, String fechaContratacion, String facultad
        JefeCarrera reynoBocanegra = new JefeCarrera(45600.00, 5000.00,"Reynod Bocanegra", "ING Sistemas y CDA","1/1/2010","FI");
        Investigador investigador = new Investigador(30600.00, 5,"Juan Perez", "ING Sistemas y CDA","1/1/2010","FI");
        HoraCatedra claudiaCortes = new HoraCatedra(8000,3,"Claudia Cortes", "ING Sistemas y CDA","1/1/2010","FI");
        Permanente permanente = new Permanente(35000.00,"Juan Gomez", "ING Sistemas y CDA","1/1/2010","FI");
        
        
        System.out.println("JEFE CARRERA");
        reynoBocanegra.generarBoletaPago();
        System.out.println("\nINVESTIGADOR ");
        investigador.generarBoletaPago();
        System.out.println("\nHORA CATEDRA ");
        claudiaCortes.generarBoletaPago();
        System.out.println("\nPERMANENTE");
        permanente.generarBoletaPago();
        
    }
    
}
