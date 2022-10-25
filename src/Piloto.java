import java.util.ArrayList;

public class Piloto extends Persona {
	private String rut;
	private String idPiloto;
	public ArrayList<Vuelo> vuelosInscritos = new ArrayList<Vuelo>();

	public String getRut() {
		return this.rut;
	}

	public String getIdPiloto() {
		return this.idPiloto;
	}
}