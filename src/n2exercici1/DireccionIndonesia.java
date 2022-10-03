package n2exercici1;

public class DireccionIndonesia implements IDireccion {

	String calle;

	public DireccionIndonesia(String calle) {
		super();
		this.calle = calle;
	}

	@Override
	public void add_direccion(String direccion) {

	}

	@Override
	public String toString() {
		return "DireccionIndonesia [calle=" + calle + "]";
	}

}
