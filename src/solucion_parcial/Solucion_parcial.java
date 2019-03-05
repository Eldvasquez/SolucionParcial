/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion_parcial;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * Jorge Ivan Vasquez Sosa (0901-16-4067)
 */
public class Solucion_parcial {
    
    // variables globales
public static String Matriz[][]= new String[10][4],Strnombre,Strnota,StrResultado,Strpromedio;
public static int IntNota,Opcion,Intpromedio;
public static DecimalFormat dc= new DecimalFormat("#.00");
public static float FtlPromedio=100,Ftltotal;



public static void Llenarmatriz(){
    for (int i=0;i<10;i++){ // Aqui se va a llenar la matriz n veces hasta que llegue a 10
     Matriz[i][0]= JOptionPane.showInputDialog("Ingrese el nombre del alumno "+(i+1)); // Se pide al Usuario que los Nombres que iran en la matriz
     
     IntNota=(int)(1+(Math.random())*100); // se crean notas aleatorios del 1 al 100
     Strnota=Integer.toString(IntNota);
     Matriz[i][1]=Strnota;  
     
     if(IntNota<=60){
         Matriz[i][2]= "Reprobado"; // si la nota es menor a 61 entonces aparecera reprobado
     }else if(IntNota >=61){
         Matriz[i][2]="Aprobado"; // si la nota es mayor a 61 entonces aparecera aprobado
        
    }
     Ftltotal= IntNota/FtlPromedio;
     Matriz[i][3]=String.valueOf(dc.format(Ftltotal)); // mostrar el promedio de la clase
    
    
   
    }
    
    
    
}

public static void Mostrarmatriz(){
    System.out.println("Nombre-----------Nota-----------Resultado-------Promedio de la clase"); //mostrara en pantalla lo que esta escrito
    for(int j=0;j<10;j++){
        System.out.println("|"+Matriz[j][0]+"\t\t"+Matriz[j][1]+"\t\t"+Matriz[j][2]+"\t"+Matriz[j][3]); // manda a llamar y escribe en pantalla todo lo que esta escrito en llenadoMatriz
    }
}
    
    public static void main(String[] args) {
       
        Llenarmatriz(); // manda a llamar la funcion LLenarMatriz
        Mostrarmatriz(); // manda a llamar la funcion MostrarMatriz
       
    }
    
}
