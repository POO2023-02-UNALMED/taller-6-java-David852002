package vehiculos;

public class Automóvil extends Vehículo{
	private int puestos;
	private static int cantidad;
	
	public Automóvil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		cantidad++;
		
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int getCantidad() {
		return cantidad;
	}
}