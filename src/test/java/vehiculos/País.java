package vehiculos;

import java.util.*;

public class País {

		private String nombre;
		private List<País> listado = new ArrayList<>();
		private País paisMasRepetido;
		
		public País(String nombre) {
			this.nombre = nombre;
			listado.add(this);
		}
		
		public País paisMasVendedor() {
			
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
}
