/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_excepcion;

import java.util.Scanner;

/**
 *
 * @author rente
 */
public class EVA3_7_USO_EXCEPCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean entero = false;

        while (!entero) {
            try {
                System.out.print("Ingrese numero entero: ");
                num = Integer.parseInt(scanner.nextLine());
                entero = true;
            } catch (NumberFormatException e) {
                System.out.println("Error ");
            }
        }

        System.out.println("Número entero: " + num);
    }
}
    
    

