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
                ejercicio_2();
            }
            if(opcion==3){
                ejercicio_3();
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
        System.out.println("Ingrese el numero n");
        Scanner input_numeros = new Scanner(System.in);
        if(input_numeros.hasNextInt()==true)
        {
            int numero_n = input_numeros.nextInt();
            int numero_impar = 1;
            int suma_numeros_impares = 0;
            for(int i=1; i<=numero_n; i++)
            {
                System.out.print(numero_impar);
                suma_numeros_impares = suma_numeros_impares + numero_impar;
                numero_impar += 2;
                if(i<numero_n)
                    System.out.print("+");
            }
            System.out.print("="+suma_numeros_impares);
        }
    }
    static void ejercicio_3()
    {
        System.out.println("Ingrese el numero n");
        Scanner input_numeros = new Scanner(System.in);
        if(input_numeros.hasNextInt()==true)
        {
            int numero_n = input_numeros.nextInt();
            int numero_impar = 1;
            int suma_numeros_impares = 0;
            boolean suma_impares = true;
            for(int i=1; i<=numero_n; i++)
            {
                if(suma_impares)
                { 
                    int numeros_a_sumar=0;
                    for(int j = 1; j<numero_n;j++)
                    {
                        numeros_a_sumar+=j;
                    }
                    suma_impares=false;
                    for(int j=1;j<=numeros_a_sumar;j++)
                    {
                        numero_impar+=2;
                    }
                }
                if(suma_impares==false)
                {
                    System.out.print(numero_impar);
                    suma_numeros_impares = suma_numeros_impares + numero_impar;
                    numero_impar+=2;
                }
                if(i<numero_n)
                    System.out.print("+");
            }
            System.out.print("="+suma_numeros_impares);
        }
        
    }
}
