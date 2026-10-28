/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_26102026;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_26102026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
        
//            CuentaBancaria  bac = new  CuentaBancaria(555555, 1500, "Claudia Cortes", "1234");
//         CuentaBancaria  bac2 = new  CuentaBancaria(555556, 15000, "Juan Gomez", "2222");
//         CuentaBancaria  bac3 = new  CuentaBancaria(555557, 160, "Juan Perez", "3333");
//         

        
        /*
        variables de escritura y lectura: 
        escritura: modificar la variable 
        lectura: ver el valor de la variable
        
        
        -> valor de solo lectura: podemos ver cual es su valor, pero no lo podemos modificar
        ej: numeor de cuenta en un banco, numero de id, numero de cuenta en la universidad 
        
        -> valor de solo escritura: variables a las que les podemos cambiar el valor, pero no podemos ver cual es el valor actual. 
        ej: constraseñas y claves 
        
        */
        
    
         
         /*
            Simular que tenemos una banca en linea: 
            
         -> crear cuentas 
         -> eliminar cuentas 
         -> depositar desde una cuenta A a una Cuenta B 
            -> se resta dinero de la cuenta A y se suma en la cuenta b 
            -> verificar la clave para realizar la operacion 
         -> Depositos de terceros 
            -> pedir un DNI para realizar la transaccion 
         -> Retirar dinero 
            -> verificar la clave 
         -> Historial: en el se deben guardar todas las transacciones que estamos realizando
         -> ( Tipo de transaccion (depositos terceros, depositos entre cuentas, retiros , crear eliminar), 
         ->informacion: la/las cuentas involucradas
         -> fecha (27/10/2026)
         */

            Scanner entrada = new Scanner(System.in);
         while (true) {
             System.out.println("1 crear cuenta \n"
                     + "2 eliminar  \n"
                     + "3 depositos entre cuentas \n"
                     + "4 depositos terceros \n"
                     + "5 retiro de dinero \n"
                     + "6 ver historial \n"
                     + "7 listar cuentas creadas");
             int op = entrada.nextInt();
             switch (op) {
                 case 1->{
                     
                     CuentaBancaria nuevaCuenta = crearCuenta();
                     cuentas.add(nuevaCuenta);
                     System.out.println("CUENTA AGREGADA EXITOSAMENTE! \n");
                 }
                 
                 case 2->{
                    listarCuentas(cuentas);
                     System.out.println("Ingrese la pos que desea eliminar");
                     int pos = entrada.nextInt();
                     cuentas.remove(pos);
                     System.out.println("CUENTA ELIMINADA EXITOSAMENTE!!! :)");
                 }
                 
                 case 7->{
                     listarCuentas(cuentas);
                 }
                 default ->{}
             }
        }
       
        
    }
    
    
    public static void listarCuentas(ArrayList<CuentaBancaria>cuentas) {
        System.out.println("CUENTAS CREADAS ");
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println(i+" ) "+cuentas.get(i));
        }
    }
    
    public static CuentaBancaria crearCuenta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del propietario: ");
        String prop = entrada.nextLine();
        System.out.println("Ingrese la clave para proteger esta cuenta: ");
        String clave = entrada.nextLine();
        
         double saldo = 0;
        Random r = new Random();
        int numeroCuenta = r.nextInt(5000, 10000);
        
        CuentaBancaria nuevaCuenta = new CuentaBancaria(numeroCuenta, saldo, prop, clave);
        
        return nuevaCuenta;
    }
    
    
}
