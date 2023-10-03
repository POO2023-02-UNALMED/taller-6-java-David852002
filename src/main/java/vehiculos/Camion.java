package vehiculos;

public class Camion extends Vehículo{
	
	private int ejes;
	private static int cantidadCamiones;
	
	public Camion(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante, int ejes) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.placa= placa;
		this.ejes=ejes;
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.traccion = "4X2";
		this.nombre= nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		cantidadCamiones++;

	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}

	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}
	
}
