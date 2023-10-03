package vehiculos;

import java.util.HashMap;

public class Fabricante {
	
	private String nombre;
	private País pais;
	
	
	public Fabricante(String nombre, País pais) {
		this.nombre = nombre;
		this.pais = pais;
		
	}
	
	public Fabricante fabricaMayorVentas() {
		
		int contador = 0;
		HashMap<País, Integer> paises = new HashMap<>();
		for(País x : listado) {
			if(paises.containsKey(x)) {
				contador++;
			}
			else{
				paises.put(x,1);
			}
			
			
			int repeticiones = 0;
			for(País l : paises.keySet()) {
				if(repeticiones<paises.get(l)) {
					paisMasRepetido = l;
					repeticiones = paises.get(l);
				}
			}
		}
		
		return paisMasRepetido;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public País getPais() {
		return pais;
	}

	public void setPais(País pais) {
		this.pais = pais;
	}

}
