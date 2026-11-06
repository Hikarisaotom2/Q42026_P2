/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_04112026;

import java.util.ArrayList;

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
        
        
        //Cuando trabajamos con herencia una variable del tipo del padre puede contener un objeto del tipo del padre o de sus hijos.
        Paciente p1 = new Femenino("Claudia", 28, 190, 1.70, "0+", false, "9/9/2026");
        Paciente p2 = new Masculino( "9/9/2026", "Pedro", 28, 190, 1.70, "0+");
           
        
//         Masculino casteoEjemplo  = (Masculino)p1;
         
        System.out.println(claudia);
        System.out.println(pedro);
        
        ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(claudia);
        listaPacientes.add(pedro);
        listaPacientes.add(p1);
        listaPacientes.add(p2);
        
        
        
        
    }
    
    public static void remitir(ArrayList<Paciente> listaPaciente){
        for (int i = 0; i <listaPaciente.size(); i++) {
            Paciente p = listaPaciente.get(i);
            if(p instanceof Femenino){
                //Casteo: conversión explicita de datos 
                //(ClaseConvertir)objetoConvertir;
                Femenino pacienteMujer = (Femenino)p;
                System.out.println("Esta embarazada? ");
                
                pacienteMujer.setEmbarazo(true);
                System.out.println("Ultimo periodo menstrual");
                pacienteMujer.setUltPeridoMenstrual("5/11/2026");
                
            }else if(p instanceof Masculino){
                Masculino pacienteHombre = (Masculino)p;
                System.out.println("Ultima rev prostata");
                pacienteHombre.setUltimaRevProstata("5/11/2026");
               // 
            }
            
        }
    }
    
}
