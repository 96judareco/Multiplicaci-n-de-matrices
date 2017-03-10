/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 * @version 1.0.0
 * @author JUAN DAVID REYES CORTES
 */
public class Matrices {
      
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      
           Scanner teclado = new Scanner(System.in);
           Multiplicacion x=new Multiplicacion();
           System.out.print("Cuantas fila tiene la matriz 1:");
           int filas=teclado.nextInt();
           //se pide  de esta forma para que la matriz sea cuadrada
           System.out.print("Digite las columnas de la matriz 1 y las filas de la matriz 2:");
           int columnasF=teclado.nextInt();
           System.out.print("Cuantas columnas  la matriz 2:");
           int columnas2=teclado.nextInt();
           /**
            * inicio de matrices
            */
           int matriz[][] = new int[filas][columnasF];
           int matriz2[][] = new int[columnasF][columnas2];
           int resultado[][] = new int[filas][columnas2];
         /**
          * llamado de las funciones 
          */
          x.llenarMatriz(matriz, filas, columnasF);
          x.llenarMatriz2(matriz2, filas, columnasF, columnas2);
          x.imprimirMatriz(matriz, matriz2, filas, columnasF, columnas2);
          x.operacion(matriz, matriz2, resultado, filas, columnasF, columnas2);
          x.resultado(resultado, filas, columnas2);
  }
}