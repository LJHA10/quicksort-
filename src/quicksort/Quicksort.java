/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisj
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
            String entrada;
            
            Quicksort ord = new Quicksort();
            
            
            int arreglo[], nElementos;
             
            System.out.println("Escriba la longitud del arreglo");
            entrada = bufer.readLine();
            nElementos = Integer.parseInt(entrada);
            
            arreglo = new int [nElementos];
            
            for(int i=0;i<nElementos;i++){
                System.out.println((i+1) + ". Escriba los numeros del arreglo");
                entrada = bufer.readLine();
                arreglo[i] = Integer.parseInt(entrada);
    }
            System.out.println("Arreglo original");
            ord.mostrarArreglo(arreglo);
            System.out.println("Arreglo ordenado");
            ord.quick(arreglo, 0, arreglo.length-1);
        
    }
    
    //Metodo quick
    public void quick(int[] arreglo, int primero, int ultimo){
        int i, j, pivote, aux;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero + ultimo)/2];
        System.out.println("El pivote es " + pivote);
        do{
            while(arreglo[i]<pivote){
                i++;
            }
            while(arreglo[j]>pivote){
                j--;
            }
            if(i<=j){
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(primero <= j){
            quick(arreglo, primero, j);
        }
        if(i<ultimo){
            quick(arreglo, i, ultimo);
        }
        mostrarArreglo(arreglo);
             
    }
    
    
     public void mostrarArreglo(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
     }
}
    
