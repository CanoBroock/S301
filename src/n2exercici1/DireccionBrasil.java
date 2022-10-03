package n2exercici1;

public class DireccionBrasil implements IDireccion {

	String calle;

	public DireccionBrasil(String calle) {
		super();
		this.calle = calle;
	}

	@Override
	public void add_direccion(String direccion) {

	}

	@Override
	public String toString() {
		return "DireccionBrasil [calle=" + calle + "]";
	}

}
