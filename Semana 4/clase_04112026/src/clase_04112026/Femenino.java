/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04112026;

/**
 *
 * @author claudiacortes
 */

// NOTA: La herencia se configura en el hijo 
// para declarara herencia usamos la palabra reservada extends 
public class Femenino extends Paciente{
    private boolean embarazo;
    private String ultPeridoMenstrual;
    // super= la clase padre o del tipo de dato general .
    // this = la clase en la que estamos 
  
    public Femenino (String nombre, int edad, double peso, double estatura, String tipoSangre, boolean embarazo, String ultPeridoMenstrual){
        super( nombre,  edad,  peso,  estatura,  tipoSangre);
                
        this.embarazo = embarazo; 
        this.ultPeridoMenstrual = ultPeridoMenstrual;
        
        
        
    }

    public boolean isEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(boolean embarazo) {
        this.embarazo = embarazo;
    }

    public String getUltPeridoMenstrual() {
        return ultPeridoMenstrual;
    }

    public void setUltPeridoMenstrual(String ultPeridoMenstrual) {
        this.ultPeridoMenstrual = ultPeridoMenstrual;
    }

    @Override
    public String toString() {
        return "Femenino{" + "embarazo=" + embarazo + ", ultPeridoMenstrual=" + ultPeridoMenstrual + '}';
    }
    
    
}
