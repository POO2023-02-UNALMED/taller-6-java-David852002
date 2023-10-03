package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fabricante {
	
	private String nombre;
	private País pais;
	private List<Fabricante> listado = new ArrayList<>();
	private int fabricanteMasRepetido;
	
	public Fabricante(String nombre, País pais) {
		this.nombre = nombre;
		this.pais = pais;
		listado.add(this);
		
	}
	
	public Fabricante fabricaMayorVentas() {
		
		int contador = 0;
		HashMap<Fabricante, Integer> fabricantes = new HashMap<>();
		for(Fabricante x : listado) {
			if(fabricantes.containsKey(x)) {
				contador++;
			}
			else{
				fabricantes.put(x,1);
			}
			
			
			int repeticiones = 0;
			for(Fabricante l : fabricantes.keySet()) {
				if(repeticiones<fabricantes.get(l)) {
					fabricanteMasRepetido = l;
					repeticiones = fabricantes.get(l);
				}
			}
		}
		
		return fabricanteMasRepetido;
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
