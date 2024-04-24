/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_unchecked_exceptions;

/**
 *
 * @author rente
 */
public class EVA3_2_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NULLPOINTEREXCEPTIONS:
        //Cuando queremos usar un objeto que no existe.
        /*Persona persona= null;
        System.out.println(persona.toString());*/
        
        //INDEXOUTOFBOUNDSEXCEPTION: ERROR DE ARREGLOS
        //LEER UNA POSICION QUE NO EXISTE;
        
        /*int arreglo[]=new int[10]; //N=10
        //0 es la primera posicion, n-1 es la ultima (9)
        arreglo[15]=100;*/
        
        //AritmethicException: Division entre cero
        int x=10, y=0;
        int resu= x/y;
        System.out.println(resu);
        
        /*class Persona{
            
        }*/
    }
    
}
