/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Carlos Vasquez 00224317
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        
    }
 
    public static void menu(){
        boolean bandera=true;
        Scanner select= new Scanner(System.in);
        
        while (bandera){     
        System.out.println("----------------------------------------------------");
        System.out.println("|                       Menu                       |");
        System.out.println("----------------------------------------------------");
        System.out.println("|                1) Ejercicio 1                    |");
        System.out.println("|                2) Ejercicio 2                    |");
        System.out.println("|                3) Ejercicio 3                    |");
        System.out.println("|                4) Ejercicio 4                    |");
        System.out.println("|                5) Salir                          |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("Escriba el numero de la opcion a la que desea entrar:");
        String opcions=select.nextLine();
        int opcion= Integer.parseInt(opcions);
        
        if(opcion>5){
            System.out.println("opcion invalida, intente de nuevo.");
        }
        else{        
        switch (opcion){
            case 1: System.out.println("opcion 1");
                    ejercicioUno();
                    break;
            case 2: System.out.println("opcion 2");
                    ejercicioDos();
                    break;
            case 3: System.out.println("opcion 3");
                    ejercicioTres();
                    break;
            case 4: System.out.println("opcion 4");
                    ejercicioCuatro();//erreglar que el total salga con dos decimales 
                    break;
            case 5: System.out.println("|--------------------------------------------------|");
                    System.out.println("|                Ha salido del sistema             |");
                    System.out.println("|--------------------------------------------------|");
                    bandera=false;break;
            
        }}
            
        }       
    }
    
    public static void ejercicioUno(){
        
        ArrayList lista= new ArrayList<>();
        Scanner conejo=new Scanner(System.in);
        Scanner op=new Scanner(System.in);
        
        System.out.println("Cuanto numeros desea ingresar en la lista:");
        int num1=op.nextInt();
        String[] Listaa=new  String[num1];
        System.out.println("del 0 en adelante,¿ cual es el numero maximo que desea ingresar en la lista? ");
        int max=op.nextInt();
        int num2;
        Random electo=new Random ();
        for (int i = 0; i < num1; i++) {
            num2=electo.nextInt(max);
            String num3=Integer.toString(num2);
            Listaa[i]=num3;
            System.out.println("El numero escogido es: ");
            System.out.println(Listaa[i]);
            
        }
        int tamanolista=num1;
        int pocision=tamanolista-1;
        int paro;
        /*System.out.println(tamanolista);
        System.out.println(pocision);*/
        
        if (tamanolista%2==0){paro=tamanolista/2;}else{paro=tamanolista/2+1;}
        
        int contador=1;
       for (int i = 0; i < paro; i++) {
           
           int numeroDos=pocision-i;
           int numero=Integer.parseInt(Listaa[i]);
           
           int suma=numero+numeroDos;
           System.out.println("---------------------------------------");
           System.out.println("La suma numero "+contador+" es:" + suma);
           System.out.println("---------------------------------------");
           
           contador=contador+1;
                       
        }
        
    }
    
    public static void ejercicioDos(){
        Scanner dragon=new Scanner(System.in);
        Scanner intento= new Scanner(System.in);
        String[] pollo= new String[5]; pollo[0]="p"; pollo[1]="o"; pollo[2]="l"; pollo[3]="l"; pollo[4]="o";
        String[] semaforo= new String[8]; semaforo[0]="s"; semaforo[1]="e"; semaforo[2]="m"; semaforo[3]="a"; semaforo[4]="f"; semaforo[5]="o"; semaforo[6]="r"; semaforo[7]="o";
        String[] limon= new String[5];  limon[0]="l"; limon[1]="i"; limon[2]="m"; limon[3]="o"; limon[4]="n";
        String[] pollorespuesta= new String[5];pollorespuesta[0]="_";pollorespuesta[1]="_";pollorespuesta[2]="_";pollorespuesta[3]="_";pollorespuesta[4]="_";
        String[] limonrespuesta= new String[5];limonrespuesta[0]="_";limonrespuesta[1]="_";limonrespuesta[2]="_";limonrespuesta[3]="_";limonrespuesta[4]="_";
        String[] semafororespuesta= new String[8];semafororespuesta[0]="_";semafororespuesta[1]="_";semafororespuesta[2]="_";semafororespuesta[3]="_";semafororespuesta[4]="_";semafororespuesta[5]="_";semafororespuesta[6]="_";semafororespuesta[7]="_";      
        boolean band1=true,band2=true,band3=true,band4=true,band5=true,band6=true,band7=true,band8=true;
        
        int gane=0;
        
        System.out.println("");
        System.out.println("------------------------------------------Aorcado------------------------------------------");
        System.out.println("|                                       1) Jugar                                          |");
        System.out.println("|                                       2) Salir                                          |");
        System.out.println("-------------------------------------------------------------------------------------------");
        int opctcion=dragon.nextInt();
                
        if (opctcion==1) {
            System.out.println("Para este juego se tendra 10 oportunidades para adivinar los letras de la palabra");
            System.out.println("si adivinas antes de los 10 intentos ganas, solo se admiten letras minusculas");
            System.out.println("");
            Random select=new Random();
            int electo=select.nextInt(3);
            switch(electo){
                case 0:
                  //  System.out.println("pollo");
                    
                    for (int i = 0; i < 10; i++) {
                        int intentos=i+1;
                        System.out.println("["+pollorespuesta[0].toString()+"]"+"["+pollorespuesta[1].toString()+"]"+"["+pollorespuesta[2].toString()+"]"+"["+pollorespuesta[3].toString()+"]"+"["+pollorespuesta[4].toString()+"]");
                        System.out.println("Intento "+ intentos);
                        System.out.println("Ingrese Letra:");
                        String letra= intento.nextLine();
                        if((pollo[0].equals(letra))||(pollo[1].equals(letra))||(pollo[2].equals(letra))){
                        switch(letra){
                            case "p":
                                pollorespuesta[0]="p";
                                if(band1==true){gane=gane+1;}
                                band1 = validarCasoDos(band1,letra);
                                break;
                            case "o":
                                pollorespuesta[1]="o";pollorespuesta[4]="o";
                                if(band2==true){gane=gane+2;}
                                band2 = validarCasoDos(band2,letra);
                                break;
                            case "l":
                                pollorespuesta[2]="l";pollorespuesta[3]="l";
                                if(band3==true){gane=gane+2;}
                                band3 = validarCasoDos(band3,letra);
                                break;                                
                        }
                            
                        }
                        else{
                            noExiste();
                        }
                        if (gane==5) {
                            System.out.println("");
                            System.out.println("Encontro la palabra:");
                            System.out.println("["+pollorespuesta[0].toString()+"]"+"["+pollorespuesta[1].toString()+"]"+"["+pollorespuesta[2].toString()+"]"+"["+pollorespuesta[3].toString()+"]"+"["+pollorespuesta[4].toString()+"]");
                            System.out.println("En "+intentos+" intentos.");
                            gano();
                            i=10;
                            ejercicioDos();
                        }
                        
                    }
                    if (gane!=5) {
                        perdio();
                        ejercicioDos();
                    }
                    
                    gane=0;
                    
                    break;
                case 1:
                  //  System.out.println("semaforo");
                    for (int i = 0; i < 10; i++) {
                        int intentos=i+1;
                        System.out.println("["+semafororespuesta[0].toString()+"]"+"["+semafororespuesta[1].toString()+"]"+"["+semafororespuesta[2].toString()+"]"+"["+semafororespuesta[3].toString()+"]"+"["+semafororespuesta[4].toString()+"]"+"["+semafororespuesta[5].toString()+"]"+"["+semafororespuesta[6].toString()+"]"+"["+semafororespuesta[7].toString()+"]");
                        System.out.println("Intento "+ intentos);
                        System.out.println("Ingrese Letra:");
                        String letra= intento.nextLine();
                        if((semaforo[0].equals(letra))||(semaforo[1].equals(letra))||(semaforo[2].equals(letra))||(semaforo[3].equals(letra))||(semaforo[4].equals(letra))||(semaforo[5].equals(letra))||(semaforo[6].equals(letra))){
                        switch(letra){
                            case "s":
                                semafororespuesta[0]="s";
                                if(band1==true){gane=gane+1;}
                                band1 = validarCasoDos(band1,letra);
                                break;
                            case "e":
                                semafororespuesta[1]="e";
                                if(band2==true){gane=gane+1;}
                                band2 = validarCasoDos(band2,letra);
                                break;
                            case "m":
                                semafororespuesta[2]="m";
                                if(band3==true){gane=gane+1;}
                                band3 = validarCasoDos(band3,letra);
                                break;
                            case "a":
                                semafororespuesta[3]="a";
                                if(band4==true){gane=gane+1;}
                                band4 = validarCasoDos(band4,letra);
                                break;
                            case "f":
                                semafororespuesta[4]="f";
                                if(band5==true){gane=gane+1;}
                                band5 = validarCasoDos(band5,letra);
                                break;
                            case "o":
                                semafororespuesta[5]="o";semafororespuesta[7]="o";
                                if(band6==true){gane=gane+1;}
                                band6 = validarCasoDos(band6,letra);
                                break;
                            case "r":
                                semafororespuesta[6]="r";
                                if(band7==true){gane=gane+1;}
                                band7 = validarCasoDos(band7,letra);
                                break;    
                                
                        }}
                        else{
                            noExiste();
                        }
                        if (gane==8) {
                            System.out.println("");
                            System.out.println("Encontro la palabra:");
                            System.out.println("["+semafororespuesta[0].toString()+"]"+"["+semafororespuesta[1].toString()+"]"+"["+semafororespuesta[2].toString()+"]"+"["+semafororespuesta[3].toString()+"]"+"["+semafororespuesta[4].toString()+"]"+"["+semafororespuesta[5].toString()+"]"+"["+semafororespuesta[6].toString()+"]"+"["+semafororespuesta[7].toString()+"]");
                            System.out.println("En "+intentos+" intentos.");
                            gano();
                            i=10;
                            ejercicioDos();
                        }
                        
                    }
                    if (gane!=8) {
                        perdio();
                        ejercicioDos();
                    }
                    
                    gane=0;
                    break;
                case 2:
                   // System.out.println("limon");
                    
                    for (int i = 0; i < 10; i++) {
                        int intentos=i+1;
                        System.out.println("["+limonrespuesta[0].toString()+"]"+"["+limonrespuesta[1].toString()+"]"+"["+limonrespuesta[2].toString()+"]"+"["+limonrespuesta[3].toString()+"]"+"["+limonrespuesta[4].toString()+"]");
                        System.out.println("Intento "+ intentos);
                        System.out.println("Ingrese Letra:");
                        String letra= intento.nextLine();
                        if((limon[0].equals(letra))||(limon[1].equals(letra))||(limon[2].equals(letra))||(limon[3].equals(letra))||(limon[4].equals(letra))){
                        switch(letra){
                            case "l":
                                limonrespuesta[0]="l";
                                if(band1==true){gane=gane+1;}
                                band1 = validarCasoDos(band1,letra);
                                break;
                            case "i":
                                limonrespuesta[1]="i";
                               if(band2==true){gane=gane+1;}
                                band2 = validarCasoDos(band2,letra);
                                break;
                            case "m":
                                limonrespuesta[2]="m";
                                if(band3==true){gane=gane+1;}
                                band3 = validarCasoDos(band3,letra);
                                break;
                            case "o":
                                limonrespuesta[3]="o";
                                if(band4==true){gane=gane+1;}
                                band4 = validarCasoDos(band4,letra);
                                break;
                            case "n":
                                limonrespuesta[4]="n";
                                if(band5==true){gane=gane+1;}
                                band5 = validarCasoDos(band5,letra);
                                break;
                            
                        }}
                        else{
                            noExiste();
                        }
                        if (gane==5) {
                            System.out.println("");
                            System.out.println("Encontro la palabra:");
                            System.out.println("["+limonrespuesta[0]+"]"+"["+limonrespuesta[1].toString()+"]"+"["+limonrespuesta[2].toString()+"]"+"["+limonrespuesta[3].toString()+"]"+"["+limonrespuesta[4].toString()+"]");
                            System.out.println("En "+intentos+" intentos.");
                            gano();
                            i=10;
                            ejercicioDos();
                        }
                        
                    }
                    if (gane!=5) {
                        perdio();
                        ejercicioDos();
                    }
                    
                    gane=0;
                    
                    break;
            }
        }
        if (opctcion==2) {
            menu();            
        }
    }
    
    public static void ejercicioTres(){
        ArrayList lista= new ArrayList<>();
        Scanner conejo=new Scanner(System.in);
        Scanner op=new Scanner(System.in);
        
        boolean Paro=true;      
        while (Paro){
        System.out.println("Ingrese numero: ");
        lista.add(conejo.nextDouble());
        System.out.println("Desea ingresar otro numero, 1 para si, 0 para no:");
        int ops=op.nextInt();
        //System.out.println(ops);
        
        switch(ops){
            case 0: Paro=false;break;
            case 1: Paro=true;break;
        }}
        System.out.println(lista);
        
        System.out.println("---------->     Suma de los Elementos");
        
        int pocision=lista.size();
        //System.out.println(pocision);
        
        double suma=0;
        
        for (int i = 0; i < pocision; i++) {
            double numero=Double.parseDouble(lista.get(i).toString());
            suma=suma+numero;
                                    
        }
        System.out.println(suma);
        System.out.println("---------->     Media Aritmetica");
        
        double promedio=suma/pocision;
        System.out.println(promedio);
        
        System.out.println("---------->     pares e impares en la lista");
        int pares=0;
        int impares=0;
        
        ArrayList par=new ArrayList(); 
        ArrayList impart=new ArrayList();
        
        for (int i = 0; i < pocision; i++) {
            double Pose=Double.parseDouble(lista.get(i).toString());
            if (Pose%2==0) {
                pares=pares+1;
                par.add(Pose);
                
            }
            else{
                impares=impares+1;
                impart.add(Pose);
            } 
        }
        System.out.println("Hay "+ pares + " pares en la lista.");
        System.out.println(par);
        
        System.out.println("Hay "+impares+" impares en la lista");
        System.out.println(impart);
    }
    
    public static void ejercicioCuatro(){
        boolean bandera=true;
        Scanner select= new Scanner(System.in);
        
        Scanner conejo=new Scanner(System.in);//conejo se encarga de capturar el producto
        Scanner liebre=new Scanner(System.in);//liebre de capturar precio
        Scanner raton=new Scanner(System.in);//raton de caturar la cantidad
        Scanner op=new Scanner(System.in);
        ArrayList producto= new ArrayList<>();
        ArrayList cant= new ArrayList<>();
        ArrayList precio= new ArrayList<>();
        
        
        while (bandera){ 
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("----------------------------------------------------");
            System.out.println("|             Control de articulos                 |");
            System.out.println("----------------------------------------------------");
            System.out.println("|           1) Ingreso de Producto                 |");
            System.out.println("|           2) Lista de Productos comprados        |");
            System.out.println("|           3) Calcular total a pagar              |");
            System.out.println("|           4) Salir                               |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("Escriba el numero de la opcion a la que desea entrar:");
            int opcion=select.nextInt();
        
        
            if(opcion>5){
                System.out.println("opcion invalida, intente de nuevo.");
            }
            else{
                    
            switch (opcion){
                case 1: System.out.println("--->    Agregar producto");
                    
                    boolean gato=true;
                    
                    while(gato){                    
                        System.out.println("Ingrese Nombre del Producto: ");
                        producto.add(conejo.nextLine());
                        System.out.println("Ingrese precio:");
                        precio.add(liebre.nextDouble());
                        System.out.println("Ingrese Cantidad:");
                        cant.add(raton.nextInt());
                        System.out.println("Desea ingresar otro numero, 1 para si, 0 para no:");
                        int ops=op.nextInt();
           
                        switch(ops){
                            case 0: gato=false;break;
                            case 1: gato=true;break;
                    }}
                    System.out.println(producto);
                    System.out.println(cant);
                    System.out.println(precio);
                    
                    break;
                
            case 2: System.out.println("Lista de Productos Comprados");
                    int num=    producto.size();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Producto: "+producto.get(i)+" -Cantidad: "+cant.get(i)+" -Precio: $"+precio.get(i));
                }
                    
                    break;
            case 3: System.out.println("Total");
                    double total=0;
                    int num2=    producto.size();
                    for (int i = 0; i < num2; i++) {
                        double pretcio=Double.parseDouble(precio.get(i).toString());
                        double cantt= Double.parseDouble(cant.get(i).toString());
                        double Subtotal= pretcio*cantt;
                        System.out.println("Producto: "+producto.get(i)+" -Cantidad: "+cant.get(i)+" -Precio: $"+precio.get(i));                     
                        total=total+Subtotal;                   
                }
                    System.out.println("TOTAL:                                                  $"+total);
                    
                    break;
            case 4: System.out.println("|--------------------------------------------------|");
                    System.out.println("|                Ha salido del sistema             |");
                    System.out.println("|--------------------------------------------------|");
                    bandera=false;
                    menu();
                    break;
            
        }
        }
        }
    }
      
    public static void gano(){
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("|                GANÓ                |");
        System.out.println("--------------------------------------");
        
    }
    public static void perdio(){
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("|                PERDIO              |");
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    
    public static boolean validarCasoDos(boolean bandera,String coco){
        //System.out.println("Entro al validador");
        if (bandera==true)
        {
            System.out.println("-------------------------------------------");
            System.out.println("|La letra -["+coco+"]- Se encuentra en la palabra|");
            System.out.println("-------------------------------------------");
            //contador=contador+1;
            return false;
        }else{
            System.out.println("------------------------------");
            System.out.println("|La letra ya a sido ingresada|");
            System.out.println("------------------------------");
            return false;
            }
    }

    public static void noExiste(){
        System.out.println("--------------------------------");
        System.out.println("|La letra no esta en la palabra|");
        System.out.println("--------------------------------");
    }

}
