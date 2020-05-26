package boletin2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Ejercicio3 {

	public static void main(String[] args) {
		
		String directorio1 = "C:\\laura\\Boletin2\\Ejercicio3\\parcelas1.txt";
		String directorio2 = "C:\\laura\\Boletin2\\Ejercicio3";
		String archivo2 = "\\parcelas2.txt";
		ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
		
		//creaamos el ArrayList a partir del fichero parcelas1.txt
		Ejercicio2.crearArrayListParcelas(directorio1, parcelas);
		
		//creamos el fichero parcelas2.txt para grabar el contenido del ArrayList
		Ejercicio1.crearFichero(directorio2, archivo2);
		
		//escribir en el fichero parcelas2.txt, la cadena creada desde el ArrayList
		String cadena ="";
		
		
		for (int i=0; i < parcelas.size(); i++ ) {
					
				Parcela par = parcelas.get(i);
				
				
				cadena = cadena + par.getCalle()+"-"+
						par.getNumero()+"-"+
						par.getPoblacion()+"-"+
						par.getProvincia()+"-"+
						par.getMetrosCuadrados()+";";
			
		}
		
		Ejercicio1.escribirFichero(cadena, directorio2, archivo2);

				
		//leer el contenido del fichero y mostrarlo por pantalla
		Ejercicio1.leerFichero(directorio2, archivo2);
		
	
	}

	
}
