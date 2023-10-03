package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fabricante {
	
	private String nombre;
	private País pais;
	private static HashMap<Fabricante, Integer> contador = new HashMap<>();
	
	public Fabricante(String nombre, País pais) {
		this.nombre = nombre;
		this.pais = pais;
		
		
	}
	public static void incrementarContador(Fabricante fabricante) {
		if (contador.containsKey(fabricante)) {
			contador.put(fabricante, contador.get(fabricante) + 1);
			Pais.incrementarContador(fabricante.getPais());
	    } else {
	    	contador.put(fabricante, 1);
	    }
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante maxFab = null;
	    int maxCont = 0;
	    for (Fabricante fab : contador.keySet()) {
	    	if (contador.get(fab) > maxCont) {
	    		maxFab = fab;
	        	maxCont = contador.get(fab);
	    	}
	    }
	    return maxFab;
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
