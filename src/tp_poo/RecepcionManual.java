package tp_poo;

import java.util.Scanner;

public class RecepcionManual {
	private String nombre;
	private String apellido;
	private int dni;
	private int legajo;
	private int dniCliente;

	Scanner in = new Scanner(System.in);

	public RecepcionManual(String nombre, String apellido, int dni, int legajo, int dniCliente) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
		this.dniCliente = dniCliente;
	}

	void pedirDni(RecepcionManual recepcionistaManual) {
		System.out.println("Bienvenido, por favor muéstreme su DNI para continuar");
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
