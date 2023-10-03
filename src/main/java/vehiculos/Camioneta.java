package vehiculos;

public class Camioneta extends Vehículo{
	
	private boolean volco;
	private static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante, boolean volco) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.placa= placa;
		this.volco = volco;
		this.puertas = puertas;
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		this.nombre= nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		cantidadCamionetas++;

	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}
	
}
