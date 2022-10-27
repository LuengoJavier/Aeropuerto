import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private Date fechaVuelo;
	public Avion avion;
	public ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	public ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	public Ciudad ciudadOrigen;
	public Ciudad ciudadDestino;
	public Avion getAvion() {
		return avion;
	}
	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}
	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}
	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}
	public  Date getFechaVuelo() {
		return this.fechaVuelo;
	}
	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
}