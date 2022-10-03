package n2exercici1;

import java.util.Scanner;

public class FabricaDireccion implements AbstractFactory {

	Scanner scann = new Scanner(System.in);
	String calle;
	
	@Override
	public ITelefono getTelefono(int opcion) {

		return null;
	}

	@Override
	public IDireccion getDireccion(int opcion_pais) {

		System.out.print("Introduzca la direccion: ");
		calle = scann.next();
		
		if (opcion_pais == 1) {
			return new DireccionBrasil(calle);
		} else if (opcion_pais == 2) {
			return new DireccionTokio(calle);
		} else if (opcion_pais == 3) {
			return new DireccionIndonesia(calle);
		}
		return null;

	}

}
