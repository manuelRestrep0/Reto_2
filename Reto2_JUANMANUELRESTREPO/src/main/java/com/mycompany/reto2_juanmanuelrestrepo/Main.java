package com.mycompany.reto2_juanmanuelrestrepo;
import java.util.Scanner;
import java.util.concurrent.RejectedExecutionException;
public class Main {
    public static void main(String[] args)
    {
        int ejecucion = 1;
       
        while(ejecucion==1){
            System.out.println("Seleccione un ejercicio");
        System.out.println("opciones: 1) 2) 3)");
        Scanner opcion = new Scanner(System.in);
        String opcion_aux = opcion.next();
        int opcion_final = Integer.parseInt(opcion_aux);
        if(opcion_final==1){
            System.out.println("Ejercicio 1");
            
        }
        if(opcion_final==2){
            System.out.println("ejercicio 2");
        }
        if(opcion_final==3){
            System.out.println("ejercicio 3");
        }
        System.out.println("¿Desea continuar la ejecucion?");
        System.out.println("Si(1) No(0)");
        Scanner ejecucion_aux = new Scanner(System.in);
        String ejecucion2_aux = ejecucion_aux.next();
        ejecucion = Integer.parseInt(ejecucion2_aux);
        if(ejecucion!=1)
        {
            System.out.println("Adios");
        }
        }     
    }
}
