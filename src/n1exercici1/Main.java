package n1exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scann = new Scanner(System.in);

	public static void main(String[] args) {

		String respuesta = "";
		int opcion = 0;
		String comando = "";

		Undo und = Undo.getInstancia();

		do {
			System.out.println("Ingrese una opcion: \n" + "0. Salir de la aplicaciÃ³n.\n" + "1. Introducir comando.\n"
					+ "2. Eliminar comando.\n" + "3. Mostrar comandos. \n");
			opcion = scann.nextInt();

			switch (opcion) {

			case 1:
				System.out.print("Introduzca el comando: ");
				comando = scann.next();
				und.comandos.add(comando);
				System.out.println("Se ha introducido el comando correctamente\n");
				break;

			case 2:
				System.out.print("Introduzca la posiciÃ³n del comando a eliminar (la primera posiciÃ³n es 0): ");
				opcion = scann.nextInt();
				scann.nextLine();
				und.comandos.remove(opcion);
				System.out.println("Se ha eliminado el comando correctamente\n");
				break;

			case 3:
				for (String cmds : und.getComandos()) {
					System.out.println(cmds);
				}
				System.out.println("\n");
				break;
			}

		} while (opcion != 0);
	}

}
