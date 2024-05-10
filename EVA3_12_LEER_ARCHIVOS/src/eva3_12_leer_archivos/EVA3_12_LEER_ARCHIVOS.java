/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author rente
 */
public class EVA3_12_LEER_ARCHIVOS {
    final static String miRuta = "C:\\archivos\\archivo_texto";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            leerArchivoFiles(miRuta);
            leerArchivoBuffered(miRuta);
            leerArchivoFileReader(miRuta);
            leerArchivoScanner(miRuta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
     public static void leerArchivoFiles(String ruta) throws IOException{
        System.out.println("Lectura de archivos de texto con clase file******************************");
        Path path = Paths.get(ruta);//crea una ruta de tipo path
        byte[] datos = Files.readAllBytes(path);//genera una IOExeption
       //new string comvierte el arreglo de byte a linea de texto
        System.out.println(new String (datos));
        
                
                
                
    }
    /*
    Es adecuado para leer archivos grandes
    Nos permite procesar archivos de texto linea por linea
    Es adecuado para la multitarea (hilos de ejecución)
    
    
    */
    public static void leerArchivoBuffered(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lectura de archivo de texto con Buffered**********************");
        //Abrir el archivo
        //Leer el archivo como informacion binaria
        //Convertir la informacion binaria a texto
        
        File file= new File(ruta);
        FileInputStream in = new FileInputStream(file);
        InputStreamReader reader= new InputStreamReader(in);
        BufferedReader br=new BufferedReader(reader);
        
        String cade;
        //Asignamos la linea a la variable cade
        //Si cade es diferente de null, estamos leyendo textp
        //Si leemos null, llegamos al final del archivo
        while((cade = br.readLine())!=null){
            System.out.println(cade);
        }
    }
    
    
    public static void leerArchivoFileReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lectura de archivo FileReader********************************");
        File file= new File(ruta);
        FileReader reader =new FileReader(file);
        BufferedReader br=new BufferedReader(reader);
        
        String cade;
        //Asignamos la linea a la variable cade
        //Si cade es diferente de null, estamos leyendo textp
        //Si leemos null, llegamos al final del archivo
        while((cade = br.readLine())!=null){
            System.out.println(cade);
        }
    }
    
    public static void leerArchivoScanner(String ruta) throws IOException{
        System.out.println("Lectura de archivo Scanner********************************");
        Path path= Paths.get(ruta);
        Scanner leer = new Scanner(path);
        while(leer.hasNextLine()){
            String cade=leer.nextLine();
            System.out.println(cade);
        }
        leer.close();

    }
    
}
