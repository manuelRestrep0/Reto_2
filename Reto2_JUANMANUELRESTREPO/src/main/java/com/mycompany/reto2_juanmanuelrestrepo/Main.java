package com.mycompany.reto2_juanmanuelrestrepo;
import java.util.Scanner;
import java.util.concurrent.RejectedExecutionException;
public class Main {
    public static void main(String[] args)
    {
        /*
        Cuerpo del programa donde se encuentra un menú con opciones para elegir
        el ejercicio que se quiera ejecutar.
        La variable entera ejecucion cumple la función de permitir la entrada
        al while para ejecutar el programa las veces que se requiera 
        sin tener que volver a compilarlo. Luego de ejecutar algún ejercicio
        se mostrará un menú que le permite elegir si desea o no continuar
        la ejercición.
        Las opciones se encuentran dentro de una condición if que cumple la
        función de verificar que la entrada sea una variable Int para 
        evitar que el programa colapse. (esta condición se repite en el
        menú para elegir continuar o cerrar el programa y en todas las funciones
        que corresponden a los ejercicios)
        Al elegir una opcion, se ejecuta la función que corresponda al ejercicio
        seleccionado.
        */
        int ejecucion = 1;
        while(ejecucion==1){ // Bucle donde se ejecuta el programa principal
            System.out.println("Seleccione un ejercicio");
            System.out.println("opciones ejercicios: 1) 2) 3) 4) ");
            System.out.println("5) Para cerrar el programa");
            Scanner lector_input = new Scanner(System.in);
            if(lector_input.hasNextInt()==true){ //condición para verificar la entrada
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
                if(opcion==4)
                {
                    System.out.println("Introduzca la cantidad de dinero");
                    lector_input = new Scanner(System.in);
                    if(lector_input.hasNextInt()==true){
                        int dinero = lector_input.nextInt();
                        ejercicio_4(dinero);
                    }
                }
                if(opcion==5)
                {
                    System.out.print("Hasta luego");
                    ejecucion=0;
                }
            }
            else{
                System.out.println("Por favor introduzca una opción valida");
            }   

            /*System.out.println("¿Desea continuar la ejecucion?");
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
            }*/
        }     
    }
    static void ejercicio_1()
    {
        /*
        Se pide al usuario ingresar dos numeros y se verifica ambas entradas
        con el condicional if para asegurarse que sean variables enteras positivas.
        Por medio de dos bucles for anidados se realizan las multiplicaciones
        y se muestran en pantalla.
        */
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
                    /*
                    ESte bucle corresponde al numero que se va a multiplicar
                    */
                    for(int j=1; j<=numero_m; j++)
                    {
                        /*
                        Este bucle corresponde al que va a realizar las multiplicaciones.
                        */
                        System.out.print(i*j+" ");
                    }
                    System.out.println(""); // Esta linea realiza un salto de 
                                            //linea al terminar las tablas de 
                                             //multiplicación de un numero
                }
            }
        }
    }
    static void ejercicio_2()
    {
        /*
        Se le pide al usuario ingresar un numero entero positivo, se usa un 
        condicional para verificar que la entrada es correcta y se entra a un 
        bucle que va sumando los numeros impares hasta llegar al cuadrado
        del numero ingresado.
        */
        System.out.println("Ingrese el numero n");
        Scanner input_numeros = new Scanner(System.in);
        if(input_numeros.hasNextInt()==true)
        {
            int numero_n = input_numeros.nextInt();
            int numero_impar = 1; // se inicializa una variable para almacenar los numeros impares
            int suma_numeros_impares = 0; // variable para almacenar la suma de los numeros impares
            for(int i=1; i<=numero_n; i++)
            {
                /*
                Se imprime el numero impar que este en la variable numero_impar,
                se suma en la variable suma_numeros_impares luego se le suma
                2 a numero_impar para pasar al siguiente numero impar.
                El condicional if esta para evitar imprimir un + al final 
                de la suma.
                */
                System.out.print(numero_impar);
                suma_numeros_impares = suma_numeros_impares + numero_impar;
                numero_impar += 2;
                if(i<numero_n)
                    System.out.print("+");
            }
            // al terminar el bucle se imprime la suma que corresponde al 
            // valor del numero ingresado al cuadrado.
            System.out.print("="+suma_numeros_impares);
        }
    }
    static void ejercicio_3()
    {
        /*
        Se le pide al usuario ingresar un numero entero positivo y se verifica
        que la entrada sea correcta.
        */
        System.out.println("Ingrese el numero n");
        Scanner input_numeros = new Scanner(System.in);
        if(input_numeros.hasNextInt()==true)
        {
            int numero_n = input_numeros.nextInt();
            int numero_impar = 1;
            int suma_numeros_impares = 0;
            boolean suma_impares = true; //esta variable le permite al programa 
            for(int i=1; i<=numero_n; i++) // saber cuando debe sumar los impares.
            {
                /*
                La primera parte del bucle lo que hace es aumentar la variable
                que almacena el numero impar hasta llegar al primer numero
                impar que le corresponde al numero ingresado. Luego de realizado
                esto, la variable suma_impares cambia y permite sumar los numeros
                que corresponden al valor ingresado para hallar su valor al cubo.
                */
                if(suma_impares)
                { 
                    /*
                    */
                    int numeros_a_sumar=((numero_n*(numero_n+1))/2)-numero_n;
                    suma_impares=false; //indica que se ha hecho la suma
                    for(int j=1;j<=numeros_a_sumar;j++)
                    {
                        /*
                        en este bucle se aumenta el numero impar
                        hasta llegar al valor que se halló en la suma que se 
                        almacenó en numeros_a_sumar y este numero impar corresponde
                        al primer numero impar para empezar la suma y hallar
                        el cubo del numero_n.
                        */
                        numero_impar+=2;
                    }
                }
                if(suma_impares==false)
                {
                    /*
                    encontrado ya el primer numero impar, se suma hasta llegar 
                    al numero_n, se imprime la variable numero_impar y luego
                    se suma en suma_numeros_impares y se le aumenta 2 al tamano
                    de numero_impar.
                    */
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
    static void ejercicio_4(int cantidad_dinero)
    {
        boolean ejecucion = true;
        int billete_100=0 , billete_50=0 , billete_20=0, billete_10=0 , billete_5=0 , billete_2=0 , billete_1=0;
        int moneda_500=0 , moneda_200=0 , moneda_100=0 , moneda_50=0;
        while(ejecucion)
        {
            if(cantidad_dinero==0)
            {
                ejecucion=false;
                if(verificar_variable(billete_100))
                    System.out.println(billete_100+" billete(s) de 100.000");
                if(verificar_variable(billete_50))
                    System.out.println(billete_50+" billete(s) de 50.000");
                if(verificar_variable(billete_20))
                    System.out.println(billete_20+" billete(s) de 20.000");
                if(verificar_variable(billete_10))
                    System.out.println(billete_10+" billete(s) de 10.000");
                if(verificar_variable(billete_5))
                    System.out.println(billete_5+" billete(s) de 5.000");
                if(verificar_variable(billete_2))
                    System.out.println(billete_2+" billete(s) de 2.000");
                if(verificar_variable(billete_1))
                    System.out.println(billete_1+" billete(s) de 1.000");
                if(verificar_variable(moneda_500))
                    System.out.println(moneda_500+ "moneda(s) de 500");
                if(verificar_variable(moneda_200))
                    System.out.println(moneda_200+" moneda(s) de 200");
                if(verificar_variable(moneda_100))
                    System.out.println(moneda_100+" moneda(s) de 100");
                if(verificar_variable(moneda_50))
                    System.out.println(moneda_50+" moneda(s) de 50");
            }
            if(cantidad_dinero>=100000)
            {
                billete_100+=1;
                cantidad_dinero-=100000;
                continue;
            }
            if(cantidad_dinero>=50000)
            {
                billete_50+=1;
                cantidad_dinero-=50000;
                continue;
            }
            if(cantidad_dinero>=20000)
            {
                billete_20+=1;
                cantidad_dinero-=20000;
                continue;
            }
            if(cantidad_dinero>=10000)
            {
                billete_10+=1;
                cantidad_dinero-=10000;
                continue;
            }
            if(cantidad_dinero>=5000)
            {
                billete_5+=1;
                cantidad_dinero-=5000;
                continue;
            }
            if(cantidad_dinero>=2000)
            {
                billete_2+=1;
                cantidad_dinero-=2000;
                continue;
            }
            if(cantidad_dinero>=1000)
            {
                billete_1+=1;
                cantidad_dinero-=1000;
                continue;
            }
            if(cantidad_dinero>=500)
            {
                moneda_500+=1;
                cantidad_dinero-=500;
                continue;
            }
             if(cantidad_dinero>=200)
            {
                moneda_200+=1;
                cantidad_dinero-=200;
                continue;
            }
              if(cantidad_dinero>=100)
            {
                moneda_100+=1;
                cantidad_dinero-=100;
                continue;
            }
               if(cantidad_dinero>=50)
            {
                moneda_50+=1;
                cantidad_dinero-=50;
                continue;
            }   
        }
    }
    static boolean verificar_variable(int variable)
    {      
        boolean verificacion = true;
        if(variable==0)
            verificacion=false;
        return verificacion;
    }
}
