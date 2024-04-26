/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rente
 */
public class EVA3_6_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner captu=new Scanner(System.in);
        System.out.println("Introduce el numerador: ");
        int nume=captu.nextInt();
        System.out.println("Introduce el denominador: ");
        int divi=captu.nextInt();
        int resu=0;
        resu=nume/divi;
        System.out.println("Resultado= "+resu);
        
    }catch(Exception e){
        e.printStackTrace();
    }
        
        System.out.println("Fin del programa ");
    }
    
}
