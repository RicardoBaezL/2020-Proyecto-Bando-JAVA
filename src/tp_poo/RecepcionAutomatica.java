package tp_poo;

import java.util.Scanner;

public class RecepcionAutomatica {

	private boolean estadoActivo;
	private int numeroSucursal;
	private int id;
	private int dniCliente;

	Scanner in = new Scanner(System.in);

	public RecepcionAutomatica(boolean estadoActivo, int numeroSucursal, int id, int dniCliente) {
		this.estadoActivo = estadoActivo;
		this.numeroSucursal = numeroSucursal;
		this.id = id;
		this.dniCliente = dniCliente;
	}

	void pedirDni(RecepcionAutomatica recepcionistaAutomatica) {
		System.out.println("Bienvenido a su asistente automatico, por favor ingrese su DNI");

		dniCliente = in.nextInt();
		System.out.println("DNI ingresado: " + dniCliente);

	}

	public int getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(int dniCliente) {
		this.dniCliente = dniCliente;
	}

}
