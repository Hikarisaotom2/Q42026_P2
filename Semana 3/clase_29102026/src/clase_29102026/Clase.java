/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_29102026;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase {
    private String nombre;
    private String seccion;
    private ArrayList<Alumno> alumnos;
    

    public Clase(String nombre, String seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.alumnos = new ArrayList();
    }
    
    
/*
    matricular 
    asistencia 
    lis
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void matricular(Alumno nuevoAlumno){
        this.alumnos.add(nuevoAlumno);
        System.out.println("Alumnos matriculado con exito!");
    }

    @Override
    public String toString() {
        
        /*
        nombre seccion 
        alumnos: 
            0 juan 
            1 pedro 
            2 mario......
        */
        return "Clase{" + "nombre=" + nombre + ", seccion=" + seccion + " \n, alumnos=" + alumnos + '}';
    }
    
    
    
    
    /*
     static class ClaseUnitec {
        String codigo;
        String nombre;
        Alumno[] matriculados = new Alumno[50];
        int[] inasistencias = new int[50];
        
        int totalMatriculados = 0;

        public ClaseUnitec(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }
    }

    static class Alumno {
        String id;
        String nombre;
        String carrera;

        public Alumno(String id, String nombre, String carrera) {
            this.id = id;
            this.nombre = nombre;
            this.carrera = carrera;
        }
    }

    static Scanner scanner = new Scanner(System.in);
    static ClaseUnitec[] listaClases = new ClaseUnitec[50];
    static int totalClases = 0;
    
    
    
    */
}
