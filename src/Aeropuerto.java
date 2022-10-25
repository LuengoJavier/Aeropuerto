import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Aeropuerto {
	public ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public boolean agregarAvion(String nombre, int año) {
		Avion avion = new Avion(nombre, año);
		this.aviones.add(avion);
		return true;
	}

	public void VisualizarAviones() {

	}

	public List<Avion> getAviones() {
		return this.aviones;
	}

	public Pasajero buscarPasajerosFecha(Date fecha) {
		for(Pasajero pasajero : this.pasajeros){

		}
	}

	public List<Pasajero> buscarPasajerosVuelo(Vuelo vuelo) {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajeroCovid() {
		throw new UnsupportedOperationException();
	}
}