/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04112026;

/**
 *
 * @author claudiacortes
 */
public class Paciente {
        /*
        Nombre 
    Edad 
    Peso 
    Estatura 
    Tipo de sangre 

        */
    
    /*
    
    private: accesible solo para la clase 
    public: accesible para todos 
    protected: accesibles [ara la clase y sus hijos / sub tipos de dato.
    */

    protected String nombre; 
    protected int edad; 
    protected double peso;
    protected double estatura;
    protected String tipoSangre;

    public Paciente(String nombre, int edad, double peso, double estatura, String tipoSangre) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + ", tipoSangre=" + tipoSangre + '}';
    }
    
//    if(el hijo tiene toString ){
//        usar el toString del hijo 
//    }else{
//        usar el toString del padre
//}
    
    
}
