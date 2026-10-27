/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_20102026;

import javax.swing.JOptionPane;

/**
 *
 * @author claudiacortes
 */
public class Clase_20102026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            -> P1: progra Estructurada 
                    => estructuras 
            -> P2: Programacion Orientada Objetos 
                    -> Clases/Objetos 
                  
            Clases->
                representar un tipo de dato mas complejo. 
            IMPORTANTE: cada clase se vuelve un nuevo tipo de dato en java 
        
            Clase != Objeto
        */
        
        
        int numero = 9;
        String nombre = "";
        String nombre2;
        char letra ;
        
        
        // Crear un objeto 
                        // new llamadoDelConstructor
        Persona claudia = new Persona("Claudia","1234","Juan","Maria","tegus","09/09/xxxx");
        Persona lucia = new Persona("Claudia");
        Persona pedro = new Persona("Pedro","1234","Juan","Maria","tegus","09/09/xxxx");
    
        claudia=pedro;
        
        claudia.nombre = "Jose";
        
        System.out.println(claudia.nombre);
        System.out.println(pedro.nombre);
        
        
        
    }
    
    
    /*
    -> no afecta en nada 
    -> recomendaciones / buenas practicas
    
    1 camel case -> se empieza a escribir en minuscula y cada nueva palabra inciia en mayuscula 
        edadPersona 
    
    2  pascal case -> Cada palabra se escribe con mayuscula al inicio 
        EdadPersona
    
    3 kebab case -> cada palabra en minuscula separada por un - 
    edad-persona 
    
    4 snake case -> todo en misnucula, separado con _
    edad_persona
   
    
    */
    
}
