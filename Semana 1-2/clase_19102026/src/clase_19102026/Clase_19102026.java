/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_19102026;

/**
 *
 * @author claudiacortes
 */
public class Clase_19102026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int fact=Factorial(4);
        System.out.println(fact);
        
        
        /*
        1 tipo de dato  
        2 memoria -> tackoverflow 
        */
        
        int acum = 0;
        int[][] matriz = new int [2][2];
        matriz[0][0]= 3;
        matriz[0][1]= 3;
        matriz[1][0]= 2;
        matriz[1][1]= 2;
 
        for (int i = 0; i < matriz.length; i++) {// filas 
            for (int j = 0; j < matriz[0].length; j++) {// columnas 
                acum+= matriz[i][j];
            }// fin del for 
        }// fin del for 
        
        System.out.println("El resultado es: "+acum);
        
//        int res = sumaMatriz(..);
//         System.out.println(res);
        
    }
    
    
    
    public static void sumaMatriz(int [][] matriz, int i, int j){
        /*
        1 como aumentar i, j 
        2 como reiniciar j 
        3 como enviar el resultado al main
        */
        if(i==matriz.length && j== matriz.length){// caso base 
        }else{// caso recursivo 
            return sumaMatriz(matriz); 
        }
    } 
    
    public static int Factorial (int num){
        if(num==0){ // caso base 
            return 1;
        }else{ // caso recursivo 
            int temp = num-1;
            return num*Factorial(temp);
        }
    }// fin del metodo 
    
    /*
    matriz = 
        0 1 
    0 [3][3]
    1 [2][2]
    
    int rest = sumar(Matriz)
    // rest = 10 
    
    */
    
}
