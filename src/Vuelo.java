import java.util.ArrayList;
import java.util.Date;
public class Vuelo {
	private Date fechaVuelo;
	public Avion avion;
	public ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	public ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	public Ciudad ciudadOrigen;
	public Ciudad ciudadDestino;

	public  Date getFechaVuelo() {
		return this.fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
}