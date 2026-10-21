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
        
 
        int [][] matrizClase =  new int[2][2];
        matrizClase[0][0] = 9;
        matrizClase[0][1] = 11;
        matrizClase[1][0] = 30;
        matrizClase[1][1] = 50;
                
        int acum = sumarMatriz(matrizClase, 0,0);
        System.out.println("El resultado es: "+ acum);
        
//        for (int i = 0; i < matrizClase.length; i++) {
//            for (int j = 0; j < matrizClase[0].length; j++) {
//                acum+=matrizClase[i][j];
//            }
//        }
    }
   

    
    public static int sumarMatriz(int[][] matrizClase, int i, int j ){
        /*
        1 Como aumentar i, j
        2 como reiniciar j
        3 Como enviar el resultado al main
        */
        
        if(i==matrizClase.length){
            return 0;
        }
        if(j == matrizClase[i].length){
            return sumarMatriz(matrizClase, i + 1, 0);
        }
        return matrizClase[i][j] + sumarMatriz(matrizClase, i, j +1);
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
