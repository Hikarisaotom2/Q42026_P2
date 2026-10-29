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
        ArrayList<String>historial = new ArrayList<String>();

         CuentaBancaria  cuenta1 = new  CuentaBancaria(555555, 1500, "Claudia Cortes", "1234");
         CuentaBancaria  cuenta2 = new  CuentaBancaria(555556, 15000, "Juan Gomez", "1234");
         CuentaBancaria  cuenta3 = new  CuentaBancaria(555557, 160, "Juan Perez", "1234");
        
         cuentas.add(cuenta3);
         cuentas.add(cuenta2);
         cuentas.add(cuenta1);
         
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
                case 1 -> {
                    CuentaBancaria nuevaCuenta = crearCuenta();
                    cuentas.add(nuevaCuenta);
                    System.out.println("CUENTA AGREGADA EXITOSAMENTE! \n");
                    String trans= "Transaccion: Crear Cuenta \n informacion: cuenta creada "+nuevaCuenta.getNumeroCuenta()+"\n fecha: 27/10/2026";
                    historial.add(trans);
                }

                case 2 -> {
                    listarCuentas(cuentas);
                    System.out.println("Ingrese la pos que desea eliminar");
                    int pos = entrada.nextInt();
                    cuentas.remove(pos);
                    System.out.println("CUENTA ELIMINADA EXITOSAMENTE!!! :)");
                    String trans= "Transaccion: Eliminar Cuenta \n informacion: cuenta eliminada en pos "+pos+"\n fecha: 27/10/2026";
                    historial.add(trans);
                }

                case 3 -> {
                        
//                     CuentaBancaria cuentaA = buscarCuenta(cuentas);
//                     CuentaBancaria cuentaB = buscarCuenta(cuentas);
                    listarCuentas(cuentas);
                    System.out.println("Ingrese la pos de la cuenta A");
                    int posA = entrada.nextInt();
                    System.out.println("Ingrese la pos de la cuenta B");
                    int posB = entrada.nextInt();

                    CuentaBancaria cuentaA = cuentas.get(posA);
                    CuentaBancaria cuentaB = cuentas.get(posB);
                    System.out.println("Ingrese la clave de la cuenta A");
                    entrada.nextLine();
                    String clave = entrada.nextLine();
                    System.out.println("Ingrese el monto a depositar en la cuenta B");
                    double monto = entrada.nextDouble();

                    boolean transaccionExitosa = cuentaA.retirar(clave, monto);
                    if (transaccionExitosa) {
                        cuentaB.depositar(monto);
                    } else {
                        System.out.println("No se realizo el deposito a la cuenta B por un problema con la cuenta A");
                    }
                    String trans= "Transaccion: Deposito entre  Cuenta \n informacion: cuenta A "+cuentaA.getNumeroCuenta()+ "Cuenta B"+cuentaB.getNumeroCuenta()+"\n fecha: 27/10/2026";
                    historial.add(trans);

                }
                
                case 4->{
                    System.out.println("Ingrese el DNI de quien deposita ");
                    entrada.nextLine();
                    String dni = entrada.nextLine();
                    listarCuentas(cuentas);
                    // NOTA: cambiar esto a que funcione cone l metodo de buscar cuenta 
                    System.out.println("Ingrese la pos de la cuenta a depositar");
                    int posA = entrada.nextInt();
                    System.out.println("Ingrese el monto a depositar en la cuenta B");
                    double monto = entrada.nextDouble();
                    CuentaBancaria cuentaDepositar = cuentas.get(posA);
                    cuentaDepositar.depositar(monto);
                    
                     String trans= "Transaccion: Deposito terceros \n informacion: cuenta  "+cuentaDepositar.getNumeroCuenta()+ "DNI "+dni+"Monto depositado: "+monto+"\n fecha: 27/10/2026";
                    historial.add(trans);
                }
                
                case 5->{
                 System.out.println("Ingrese la clave para realizar el retiro  ");
                    entrada.nextLine();
                    String clave = entrada.nextLine();
                    listarCuentas(cuentas);
                    // NOTA: cambiar esto a que funcione cone l metodo de buscar cuenta 
                    System.out.println("Ingrese la pos de la cuenta a retirar");
                    int posA = entrada.nextInt();
                    System.out.println("Ingrese el monto a retirar en la cuenta ");
                    double monto = entrada.nextDouble();
                    
                    CuentaBancaria cuentaRetirar = cuentas.get(posA);
                    
                    cuentaRetirar.retirar(clave, monto);
                     String trans= "Transaccion: Retiro \n informacion: cuenta  "+cuentaRetirar.getNumeroCuenta()+ "Monto retirado: "+monto+"\n fecha: 27/10/2026";
                    historial.add(trans);
                }
                case 6->{
                    System.out.println("HISTORIAL DE TRANSACCIONES: ");
                    for (int i = 0; i < historial.size(); i++) {
                        System.out.println(i+")"+historial.get(i));
                    }
                }
                case 7 -> {
                    listarCuentas(cuentas);
                }
                default -> {
                }
            }
        }

    }

    public static CuentaBancaria buscarCuenta(ArrayList<CuentaBancaria> cuentas) {

        /*
            Trabajo en casa: 
        completar el metodo que busca si una cuenta existe o no dentro del arraylist 
        
        si la cuenta existe el metodo retorna la cuenta que coincide con el numero de cuenta ingresado 
        si la cuenta no existe, vamos a regresar null 
         */
        return null;
    }

    public static void listarCuentas(ArrayList<CuentaBancaria> cuentas) {
        System.out.println("CUENTAS CREADAS ");
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println(i + " ) " + cuentas.get(i));
        }
    }

    public static CuentaBancaria crearCuenta() {
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
