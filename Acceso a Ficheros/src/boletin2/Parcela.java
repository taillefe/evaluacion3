package boletin2;

public class Parcela {
	
	private String calle;
	private int numero;
	private String poblacion;
	private String provincia;
	private int metrosCuadrados;
	
	
	public Parcela(String calle, int numero, String poblacion,
					String provincia, int metrosCuadrados) {
		this.calle = calle;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.metrosCuadrados = metrosCuadrados;
	}
	
	
	
	public String getCalle() {
		return calle;
		
	}
	public int getNumero() {
		return numero;
		
	}
	public String getPoblacion() {
		return poblacion;
		
	}
	public String getProvincia() {
		return provincia;
		
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
		
	}
	
	@Override
	public String toString() {
		return String.format("Calle:%s\nNumero:%s\nPoblacion:%s\nProvincia:%s\nMetrosCuadrados:%s",
							calle,numero,poblacion, provincia, metrosCuadrados);
		
	}
}
