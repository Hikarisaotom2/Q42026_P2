/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29102026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_29102026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Clase> clases = new ArrayList();
        ArrayList<Alumno> alumnos= new ArrayList();;
        
        Alumno Carlos = new Alumno("Carlos Varela", 123,"Ing Sistemas/ Datos", "carlos2unitec.edu");
        Alumno Cesar = new Alumno("Cesar Mendoza", 124,"Ing Sistemas/ Datos", "cesar@unitec.edu");
        Alumno Jonathan  = new Alumno("Jonathan Rojas", 125,"Ing Sistemas/ Datos", "Jonathan@unitec.edu");
        Alumno Manuel = new Alumno("Manuel Rodriguez", 126,"Ing Sistemas/ Datos", "Manuel@unitec.edu");
        alumnos.add(Carlos);
        alumnos.add(Cesar);
        alumnos.add(Jonathan);
        
        Clase progra1 = new Clase("Programacion 1", "CCC104");
        Clase progra2 = new Clase("Programacion 2", "CCC105");
        Clase progra3 = new Clase("Programacion 3", "CCC106");
        
        clases.add(progra1);
        clases.add(progra2);
        clases.add(progra3);
           /*
            sistema de matricula de unitec 
            1)crear clases en el sistema 
            2 ) crear alumnos 
            3) modificar alumnos (nombre, carrera)-> NO CREAR METODOS PARA ACTUALIZAR LAS CLASES 
            4) modificar clases 
            5) asistencia 
            6) matricular
            7) listar detalles de clase 
            8) info de alumnos 
        */
        while(true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese la opcion");
            int op = entrada.nextInt();
            switch (op) {
                case 3: // modificar 
                    modificarAlumno(alumnos);
                    break;
                case 5: // asistencia 
                    asistencia(clases);
                    break;
                case 6:// Matricula
                    matricular(clases,alumnos);
                    break;
                case 7:
                    listarClases(clases);
                    break;
            }
                   
        }
        

     
    }
    
    public static void asistencia(ArrayList<Clase> clases){
        System.out.println("Asistencia");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la pos de la clase ");
        int posClase = entrada.nextInt();
        Clase claseAsistencia = clases.get(posClase);
        
        for (int i = 0; i < claseAsistencia.getAlumnos().size(); i++) {
            Alumno alumnoActual = claseAsistencia.getAlumnos().get(i);
            System.out.println(alumnoActual.getNombre()+" Presente? 1 si  2 no");
            int presente = entrada.nextInt();
            
            if(presente==1){// presente 
                // nada
            }else{ // no presente, aumentar inasistencias +1
                alumnoActual.aumentarInasistencia();
                System.out.println("Inasistencia registrada :(");
            }
        }// fin del for 
        
    }// fin del metodo 
    
    public static void modificarAlumno(ArrayList<Alumno> alumnos){
        Scanner entrada = new Scanner(System.in);
       listarAlumnos(alumnos);
       System.out.println("Ingrese la pos del alumno");
       int posAlumno = entrada.nextInt();
       Alumno alumnoModificar = alumnos.get(posAlumno);
       
       
       // NOTA: por ahora solo modificaremos el nombre, luego se agregaran el resto de funciones... 
        System.out.println("Modiifcando nombre...");
        System.out.println("Ingrese el nuevo nombre");
        entrada.nextLine();
        String nuevoNombre = entrada.nextLine();
        
        
        // modificando nombre...
        alumnoModificar.setNombre(nuevoNombre);
        System.out.println("Nombre actualizado con exito!");
       
    }
    
    
   public static void matricular(ArrayList<Clase> clases, ArrayList<Alumno> alumnos){
       Scanner entrada = new Scanner(System.in);
       // selecciones la clase en la que vamos a matriclular 
       listarClases(clases);
       System.out.println("Ingrese la pos de la clase");
       int posClase = entrada.nextInt();
       // seleccionemos al estudiante que vamos a matricular 
       listarAlumnos(alumnos);
       
       // NOTA: COMPLETAR CON UN SUB MENU PARA DECIDIR QUE ATRIBUTO QUEREMOS MODIFICAR 
       
       System.out.println("Ingrese la pos del alumno");
       int posAlumno = entrada.nextInt();
       
       Clase claseMatricular = clases.get(posClase);
       Alumno alumnoMatricular = alumnos.get(posAlumno);
       
       // Por cada vez que instanciamos se crea un objeto completamente buevo, sin importar el contenido...
//       Alumno nuevoAlumno = new Alumno("juan", 123, "hola", "hola"); // 0801 ESTO NO FUNCIONARIA PARA LA ACTUALIZACION AUTOMATICA
//       claseMatricular.matricular(nuevoAlumno);
       
       
       claseMatricular.matricular(alumnoMatricular);
   }
   
   
   public static void listarClases(ArrayList<Clase> clases){
       System.out.println("CLASES ");
       for (int i = 0; i < clases.size();i++) {
           System.out.println(i+") "+ clases.get(i));
       }
       System.out.println("");
   }
   
   public static void listarAlumnos(ArrayList<Alumno> alumnos){
       System.out.println("ALUMNOS");
        for (int i = 0; i < alumnos.size();i++) {
           System.out.println(i+") "+ alumnos.get(i));
       } 
        System.out.println("");
   }
    
//    
//    public static void crearClases() {
//        if (totalClases >= listaClases.length) {
//            System.out.println("Limite de clases alcanzado.");
//            return;
//        }
//        System.out.print("Ingrese codigo de la clase: ");
//        String codigo = scanner.nextLine();
//        System.out.print("Ingrese nombre de la clase: ");
//        String nombre = scanner.nextLine();
//        
//        listaClases[totalClases] = new ClaseUnitec(codigo, nombre);
//        totalClases++;
//        System.out.println("Clase creada exitosamente.");
//    }
    
}
