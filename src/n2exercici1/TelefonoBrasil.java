package n2exercici1;

public class TelefonoBrasil implements ITelefono {

	private String prefijo;
	private int num;

	public TelefonoBrasil(int num) {
		super();
		this.prefijo = "+55";
		this.num = num;
	}

	@Override
	public void add_telefono(int numero) {

	}

	@Override
	public String toString() {
		return "TelefonoBrasil [prefijo=" + prefijo + ", num=" + num + "]";
	}

}
