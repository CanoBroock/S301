package n2exercici1;

public class TelefonoTokio implements ITelefono {

	private String prefijo;
	private int num;

	public TelefonoTokio(int num) {
		super();
		this.prefijo = "+97";
		this.num = num;
	}

	@Override
	public void add_telefono(int numero) {

	}

	@Override
	public String toString() {
		return "TelefonoTokio [prefijo=" + prefijo + ", num=" + num + "]";
	}

}
