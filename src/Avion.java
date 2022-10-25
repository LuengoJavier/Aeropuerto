import java.util.ArrayList;

public class Avion {
	private String nombre;
	private int año;
	public Aeropuerto aeropuerto;
	public ArrayList<Vuelo> vuelo = new ArrayList<Vuelo>();

	public Avion(String nombre, int año) {
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