package n2exercici1;

public class TelefonoIndonesia implements ITelefono {

	private String prefijo;
	private int num;

	public TelefonoIndonesia(int num) {
		super();
		this.prefijo = "+33";
		this.num = num;
	}

	@Override
	public void add_telefono(int numero) {

	}

	@Override
	public String toString() {
		return "TelefonoIndonesia [prefijo=" + prefijo + ", num=" + num + "]";
	}

}
