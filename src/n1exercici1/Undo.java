package n1exercici1;

import java.util.ArrayList;

public class Undo {

	private static Undo instancia;
	ArrayList<String> comandos = new ArrayList<String>();

	private Undo() {

	}

	public static Undo getInstancia() {
		if (instancia == null) {
			instancia = new Undo();

		}
		return instancia;
	}

	public ArrayList<String> getComandos() {
		return comandos;
	}

	public void setComandos(String comando) {
		this.comandos.add(comando);
	}

}
