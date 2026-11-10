/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_09112026;

/**
 *
 * @author claudiacortes
 */
public class Docente {
    protected String nombre;
    protected String carrera;
    protected String fechaContratacion;
    protected String facultad;

    public Docente(String nombre, String carrera, String fechaContratacion, String facultad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechaContratacion = fechaContratacion;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    // metodo polimorfico 
    public void generarBoletaPago(){
        System.out.println("Pendiente.....");
    }

    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + ", carrera=" + carrera + ", fechaContratacion=" + fechaContratacion + ", facultad=" + facultad + '}';
    }
    
    
    
}
