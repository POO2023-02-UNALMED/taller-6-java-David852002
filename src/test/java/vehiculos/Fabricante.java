package vehiculos;



public class Fabricante {
	
	private String nombre;
	private País pais;
	
	
	public Fabricante(String nombre, País pais) {
		this.nombre = nombre;
		this.pais = pais;
		
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
