/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_20102026;

/**
 *
 * @author claudiacortes
 */
/*
    Partes de una clase 
        -> Constructores 
        -> Valores por referencia 
            -> Clase vs Objeto 
    
 */
public class Persona {

    //Atributos
    String dni;
    String nombre;
    String nombrePadre;
    String nombreMadre;
    String ciudad;
    String fechaNacimiento;

    /*
    
    1 atributos     
        nos ayudan a describir o mas informacion sobre un elemento 
    2 metodos 
        Representar acciones del elemento 
        -> metodo accion 
            -> mutadores / setters/ getters  
        -> Constructores....
     */
    
    /* Constructor
        un tipo de metodo especial que crea el objeto y le da valores inciales.
        es lo que nos permite instanciar un objeto
    
    reglas:
        1 se comporta como un metodo regular con dos restricciones:     
            1.1 no tiene retorno (esto no significa que sea del tipo void) 
            1.2 se debe llamar igual que la clase
    */
    
    public  Persona(String nuevoNombre, String identidad, String padre, String madre, String nuevaCiudad, String nacimiento){
        dni = identidad;
        nombre = nuevoNombre;
        ciudad = nuevaCiudad;
        nombrePadre = padre;
        nombreMadre = madre;
        fechaNacimiento = nacimiento;

    }
    
    public  Persona(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public Persona(){
        
    }
    
    
    //Metodos 
    
    //Sobrecarga 
    public void inscribir() {

    }
   
    public void registrarActaDefuncion() {

    }

    public void cambiarNombre() {

    }

    public void emitirPartidaNacimiento() {

    }

    // Mutadores / setters/getters
    // set: actualiza un atributo 
    public void setDni(String nuevoDni) {
        dni = nuevoDni;
    }

    // get: regresa el valor de un atributo 
    public String getDni() {
        return dni;
    }

}

/*
    Herramienta
    atributos 
     nivel 
     material 
     nivel dano ....

     metodos 
     construir
     destruir 
     mezclar 
     mejorar
     decorar 


 */
