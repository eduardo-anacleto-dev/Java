/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classewhile;

import java.util.Scanner;
public class ClasseWhile {



    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Digite um sua idade");
        int idade = scanner.nextInt();
    
     System.out.println ("Voce digitou " + idade);
     
     int anos = 18 - idade;
     
     while (idade < 18){
        System.out.println("voce ainda tem " + idade + " anos de idade, faltam " + anos + " para voce se tornar maior de idade");
        
        idade++;
        anos --;
    }
     
     if (idade >= 18)
         System.out.println("Finalmente voce e de maior!");
    }
    
}
