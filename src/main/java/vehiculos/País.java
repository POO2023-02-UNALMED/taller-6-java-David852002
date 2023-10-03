package vehiculos;

import java.util.*;

public class País {

		private String nombre;
		private HashMap<País, Integer> contador = new ArrayList<>();
		
		
		public País(String nombre) {
			this.nombre = nombre;
		}
		
		public static void incrementarContador(Pais pais) {
			if (contador.containsKey(pais)) {
				contador.put(pais, contador.get(pais) + 1);
			} else {
				contador.put(pais, 1);
			}
		}
		
		public static Pais paisMasVendedor() {
			Pais maxPais = null;
			int maxCont = 0;
			for (Pais pais : contador.keySet()) {
				if (contador.get(pais) > maxCont) {
					maxPais = pais;
			        maxCont = contador.get(pais);
			    }
			}
			return maxPais;
		}
	}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
