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
        Scanner lector_input = new Scanner(System.in);
        if(lector_input.hasNextInt()==true){
            int opcion = lector_input.nextInt();
            if(opcion==1){
               ejercicio_1();   
            }
            if(opcion==2){
            System.out.println("ejercicio 2");
            }
            if(opcion==3){
            System.out.println("ejercicio 3");
             }
        }
        else{
            System.out.println("Por favor introduzca una opción valida");
        }   
        
        System.out.println("¿Desea continuar la ejecucion?");
        System.out.println("Si(1) No(0)");
        lector_input = new Scanner(System.in);
        if(lector_input.hasNextInt()==true){
            ejecucion = lector_input.nextInt();
            if(ejecucion==0)
            {
                System.out.println("Adios");
            }
        }
        else{
            System.out.println("Por favor digite una opción valida");
        }
        }     
    }
    static void ejercicio_1()
    {
        System.out.println("Ingrese el numero n");
        Scanner input_numeros = new Scanner(System.in);
        if(input_numeros.hasNextInt()==true)
        {
            System.out.println("Ingrese el numero m");
            int numero_n = input_numeros.nextInt();
            input_numeros = new Scanner(System.in);
            if(input_numeros.hasNextInt()==true)
            {
                int numero_m = input_numeros.nextInt();
                for(int i=1; i<=numero_n; i++)
                {
                    for(int j=1; j<=numero_m; j++)
                    {
                        System.out.print(i*j+" ");
                    }
                    System.out.println("");
                }
            }
        }
    }
    static void ejercicio_2()
    {
        
    }
}
