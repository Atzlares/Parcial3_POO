/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_escribir_archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author rente
 */
public class EVA3_13_ESCRIBIR_ARCHIVO {
    
    final static String miRuta = "C:\\archivos\\";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            escribirFiles(miRuta+"files.txt","Hola mundo!\n"+"Prueba con la clase Files.");
            escribirWriter(miRuta+"fileWriter.txt","Hola de nuevo\n"+"Segunda prueba con FileWriter");
            escribirBufferedWriter(miRuta+"fileBuffered.txt","Hola por tercera vez\n"+"Tercera prueba con BufferedWriter");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
        
        //Class files
    public static void escribirFiles(String ruta, String datos) throws IOException{
            Path path = Paths.get(ruta); //abrir el archivo
            Files.write(path, datos.getBytes());
    }
    
    public static void escribirWriter(String ruta, String datos) throws IOException{
        File file =new File(ruta);
        FileWriter fileWriter= new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    
    public static void escribirBufferedWriter(String ruta, String datos) throws IOException{
        File file =new File(ruta);
        FileWriter fileWriter= new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fileWriter);
        bw.write(datos);
        bw.close();
    }
}
