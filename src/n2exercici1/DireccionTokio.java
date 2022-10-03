package n2exercici1;

public class DireccionTokio implements IDireccion {

	String calle;

	public DireccionTokio(String calle) {
		super();
		this.calle = calle;
	}

	@Override
	public void add_direccion(String direccion) {

	}

	@Override
	public String toString() {
		return "DireccionTokio [calle=" + calle + "]";
	}

}
