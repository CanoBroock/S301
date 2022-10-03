package n2exercici1;

public class Creaccion {

	public static AbstractFactory getFactory(int opcion) {
		if (opcion == 1) {
			return new FabricaTelefono();
		} else if (opcion == 2) {
			return new FabricaDireccion();
		}
		return null;
	}

}
