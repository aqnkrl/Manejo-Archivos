import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ManipulacionArchivos{

    public static void leerArchivo(String fileName){
        File file;//Apunta a un archivo fisico en el disco duroR
        FileReader reader;//LLave con permisos de solo lectura hacia el archivo
        BufferedReader bufer;//Recuperar informacion del archivo
        String line;

        try{
            //Crear un apuntador al archivo fisico
            System.out.println("fileName" + fileName);
            file = new File("C:\\archivos\\" + fileName + ".txt");
            //Abrir el archivo para lectura
            reader = new FileReader(file);
            //Configurar el bufer para leer los datos del archivo
            bufer = new BufferedReader(reader);
            while((line = bufer.readLine()) != null){
                System.out.println("Linea leída: " + line);
            }
            reader.close();

        }catch (Exception e ){
            System.out.println("Error al eer el archivo: " + e.toString());
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de archivos de texto");
        System.out.println("Escribe el nombre del archivo:");
        fileName = bufer.readLine();
        leerArchivo(fileName);


        
    }
}