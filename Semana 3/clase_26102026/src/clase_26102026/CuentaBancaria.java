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
    private int numeroCuenta; // valor de solo lectura 
    private double saldo;
    private String nombreProp;
    private String clave; // valor de solo escritura 

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

    
    // Metodos para simular acciones del ATM 
    
    public boolean retirar(String clave, double monto){
        if(this.clave.equals(clave)){
           // retirar
           if(this.saldo-monto>=0){
//               this.saldo = this.saldo-monto;
               setSaldo(this.saldo-monto);
               System.out.println("Retiro exitoso.....");
               return true;
           }else{
               System.out.println("No tiene dinero :(");
               return false;
           }
        }else{
        // no se puede retirar 
            System.out.println("Clave incorrecta no puede realizar esta transaccion....");
            return false;
        }
        
    }
    
    public void depositar(double monto){
        setSaldo(this.saldo+monto);
        System.out.println("Deposito realizado con exito :)");
    }
    
    /*
    REGLAS
        1 no le podemos cambiar el nombre 
        2 no le podemos modificar los paramaetros 
        2 no le podemos modificar el tipo de dato de retorno 
    */
    @Override
    public String toString() {
        return "Detalle de cuenta bancaria: \n ->Num Cuenta: "+this.numeroCuenta+ "\n ->Propietario: "+this.nombreProp+ "\n ->Saldo: "+this.saldo;
                
    }
    
  
}
