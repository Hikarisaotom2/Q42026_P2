/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_26102026;

/**
 *
 * @author claudiacortes
 */
public class CuentaBancaria {
    // scope: la variable vive dentro de las llaves donde fue creada
    /// la mayoria de los lenguajes utilizan la variable del scope mas cercano
    
    // controles de acceso. 
    /*
        -> public: visisble para la clase y cualquier elemento que tiene acceso a la clase... 
            por defecto es la configuracion base que se aplica a los elementos en una clase 
        -> private:  visisble unicamente para la clase 
        -> pendiente..... 
    */
    private int numeroCuenta;
    private double saldo;
    private String nombreProp;
    private String clave;

    public CuentaBancaria(int numeroCuenta, double saldo, String nombreProp, String clave) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreProp = nombreProp;
        this.clave = clave;
    }
    

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreProp() {
        return nombreProp;
    }

    public void setNombreProp(String nombreProp) {
        this.nombreProp = nombreProp;
    }
    

    // modificar el valor 
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    

  
  
}
