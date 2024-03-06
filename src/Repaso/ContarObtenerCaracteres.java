/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso;

import java.util.Scanner;

public class ContarObtenerCaracteres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //mayusculas, minusculas, espacios, numeros y letras.
        String cadena;

        System.out.println("Ingresa una cadena: ");
        cadena = entrada.nextLine();

        String mayus = "";
        String minus = "";
        String numeros = "";
        String letras = "";
        String espacios="";

        int n_mayus = 0;
        int n_minus = 0;
        int n_numeros = 0;
        int n_letras = 0;
        int n_espacios=0;
     

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
               n_letras++;
               letras += cadena.charAt(i);
            }
            
            if (Character.isUpperCase(cadena.charAt(i))) {
                n_mayus++;
                mayus+=cadena.charAt(i);
            }
            if (Character.isLowerCase(cadena.charAt(i))) {
                n_minus++;
                minus+=cadena.charAt(i);
            }
            if (Character.isDigit(cadena.charAt(i))) {
                n_numeros++;
                numeros+=cadena.charAt(i);
            }
            if (Character.isSpaceChar(cadena.charAt(i))) {
                n_espacios++;
                
            }
        }
        System.out.println("Mayusculas("+n_mayus+")"+mayus);
        System.out.println("Minusculas("+n_minus+")"+minus);
        System.out.println("Numeros("+n_numeros+")"+numeros);
        System.out.println("Espacios("+n_espacios+")"+n_espacios);
        
        System.out.println(Character.isBmpCodePoint('j'));

    }
}


