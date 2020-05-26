package boletin2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	
		String directorio = "C:\\laura\\Boletin2\\Ejercicio2\\parcelas.txt";
		
		ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
		
		crearArrayListParcelas(directorio, parcelas);
		
	}
	
	public static void crearArrayListParcelas(String dir, ArrayList<Parcela> parcelas) {
		// Creamos un ArrayList de objetos de la Clase "Parcela"
		System.out.println("Creamos un ArrayList de objetos de la Clase Parcela");
		
		// ya lo pasamos por parametro en la funcion
		//ArrayList<Parcela> parcelas = new ArrayList<Parcela>();

		//  el fichero donde estan los datos
		File fichero = new File(dir);
		

		try {
			// Leemos el contenido del fichero
			System.out.println("Leemos el contenido del fichero\n");
						
			FileReader fr;
			
			int dato;
			String path = "C:\\laura\\Boletin2\\Ejercicio2\\parcelas.txt";
			fr = new FileReader(path);
			char datoCaracter;
			String cadena ="";
			
			while  ((dato = fr.read())!=-1)
			{
				datoCaracter =((char)dato);
				
				System.out.print ( datoCaracter);
				
				//marca de separacion de registro ";", o marca de fin de fichero -1
				if (datoCaracter == ';') {  
				  // nuevo registro	
					System.out.println ("\nEsta es la cadena : "+cadena);
					
					String [] cortarCadena = cadena.split("-"); // se obtienen los datos de los registros 
					
					//constructor del objeto parcela, meto los atributos
					Parcela parcela = new Parcela(cortarCadena[0],
							Integer.parseInt(cortarCadena[1]),
							cortarCadena[2],
							cortarCadena[3], 
							Integer.parseInt(cortarCadena[4]));
					System.out.println ("Esta es la parcela : \n"+ parcela);
					// añadimos el objeto parcela al ArrayList
					parcelas.add(parcela);
					
					// se inicializa la variable cadena
					cadena = "";  
				}
				else {
					cadena = cadena + datoCaracter;
				}
			}
			//si sale por marca fin de fichero -1 hay que leer el ultimo registro
			
			System.out.println ("\nEsta es la ultima cadena : "+ cadena);
			
			String [] cortarCadena = cadena.split("-"); // se obtienen los datos de los registros 
			
			//constructor del objeto parcela, meto los atributos
			Parcela parcela = new Parcela(cortarCadena[0],
					Integer.parseInt(cortarCadena[1]),
					cortarCadena[2],
					cortarCadena[3], 
					Integer.parseInt(cortarCadena[4]));
			System.out.println ("Esta es la ultima parcela : \n"+ parcela);
			// añadimos el objeto parcela al ArrayList
			parcelas.add(parcela);
			
			
			fr.close();

		} catch (FileNotFoundException ex) {
			System.out.printf("HA ocurrido un error. No se ha encontrado fichero: %s ",ex.getMessage());
			
		} catch (IOException ex){
			System.out.printf("Ha ocurrido una excepcion indeterminada: %s", ex.getMessage());
			
			}
		

		System.out.println("Guardadas "+ parcelas.size()+" parcelas");
	}

}

