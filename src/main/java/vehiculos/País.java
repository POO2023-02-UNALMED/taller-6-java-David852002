package vehiculos;


import java.util.HashMap;

public class País {
	private String nombre;
	private static HashMap<País, Integer> contador = new HashMap<>();
	
	public País(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void incrementarContador(País pais) {
		if (contador.containsKey(pais)) {
			contador.put(pais, contador.get(pais) + 1);
		} else {
			contador.put(pais, 1);
		}
	}
	
	public static País paisMasVendedor() {
		País maxPais = null;
		int maxCont = 0;
		for (País pais : contador.keySet()) {
			if (contador.get(pais) > maxCont) {
				maxPais = pais;
		        maxCont = contador.get(pais);
		    }
		}
		return maxPais;
	}
}