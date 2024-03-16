/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author misael.perilla
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int entero=-2147483647;// Numero entero 2^32 
        float flotante=43.3232313123123123232f;//Numero entero 2^32 entero y 32 decimales
        double doble=43.3232313123123123232;//Numero entero 2^64 entero y 64 decimales
        char caracter='@';//
        boolean booleano=true;//
        short corto;//Numero entero 2^16 
        long largo;//Numero entero 2^64 
        
        //COMENTARIOS de una LINEA
        
        String arregloNombres []= {"Alberto","Benito","Camila","Daniela"};
        
        
/*        
        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo");
        int tamano=lectorTeclado.nextInt();
        String listado[]= new String[tamano];
        
        for (int si=0;si<tamano;si++){
            System.out.println("Digite el nombre:");
            listado[si]=lectorTeclado.next();
        }
        
        System.out.print("\nLos datos en el arreglo son [");
        for (int si=0;si<tamano;si++){
            System.out.print(listado[si]+",\t");
        }
        System.out.println("]");
  */      
        
        System.out.println("flotante:" +flotante);
        System.out.println("doble:" +doble);
        
        
    }
}
