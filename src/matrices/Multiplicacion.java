/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author JUAN DAVID
 */
  public class Multiplicacion {

      Scanner teclado = new Scanner(System.in);
     
      /**
       * En este metodo se llena la matriz 1 y la retorna con sus valores
       * @param matriz
       * @param filas
       * @param columnasF
       * @return 
       */
        public int[][] llenarMatriz(int matriz[][],int filas, int columnasF){
             System.out.println("Introduzca valores de la matriz 1:");
             for(int i=0;i<filas;i++) {
              for(int j=0;j<columnasF;j++) {
                matriz[i][j]=teclado.nextInt();
            }     
        }
             return matriz;
    }
        /**
         * En este metodo se llena la matriz 2 y la retorna con sus valores
         * @param matriz2
         * @param filas
         * @param columnasF
         * @param columnas2
         * @return 
         */
        public int[][] llenarMatriz2(int matriz2[][],int filas, int columnasF, int columnas2){  
        
            System.out.println("Introduzca valores de la matriz 2:");
             for(int i=0;i<columnasF;i++) {
              for(int j=0;j<columnas2;j++) {
                matriz2[i][j]=teclado.nextInt();  
              }
        
           }
             return matriz2;
       }
        /**
         * Este metodo muestra las matrices que se digitaron
         * @param matriz
         * @param matriz2
         * @param filas
         * @param columnasF
         * @param columnas2 
         */
        public void imprimirMatriz(int [][]matriz,int[][] matriz2, int filas,int columnasF,int columnas2){
           
            System.out.println(" matriz 1:"); 
            for(int i=0;i<filas;i++){
              System.out.println(""); 
            for(int j=0;j<columnasF;j++) 
                   System.out.print(matriz[i][j]+" \t"); 
 
            }
              System.out.println(""); 
             System.out.print(" matriz 2:"); 
            for(int i=0;i<columnasF;i++) {
                 System.out.println(""); 
              for(int j=0;j<columnas2;j++) {
                System.out.print(matriz2[i][j]+" \t");  
              }
            
           }
            
        }
        /**
         * Este metodo retorna el resultado de la multiplicacion
         * @param matriz
         * @param matriz2
         * @param resultado
         * @param filas
         * @param columnasF
         * @param columnas2
         * @return 
         */
        public int[][] operacion(int [][]matriz,int[][] matriz2,int resultado[][],int filas,int columnasF,int columnas2){
         for(int i=0;i<filas;i++)
            for(int j=0;j<columnas2;j++) {
                for(int k=0;k<columnasF;k++){
                    resultado[i][j]=(resultado[i][j] +(matriz[i][k]*matriz2[k][j]));
                }
              }
         return resultado;
     }
        /**
         * Este metodo muestra el producto de las matrices
         * @param resultado
         * @param filas
         * @param columnas2 
         */
        public void resultado(int resultado[][],int filas,int columnas2){
         int i,j;
          System.out.println(""); 
          System.out.print(" Multiplicacion :");
            for(i=0;i<filas;i++){
                 System.out.println(""); 
     	      for(j=0;j<columnas2;j++){
     		System.out.print(resultado[i][j]+" \t");
		 }
        }
    }
  }