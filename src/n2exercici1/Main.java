package n2exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		int opcion = 0;
		int opcion_pais = 0;
		int telefono = 0;
		String direccion = "";

		System.out.println("Indica si quieres añadir un teléfono o una direccion: \n" + "1. Teléfono .\n"
				+ "2. Dirección.\n" + "3. Salir\n");
		opcion = scann.nextInt();

		switch (opcion) {
		case 1:
			AbstractFactory fab_telf = Creaccion.getFactory(opcion);

			System.out.println("Indica un pais: \n" + "1. Brasil .\n" + "2. Tokio.\n" + "3. Indonesia. \n");
			opcion_pais = scann.nextInt();

			switch (opcion_pais) {
			case 1:
				ITelefono tlfBr = fab_telf.getTelefono(opcion_pais);
				System.out.println(tlfBr);
				break;

			case 2:
				ITelefono telfTk = fab_telf.getTelefono(opcion_pais);
				System.out.println(telfTk);
				break;

			case 3:
				ITelefono telfInd = fab_telf.getTelefono(opcion_pais);
				System.out.println(telfInd);
				break;
			}
			break;

		case 2:
			AbstractFactory fab_direcc = Creaccion.getFactory(opcion);

			System.out.println("Indica un pais: \n" + "1. Brasil .\n" + "2. Tokio.\n" + "3. Indonesia. \n");
			opcion_pais = scann.nextInt();

			switch (opcion_pais) {
			case 1:
				IDireccion dirBr = fab_direcc.getDireccion(opcion_pais);
				System.out.println(dirBr);
				break;

			case 2:
				IDireccion dirTk = fab_direcc.getDireccion(opcion_pais);
				System.out.println(dirTk);
				break;

			case 3:
				IDireccion dirInd = fab_direcc.getDireccion(opcion_pais);
				System.out.println(dirInd);
				break;
			}
			break;

		}

	}
}
