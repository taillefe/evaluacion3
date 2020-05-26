package boletin2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// crear el fichero ejercicio1.txt
		String directorio="C:\\laura\\Boletin2\\Ejercicio1";
		String archivo ="\\ejercicio.txt";
		crearFichero(directorio, archivo);
		
		
		//escribir en el fichero ejercicio1.txt
		escribirFichero("Prueba de escritura en fichero", directorio, archivo);
		
		
		//leer el contenido del fichero y mostrarlo por pantalla
		leerFichero(directorio, archivo);
		
	}//main
	
	public static void crearFichero(String dir, String arch) {
		try {
		
			File f = new File(dir);
			f.mkdir();
			String ejercicio = dir + arch;
			File fichero = new File(ejercicio);

			try {
			 // A partir del objeto File creamos el fichero físicamente
			 if (fichero.createNewFile())
			   System.out.println("El fichero se ha creado correctamente");
			 else
			   System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
			   ioe.printStackTrace();
			}
			
			
		} catch (Exception ex) {
			System.out.println("Error inesperado en la creación de los directorios");
			ex.printStackTrace();
		}
	}//crearfichero
	
	
	

	public static void escribirFichero(String cadena, String dir, String arch) {
		FileWriter fw;
		try {
			String path=dir + arch;
			fw= new FileWriter(path);
			fw.write (cadena);
			fw.flush();
			fw.close();
		}catch (FileNotFoundException ex) {
			System.out.printf("\n Ha ocurrido un error. No se ha encontrado el fichero:\n%s", ex.getMessage());
			
		}catch (IOException ex) {
			System.out.printf("\n Ha ocurrido una exceptción indeterminada:\n%s", ex.getMessage());
			
		}
	}// escribirfichero
	
	
	public static void leerFichero(String dir, String arch) {
		FileReader fr;
		try {
			int dato;
			String path=dir + arch;
			fr = new FileReader(path);
			System.out.println("Contenido del fichero : ");
			while((dato=fr.read())!=-1) {
				System.out.print((char)dato);
			}
			fr.close();
		}catch (FileNotFoundException ex) {
			System.out.printf("\n Ha ocurrido un error. No se ha encontrado el fichero:\n%s", ex.getMessage());
			
		}catch (IOException ex) {
			System.out.printf("\n Ha ocurrido una exceptción indeterminada:\n%s", ex.getMessage());
			
		}
	
	} // leerfichero
	
}//class
