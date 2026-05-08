/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcasechar;

public class SwitchCaseChar {

    public static void main(String[] args) {
        String filme = "suspense";
        
        
        switch (filme){
            case "drama":
                System.out.println("Seu estilo de filme e bem comum");
                break; 
                
            case "suspense":
                System.out.println("Seu estilo de filme e muito bom");
                break; 
                
            case "acao":
                System.out.println("voce e euma pessoa bem animada em");
                break; 
                
            case "terror":
                System.out.println("Voce tem bastante coragem");
                break;
                
            default:
                 System.out.println ("digite um estilo de filme valido em letras minusculas");
                
        }
    }
}
    

