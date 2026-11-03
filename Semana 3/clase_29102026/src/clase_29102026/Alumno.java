/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_29102026;

/**
 *
 * @author claudiacortes
 */
public class Alumno {
    /*
    
    nombre, cuenta, carrera, correo*, asistencias*/
    
    private String nombre;
    private int cuenta; 
    private String carrera;
    private String correo; 
    private int asistencias;

    public Alumno(String nombre, int cuenta, String carrera, String correo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.correo = correo;
        this.asistencias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return nombre + "- " + cuenta  +" asistencias=" + asistencias + '}';
    }
    
    
}
