import java.util.ArrayList;

public class Avion {
	private String nombre;
	private int año;
	public Aeropuerto aeropuerto;
	public ArrayList<Vuelo> vuelos;

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public ArrayList<Vuelo> getVuelos() {
		return vuelos;
	}

	public Avion(String nombre, int año) {
		this.nombre= nombre;
		this.año=año;
		this.vuelos= new ArrayList<Vuelo>();
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAño() {
		return this.año;
	}
	public void setAño(int año) {
		this.año = año;
	}
}