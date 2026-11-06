/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04112026;

/**
 *
 * @author claudiacortes
 */
public class Masculino extends  Paciente{
    private String ultimaRevProstata;

    public Masculino(String ultimaRevProstata, String nombre, int edad, double peso, double estatura, String tipoSangre) {
        super(nombre, edad, peso, estatura, tipoSangre);
        this.ultimaRevProstata = ultimaRevProstata;
    }

    public String getUltimaRevProstata() {
        return ultimaRevProstata;
    }

    public void setUltimaRevProstata(String ultimaRevProstata) {
        this.ultimaRevProstata = ultimaRevProstata;
    }

    @Override
    public String toString() {
        return "Masculino{" + "ultimaRevProstata=" + ultimaRevProstata + '}';
    }
       
 
}
