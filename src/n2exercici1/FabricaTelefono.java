package n2exercici1;

import java.util.Scanner;

public class FabricaTelefono implements AbstractFactory {

	Scanner scann = new Scanner(System.in);
	int telefono = 0;

	@Override
	public ITelefono getTelefono(int opcion_pais) {

		System.out.print("Introduzca el número de teléfono: ");
		telefono = scann.nextInt();

		if (opcion_pais == 1) {
			return new TelefonoBrasil(telefono);
		} else if (opcion_pais == 2) {
			return new TelefonoTokio(telefono);
		} else if (opcion_pais == 3) {
			return new TelefonoIndonesia(telefono);
		}
		return null;
	}

	@Override
	public IDireccion getDireccion(int opcion) {

		return null;
	}

}
